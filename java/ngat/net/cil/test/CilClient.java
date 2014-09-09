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

public class CilClient {

    String name;
    String message;
    long   timeout;
    
    transient CilService cil;

    // volatile boolean done = false;

    TestHandler handler;
    
    public CilClient(String name, String message, long timeout, CilService cil) {
	this.name    = name;
	this.message = message;
	this.timeout = timeout;
	this.cil     = cil;
    }

    public static void main(String args[]) {

	try {
	    
	    ConfigurationProperties config = CommandTokenizer.use("--").parse(args);
	    
	    String host     = config.getProperty("host", "localhost");
	    String svcname  = config.getProperty("service");
	    String message  = config.getProperty("msg");	 	  
	    long   timeout  = config.getLongValue("to");

	    CilService cil = (CilService)Naming.lookup("rmi://"+host+"/"+svcname);
	    System.err.println("Found service: "+cil);

	    CilClient client = new CilClient("CC", message, timeout, cil);
	    client.run();

	    System.err.println("Client returned: "+client.getReturnCode());
	    System.exit(client.getReturnCode());

	} catch (Exception e) {
	    e.printStackTrace();
	    System.err.println("Usage: CilClient --host <host> --service <service-name> --msg <message> --to <timeout-ms>");
	    return;
	}

    }


    public void run() {
	
	try {
	    handler = new TestHandler();
	} catch (Exception e) {
	    e.printStackTrace();
	    return;
	}

	try {
	    System.err.println("Sending: "+message);
	    cil.sendMessage(message, handler, timeout);
	} catch (Exception e) {
	    e.printStackTrace();
	    return;
	}

	try {
		handler.waitNotification(timeout+5000L);
	} catch (InterruptedException ix) {}
	
	if (handler.isCompleted()) {
	    System.err.println("Completed Handler-"+handler);
	} else {
	    System.err.println("Failed Handler-"+handler+" - Due: "+handler.errCode+":"+handler.errMsg);
	}
	
    }

    public int getReturnCode() {
	return handler.errCode;
    }
   
}
