package ngat.net.cil;

import java.rmi.*;
import java.io.*;

public interface CilService extends Remote {

    /** Send a message with reply to the specified handler.
     * @param message The message to send.
     * @param handler A CilResponseHandler registered by the client to handle the message reply.
     * @param timeout The time the handler is willing to wait for a reply, after this time it will throw TimoutException
     */
    public void sendMessage(String message, CilResponseHandler handler, long timeout) throws RemoteException, IOException;
  
}
