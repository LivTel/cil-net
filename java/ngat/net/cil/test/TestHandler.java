package ngat.net.cil.test;

import ngat.net.cil.*;
import ngat.util.BooleanLock;

import java.io.*;
import java.rmi.*;
import java.rmi.server.*;

public class TestHandler extends UnicastRemoteObject implements CilResponseHandler {

	/** True if the action was completed. */
	public boolean completed = false;

	/** True if the action completed with an error condition. */
	public boolean error = false;

	/** Reply message. */
	public String reply;

	/** Error messsage. */
	public String errMsg;

	/** Error code. */
	public int errCode;

	private volatile BooleanLock flag;

	public TestHandler() throws RemoteException {
		super();
		flag = new BooleanLock(false);
	}

	/**
	 * Handle a <i>completion</i> reply. This should have the data items
	 * included
	 * 
	 * @param message
	 *            The reply message.
	 */
	public void completed(String message) throws RemoteException {
	    //System.err.println("TH: CallCompleted (): " + message);
		completed = true;
		reply = message;
		flag.setValue(true);
	}

	/** Handle an <i>actioned</i> reply. */
	public void actioned() throws RemoteException {
	    //System.err.println("TH: CallActioned()");
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
	    //System.err.println("TH: CallError(): Code=" + code + " Msg=" + message);
		completed = true;
		error = true;
		errMsg = message;
		errCode = code;
		flag.setValue(true);
	}

	/** Wait on the handler to signal that it has completed or errored. */
	public void waitNotification(long timeout) throws InterruptedException {
		flag.waitUntilTrue(timeout);
	}

	public boolean isCompleted() {
		return completed;
	}

	public String toString() {
		return "TH: " + (completed ? "Complete" : "NOT Complete")
				+ (error ? "Error: " + errCode + ":" + errMsg : "Reply: " + reply);
	}

	public void timedout(String message) throws RemoteException {
	    //System.err.println("TH: CallTimedout(): " + message);
		flag.setValue(true);
	}

}
