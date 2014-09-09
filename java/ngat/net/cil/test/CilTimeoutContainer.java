package ngat.net.cil.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import ngat.net.cil.*;

public class CilTimeoutContainer {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
	
    /** A Wrapped response handler.*/
    CilResponseHandler responseHandler;

    /** How long the handler will wait for a response.*/
    long timeout;
    
    /** Time when this contianer's handler's timeout will expire.*/
    long expiry;
    
    public CilTimeoutContainer(CilResponseHandler handler, long timeout, long expiry) {
	this.responseHandler = handler;
	this.timeout = timeout;
	this.expiry   = expiry;
    }

	/**
	 * @return Returns the expiry.
	 */
	public long getExpiry() {
		return expiry;
	}

	/**
	 * @return Returns the responseHandler.
	 */
	public CilResponseHandler getResponseHandler() {
		return responseHandler;
	}

	/**
	 * @return Returns the timeout.
	 */
	public long getTimeout() {
		return timeout;
	}

	public String toString() {
		return "CTC[Handler="+responseHandler+", timout="+timeout+", Expires="+sdf.format(new Date(expiry))+"]"; 
	}
    
   
}
