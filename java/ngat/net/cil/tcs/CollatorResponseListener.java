package ngat.net.cil.tcs;

import java.rmi.*;

public interface CollatorResponseListener extends Remote {

    /** Called when a CIL message reply is received.
     * @param packet A status packet.
     */
    public void tcsStatusPacketUpdate(TcsStatusPacket.Segment packet) throws RemoteException;

    /** Called when a CIL message reply is not received.
     * @param message Some sort of message - may change.
     */
    public void tcsStatusPacketFailure(String message) throws RemoteException;

}