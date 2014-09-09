package ngat.net.cil;

import java.rmi.*;

/** Clients which wish to be informed of responses to CIL messages should implement
 * CilResponseHandler.
 */
public interface CilResponseHandler extends Remote {

    /** Handle a <i>completion</i> reply. 
     *@param message The reply message.
    */
    public void completed(String message) throws RemoteException;

    /** Handle an <i>actioned</i> reply.*/
    public void actioned() throws RemoteException;

    /** Handle an <i>error</i> reply.
     * @param code The error code.
     *@param message The error message.
     */
    public void error(int code, String message) throws RemoteException;

    /**
     * Handle a CIL response timeout
     * @param message
     * @throws RemoteException
     */
    public void timedout(String message) throws RemoteException;
    
}
