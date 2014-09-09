package ngat.net.cil.test;

import ngat.util.*;
import ngat.util.logging.*;
import ngat.net.cil.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class ReaderThread extends ControlThread {

	/** THE UDP socket for CIL requests and responses. */
	DatagramSocket socket;

	/** The list of response messages queued for despatch. */
	List messages;

  LogGenerator logger;

	/** Records message-queue length. */
	int qq = 0;

	/**
	 * Create a Reader using supplied components.
	 * 
	 * @param socket
	 *            The socket to read replies from.
	 * @param messages
	 *            A list to place response messages onto.
	 */
	public ReaderThread(DatagramSocket socket, List messages) {
		super("CIL_READER", true);
		this.socket = socket;
		this.messages = messages;

		Logger alogger = LogManager.getLogger("CIL");
		logger = alogger.generate()
		    .system("CIL").subSystem("Server")	
		    .srcCompClass(this.getClass().getName())
		    .srcCompId("Reader");

	}

	/** Setup CIL_ProxyReader ReaderThread. */
	public void initialise() {
	 
			logger.create().info().level(3).extractCallInfo()
			    .msg("Initializing reader thread").send();
	}

	/** Read messages from TCS and push into Queue. */
	public void mainTask() {

		CilMessage message = null;

		// Wait on the UDP port for a TCS message.
		// If the message fails ignore it.
		try {
			// System.err.println("CIL Reader:: Waiting for next message");

			message = readMessage();

			logger.create().info().level(3).extractCallInfo()
			    .msg("Read UDP Message: Class: " + message.getMessageClass()
				 + ", Seq: " + message.getSequenceNo()).send();
			
			// log("Read response: "+ message);
		} catch (Exception e) {
		
			logger.create().error().level(2).extractCallInfo()
			    .msg("No response received from socket: "+e).send();
		}

		if (message != null) {
			messages.add(message);
			qq++;
		
			logger.create().info().level(3).extractCallInfo()
			    .msg("Pushed 1 message onto MQ size: " + messages.size()).send();
		}

	}

	public void shutdown() {
	}

	private CilMessage readMessage() throws IOException {

		byte[] buffer = new byte[2000];
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

		socket.receive(packet);

		// The data length is packet length - CIL header length.
		int length = packet.getLength() - 28;

		ByteArrayInputStream bais = new ByteArrayInputStream(buffer);

		DataInputStream dis = new DataInputStream(bais);

		// Read and ignore the routing info - its for us !
		int txId = dis.readInt();
		int rxId = dis.readInt();
		int mClass = dis.readInt();
		int sClass = dis.readInt();
		int seqno = dis.readInt();
		int ts1 = dis.readInt(); // ignore.
		int ts2 = dis.readInt(); // ignore.

		byte[] data = new byte[length];

		dis.read(data);

		String responseString = new String(data);

		// Pack the data into a CIL_Message. We ignore timestamps.
		CilMessage message = new CilMessage(seqno, txId, rxId, mClass, sClass, responseString);

		logger.create().info().level(3).extractCallInfo()
		    .msg("Received: "+CilMessage.toMClassString(mClass) + " (" + rxId + " " + txId + "+"
				+ sClass + " " + seqno + ") [" + responseString + "]").send();

		return message;

	}

}
