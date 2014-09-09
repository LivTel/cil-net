package ngat.net.cil.tcs;

import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;

import ngat.message.RCS_TCS.TCS_Status;
import ngat.net.cil.CilResponseHandler;
import ngat.net.cil.CilService;
import ngat.util.CommandTokenizer;
import ngat.util.ConfigurationProperties;
import ngat.util.ControlThread;

public class CilStatusCollator extends ControlThread {

    /** Status request timeout (ms). */
    public static final long TIMEOUT = 10000L;

    private CollatorResponseListener listener;

    /** Status category ID. */
    private String cat;

    /** The CIL service to use for collecting status info. */
    private CilService cil;

    /** Stores the latest status. */
    private TCS_Status.Segment status;

    /** True if the status is valid. */
    public boolean valid = false;

    /** How long between requests. */
    private long interval;

    /**
     * Create a new CilStatusCollator.
     * @param scope The telescope instance to update.
     * @param cat The category of status to collect.
     * @param cil A CIL service.
     * @param interval How long between requests.
     */
    public CilStatusCollator(CollatorResponseListener listener, String cat, CilService cil, long interval) {
	super(cat + "-Collator", true);
	this.listener = listener;
	this.cat = cat;
	this.cil = cil;
	this.interval = interval;
	System.err.println("CilCollator: "+cat+" using: "+cil);
    }

    protected void initialise() {
	// for various reasons we make a delay at the start before we start looping...
	try {
	    // lets vary the repeat interval a tad...
	    long dint = (long)(Math.random()*((double)interval/2.0));
	    Thread.sleep(interval + dint);
	} catch (InterruptedException ix) {
	}
    }

    protected void mainTask() {
	//    	System.err.println("CilCollator: "+cat+": send message..."); 

	try {
	    CollatorResponseProcessor handler = new CollatorResponseProcessor(listener, cat);
	    cil.sendMessage("SHOW " + cat, handler, TIMEOUT);
	} catch (Exception ex) {
	    ex.printStackTrace();
	    valid = false;
	}

	// loop round,
	try {
	    // lets vary the repeat interval a tad...
	    long dint = (long)(Math.random()*((double)interval/10.0));
	    Thread.sleep(interval+dint);
	} catch (InterruptedException ix) {
	}
    }

    protected void shutdown() {
	// TODO Auto-generated method stub

    }

    /**
     * Create a CilStatusCollator on a specified category using named CilService
     * at specified interval.
     */
    public static void main(String args[]) {

	try {
			
	    ConfigurationProperties config = CommandTokenizer.use("--").parse(args);

	    String serviceID = config.getProperty("cil");
	    String catID = config.getProperty("cat");
	    long interval = config.getLongValue("interval", 20000L);

	    CilService cil = (CilService) Naming.lookup("rmi://localhost:1099/" + serviceID);

	    CilStatusCollator collator = new CilStatusCollator(null, catID, cil, interval);
	    collator.start();

	} catch (Exception e) {
	    e.printStackTrace();
	    System.err
		.println("Usage: CilStatusCollator --cil <serviceID> --cat <categoryID> --interval <interval ms>");
	}

    }

}