package ngat.net.cil.test;

import java.io.*;
import java.util.*;
import java.net.*;
import java.text.*;
import java.rmi.*;
import java.rmi.server.*;

import ngat.net.*;
import ngat.net.cil.*;
import ngat.util.*;
import ngat.util.logging.*;

public class CilServer extends UnicastRemoteObject implements CilService {

	public static final SimpleTimeZone UTC = new SimpleTimeZone(0, "UTC");

	/**
	 * This field must be set correctly for the CIL infrastructure to pass
	 * messages.
	 */
	int serviceClass;

	int txId;

	int rxId;

	/** The port CIL will send from. */
	int sendPort;

	/** CIL destination address for this service instance. */
	InetAddress cilHostAddress;

	/** CIL destination port for this service instance. */
	int cilPort;

	/** CIL packet sequence number. */
	//private static volatile int seq = 0;

    private CilSequenceNumber seq;


	/** UDP datagram socket we will send from and receive to. */
	DatagramSocket socket;

	/** Stores mapping from sequence numbers to response handlers. */
	Map registry;

    LogGenerator logger;

	// ReaderThread reader;

	// DespatcherThread despatcher;

	public CilServer(int servicePort, DatagramSocket socket, Map registry) throws RemoteException, IOException {
		super(servicePort);
		this.socket = socket;
		this.registry = registry;
		Logger alogger = LogManager.getLogger("CIL");
		logger = alogger.generate()
		    .system("CIL").subSystem("Server")	
		    .srcCompClass(this.getClass().getName())
		    .srcCompId("CILSRV");
		System.err.println("CILSRVR::Create cil server: on port:"+servicePort);
		
		seq = new CilSequenceNumber();
	}

	public void setCilPort(int p) {
		this.cilPort = p;
	}

	public void setCilHostAddress(InetAddress a) {
		this.cilHostAddress = a;
	}

	public void setServiceClass(int s) {
		this.serviceClass = s;
	}

	public void setTxId(int t) {
		this.txId = t;
	}

	public void setRxId(int r) {
		this.rxId = r;
	}

	public void sendMessage(String message, CilResponseHandler handler, long timeout) throws RemoteException,
			IOException {
	    // System.err.println("CILSERVER: prepare sendMsg: "+message);

	    //int aseq = nextSequenceNumber();

	    int aseq = seq.getNextSequenceNumber();

		logger.create().info().level(1)
		    .msg("CIL_COMMAND "+aseq+" ["+message+"] t/o "+timeout+"ms, handler: "+
			 (handler != null ? handler.getClass().getSimpleName() : "NULL"))
		    .send();
		
		
		// Place an entry in the registry to expire <timeout> ms from now.
		synchronized(registry) {
		    registry
			.put(new Integer(aseq), new CilTimeoutContainer(handler, timeout, System.currentTimeMillis() + timeout));
		}

		DatagramPacket packet = createPacket(message, aseq);
		//	System.err.println("CILSERVER:sendPacket...");

		socket.send(packet);
		


	}

	private DatagramPacket createPacket(String message, int seq) throws IOException {

	    // System.err.println("CILSERVER:createPacket...");

		byte[] buffer = new byte[28 + message.length()];

		ByteArrayOutputStream baos = new ByteArrayOutputStream(buffer.length);

		DataOutputStream dos = new DataOutputStream(baos);

		// Pack the CIL Routing Header.
		dos.writeInt(txId);
		dos.writeInt(rxId);
		dos.writeInt(CilMessage.COMMAND_CLASS);
		dos.writeInt(serviceClass);
		dos.writeInt(seq);

		// Make up a timestamp as UTC from 1980 5th Jan.
		// Note: This should be GPS time !
		// - so leapsecs need subtracting somehow!!

		Calendar start = Calendar.getInstance();
		start.setTimeZone(UTC);
		start.set(1980, 0, 5, 0, 0, 0);
		long startms = start.getTime().getTime();

		Calendar now = Calendar.getInstance();
		now.setTimeZone(UTC);
		long nowms = now.getTime().getTime();

		long msecs = (nowms - startms);
		int secs = (int) (msecs / 1000);
		int nanos = (1000000) * (int) (msecs - (long) (1000 * secs));

		dos.writeInt(secs);
		dos.writeInt(nanos);

		// Write the message string as a sequence of bytes.
		dos.writeBytes(message);
		// Not forgetting the string terminator for C/C++ server.
		dos.writeByte((byte) 0);

		buffer = baos.toByteArray();

		DatagramPacket packet = new DatagramPacket(buffer, buffer.length, cilHostAddress, cilPort);

		return packet;

	}

    //private int nextSequenceNumber() {
	    // logger.create().info().level(2).block("nextSequenceNumber")
	    //.msg("Generate sequence number: "+seq)
	    //.send();

    //	return (++seq);
    //}

	public static void main(String args[]) {

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		try {

			ConfigurationProperties config = CommandTokenizer.use("--").parse(args);

			int servicePort = config.getIntValue("service-port");
			int sendPort = config.getIntValue("send-port");

			DatagramSocket dsocket = new DatagramSocket(sendPort);
			System.err.println("Socket bound");

			Map registry = new HashMap();

			CilServer server = new CilServer(servicePort, dsocket, registry);
			System.err.println("Service linked to UDP socket: " + dsocket);

			String cilHost = config.getProperty("cil-host");
			InetAddress cilAddress = InetAddress.getByName(cilHost);
			server.setCilHostAddress(cilAddress);

			int cilPort = config.getIntValue("cil-port");
			server.setCilPort(cilPort);

			int svcClass = config.getIntValue("service-class");
			server.setServiceClass(svcClass);

			int txId = config.getIntValue("tx-id");
			server.setTxId(txId);

			int rxId = config.getIntValue("rx-id");
			server.setRxId(rxId);

			String name = config.getProperty("name");
			System.err.println("Name will be: [" + name + "]");

			Logger logger = LogManager.getLogger("CIL");
			logger.setLogLevel(Logging.ALL);
			LogHandler console = new ConsoleLogHandler(new BasicLogFormatter(150));
			console.setLogLevel(Logging.ALL);
			logger.addHandler(console);

			Naming.rebind("rmi://localhost:1099/" + name, server);

			System.err.println("Bound Cil service: [" + name + "] on rmi port " + servicePort
					+ "\n outgoing udp port: " + sendPort + "\n destination:       " + cilAddress + ":" + cilPort
					+ "\n ids: tx/rx:        " + txId + "/" + rxId + "\n svc-class::    " + svcClass);

			List messages = new Vector();

			ReaderThread reader = new ReaderThread(dsocket, messages);
			reader.start();

			DespatcherThread despatcher = new DespatcherThread(messages, registry);
			despatcher.start();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("CilServer --name <service-name>" + "\n          --service-port <service-port>"
					+ "\n          --send-port <port>" + "\n          --cil-host <host>"
					+ "\n          --cil-port <port>" + "\n          --service-class <svc-class>"
					+ "\n          --tx-id <id>" + "\n          --rx-id <id>");
			return;
		}
	}

}
