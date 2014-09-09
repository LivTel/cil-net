package ngat.net.cil.tcs;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Properties;

import ngat.message.RCS_TCS.SHOW;
import ngat.message.RCS_TCS.TCS_Status;
import ngat.net.cil.CilResponseHandler;
import ngat.util.logging.LogGenerator;
import ngat.util.logging.LogManager;
import ngat.util.logging.Logger;

public class CollatorResponseProcessor extends UnicastRemoteObject implements CilResponseHandler {

    private transient CilStatusCollator collator;

    
    private CollatorResponseListener listener;

	/** Category of status to collect. */
	private String cat;
	
	/** Error logging. */
	//protected LogGenerator logger;
	
	
	/**
	 * @param collator
	 *            The collator this handler represents.
	 */
	public CollatorResponseProcessor(CollatorResponseListener listener, String cat) throws RemoteException {
		super();
		this.listener = listener;
		this.cat = cat;
		//Logger alogger = LogManager.getLogger("CIL");
		//logger = alogger.generate().system("COMMS")
				//.subSystem("CIL")
				//.srcCompClass(this.getClass().getName())
				//.srcCompId(cat+"_Handler");
	}

	/**
	 * Handle a <i>completion</i> reply.
	 * 
	 * @param message
	 *            The reply message.
	 */
	public void completed(String message) throws RemoteException {
		// now we need to extract the correct subcat from status.
		//System.err.println("CollatorResponseHandler:: Received [completion] reply: " + message);
		//System.err.println("CollatorResponseHandler::Extracting status segment from reply...");

		CilResponseParser parser = new CilResponseParser();
		Properties map = null;
		try {
			parser.parse(message);
			map = parser.getMap();
			//System.err.println("CollatorResponseHandler:Generated Map: " + map);
		} catch (Exception px) {
			throw new RemoteException(this.getClass().getName() + ": Failed to parse status segment", px);
		}

		CilStatusExtractor extractor = null;
		TcsStatusPacket.Segment data = null;

		if (cat.equals("MECHANISMS")) {
			try {
				extractor = new CilStatusExtractor(SHOW.MECHANISMS);
				data = extractor.translate(map);
			} catch (Exception e) {
				throw new RemoteException(this.getClass().getName() + ": Failed to extract MECH", e);
			}
		} else if (cat.equals("FOCAL_STATION")) {
			try {
				extractor = new CilStatusExtractor(SHOW.FOCUS);
				data = extractor.translate(map);
			} catch (Exception e) {
				throw new RemoteException(this.getClass().getName() + ": Failed to extract FOCUS segment", e);
			}
			
		} else if (cat.equals("LIMITS")) {
			try {
				extractor = new CilStatusExtractor(SHOW.LIMITS);
				data = extractor.translate(map);
			} catch (Exception e) {
				throw new RemoteException(this.getClass().getName() + ": Failed to extract LIMITS segment", e);
			}
		} else if (cat.equals("AUTOGUIDER")) {
			try {
				extractor = new CilStatusExtractor(SHOW.AUTOGUIDER);
				data = extractor.translate(map);
			} catch (Exception e) {
				throw new RemoteException(this.getClass().getName() + ": Failed to extract AUTOGUIDER segment", e);
			}
			
		} else if (cat.equals("STATE")) {
				try {
					extractor = new CilStatusExtractor(SHOW.STATE);
					data = extractor.translate(map);
				} catch (Exception e) {
					throw new RemoteException(this.getClass().getName() + ": Failed to extract STATE segment", e);
				}
		} else if (cat.equals("METEOROLOGY")) {
				try {
					extractor = new CilStatusExtractor(SHOW.METEOROLOGY);
					data = extractor.translate(map);
				} catch (Exception e) {
					throw new RemoteException(this.getClass().getName() + ": Failed to extract METEO segment", e);
				}
		} else if (cat.equals("SOURCE")) {

		    try {
			extractor = new CilStatusExtractor(SHOW.SOURCE);
			data = extractor.translate(map);
		    } catch (Exception e) {
			throw new RemoteException(this.getClass().getName() + ": Failed to extract SOURCE segment", e);
		    }

		} else if (cat.equals("TIME")) {

                    try {
                        extractor = new CilStatusExtractor(SHOW.TIME);
                        data = extractor.translate(map);
                    } catch (Exception e) {
                        throw new RemoteException(this.getClass().getName() + ": Failed to extract TIME segment", e);
                    }

		} else if (cat.equals("ASTROMETRY")) {

		      try {
                        extractor = new CilStatusExtractor(SHOW.ASTROMETRY);
                        data = extractor.translate(map);
                    } catch (Exception e) {
                        throw new RemoteException(this.getClass().getName() + ": Failed to extract ASTRO segment", e);
                    }



		}

		// this needs generalizing
		listener.tcsStatusPacketUpdate(data);

	}

	/** Handle an <i>actioned</i> reply. */
	public void actioned() throws RemoteException {
		//System.err.println("CollatorResponseHandler:: Received [actioned] reply");
	}

	/**
	 * Handle an <i>error</i> reply.
	 * 
	 * @param code
	 *            The error code.
	 * @param message
	 *            The error message.
	 */
	public void error(int code, String message) throws RemoteException {
		//System.err.println("CollatorResponseHandler:: Received [error] reply: " + code + " : " + message);
	}

	/**
	 * Handle a CIL response timeout
	 * 
	 * @param message
	 * @throws RemoteException
	 */
	public void timedout(String message) throws RemoteException {
	    System.err.println("CollatorResponseHandler:: Received [timedout] reply: " + message);
	    listener.tcsStatusPacketFailure("Timedout for "+cat);
	    
	}

}
