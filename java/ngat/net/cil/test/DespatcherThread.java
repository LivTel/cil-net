package ngat.net.cil.test;

import ngat.util.*;
import ngat.util.logging.*;
import ngat.net.cil.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class DespatcherThread extends ControlThread {

    // TODO Replace polling with a signalling system on the message queue and
    // timeouts.

    /** Default polling interval (ms). */
    public static final long POLLING_INTERVAL = 500L;

    /** The list of messages queued for despatch. */
    private List messages;

    /**
     * A mapping from CIL UDP packet sequence number to a container holding:-
     * <ul>
     * <li> A reference to the ResponseHandler.
     * <li> The timeout length (ms).
     * <li> The expiry time for the handler.
     * </ul>
     */
    private Map registry;

    /** How often the despatcher should poll (ms). */
    long pollingInterval;

   LogGenerator logger;

    /**
     * Create a DespatcherThread on the message quueue and registry.
     * 
     * @param messages
     *            Pre-built message queue.
     * @param registry
     *            Pre-built response-handler registry.
     */
    public DespatcherThread(List messages, Map registry) {
	super("DESPATCH_THREAD", true);
	this.messages = messages;
	this.registry = registry;

	pollingInterval = POLLING_INTERVAL;

	Logger alogger = LogManager.getLogger("CIL");
		logger = alogger.generate()
		    .system("CIL").subSystem("Server")	
		    .srcCompClass(this.getClass().getName())
		    .srcCompId("Despatch");

    }

    /** Setup CIL_ProxyReader DespatchThread. */
    public void initialise() {
    }

    /**
     * Read message from queue and pass on to the relevant handlers. If a
     * message is errored we cant do much about it as we dont know who it was
     * for or what it is. Its originator (a CIL_ProxyHandler) should notice it
     * hasn't arrived at some point and get upset.
     */
    public void mainTask() {

	try {
	    Thread.sleep(pollingInterval);
	} catch (InterruptedException ix) {	  
	    	logger.create().info().level(3).extractCallInfo()
		    .msg("Interrupted polling message queue").send();
	}

	CilMessage message = null;

	// Read from the MessageQueue.
	while (messages.size() != 0) {

	    message = (CilMessage) messages.remove(0);

	    // Unpack the content.
	    int seqNo = message.getSequenceNo();
	    int txId = message.getTxId();
	    int rxId = message.getRxId();
	    int mClass = message.getMessageClass();
	    int sClass = message.getServiceClass();
	    String data = message.getData().trim();

	    logger.create().info().level(3).extractCallInfo()
		.msg("Pulled message: Class: " + mClass
		     + ", SN: " + seqNo).send();

	    logger.create().info().level(1).
		msg("")
		.send();

	    // Request the handler for this sequence no.
	    CilTimeoutContainer container = (CilTimeoutContainer) registry.get(new Integer(seqNo));
	    if (container == null) {
	
		logger.create().info().level(3).extractCallInfo()
		    .msg("No container found for message: SN:" + seqNo
			 + " - ignoring").send();
		
		continue;
	    }
	    CilResponseHandler handler = container.getResponseHandler();

	    if (handler == null) {
	
		logger.create().info().level(3).extractCallInfo()
		    .msg("No handler found for message: SN:" + seqNo
			 + " - ignoring").send();

		continue;
	    }

	    logger.create().info().level(3).extractCallInfo()
		.msg("Received message: SN:" + seqNo + ", Class: "
		     + CilMessage.toMClassString(mClass) + ", For Handler: " + handler).send();
	    

	    // Only remove the registry entry if its DONE or ERROR class, i.e.
	    // keep
	    // handler if its ACTION class.
	    if (mClass == CilMessage.DONE_CLASS || mClass == CilMessage.ERROR_CLASS) {

		registry.remove(new Integer(seqNo));
	
		logger.create().info().level(3).extractCallInfo()
		    .msg("Remove item ID seq (" + seqNo + ") from registry: RQ="
			 + registry.size()).send();
		
	    }

	    try {

		switch (message.getMessageClass()) {
		case CilMessage.ACTION_CLASS:
		case CilMessage.ACK_CLASS:
		    logger.create().info().level(1)
			.msg("CIL_ACTION "+seqNo)
			.send();
		    handler.actioned();
		    break;
		case CilMessage.DONE_CLASS:
		case CilMessage.RESPONSE_CLASS:
		    logger.create().info().level(1)
                        .msg("CIL_DONE "+seqNo+" ["+data+"]")
                        .send();

		    handler.completed(data);
		    break;
		case CilMessage.ERROR_CLASS:				
		    //This is where we extract the error code.		
		    int errNo = 0;
		    if (data.startsWith("<<09")) {
			int end = data.indexOf(">");
			String strErr = data.substring(2,end);						
			try {
				// CIL error code is hexadecimal
				errNo = Integer.parseInt(strErr, 16); 
			} catch (Exception nx) {
			    nx.printStackTrace();
			    errNo = 1;
			}
		    }
		    logger.create().info().level(1)
                        .msg("CIL_ERROR "+seqNo+" ["+data+"]")
			.send();
		    handler.error(errNo, data);
		    break;
		default:
		}
		
		logger.create().info().level(3).extractCallInfo()
		    .msg("Completed processing of message: SN:" + seqNo
			 + ", Class: " + CilMessage.toMClassString(mClass)).send();
		
	    } catch (Exception e) {
	
		logger.create().error().level(2).extractCallInfo()
		    .msg("Error during handling of message: SN:" + seqNo
			 + " : " + e).send();

		e.printStackTrace();
	    }
	}
		
	// Check for any timeed out handlers.
	long now = System.currentTimeMillis();

		logger.create().info().level(2).extractCallInfo()
		    .msg("Checking Registry, size: "+registry.size()).send();


	synchronized(registry) {
	    Iterator containers = registry.values().iterator();
	    while (containers.hasNext()) {
		CilTimeoutContainer container = (CilTimeoutContainer) containers.next();
		//logger.log(1, "CILDespatcher", "-", "-", "CILDespatcher:: Extracted container: "+container);
		
		if (container.getExpiry() < now) {
		    CilResponseHandler handler = container.getResponseHandler();
		    try {
			containers.remove();
		
			logger.create().info().level(3).extractCallInfo()
			    .msg("Removed container, notify timeout to  response handler").send();


			handler.timedout("Timed out waiting cil reply after: " + container.getTimeout()+" ms, overrun by "+
					 (System.currentTimeMillis() - container.getExpiry())+"ms");
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		}
	    }
	}
    }

    public void shutdown() {
	logger.create().info().level(3).extractCallInfo()
	    .msg("Shutting down").send();
    }

}
