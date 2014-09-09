package ngat.net.cil.tcs.test;

import java.io.*;
import java.util.*;
import java.net.*;
import java.text.*;
import java.rmi.*;
import java.rmi.server.*;

import ngat.net.*;
import ngat.net.cil.*;
import ngat.net.cil.test.*;
import ngat.util.*;

public class TrackTest {

    
    transient CilService cil;

 
    TrackTest(CilService cil) {
	this.cil     = cil;
    }

    public static void main(String args[]) {

	try {
	    
	    ConfigurationProperties config = CommandTokenizer.use("--").parse(args);
	    
	    String host     = config.getProperty("host", "localhost");
	    String svcname  = config.getProperty("service");	  
	
	    CilService cil = (CilService)Naming.lookup("rmi://"+host+"/"+svcname);
	    System.err.println("Found service: "+cil);

	    TrackTest t = new TrackTest(cil);
	    t.run();

	} catch (Exception e) {
	    e.printStackTrace();
	    System.err.println("Usage: ngat.net.cil.tcs.test.TrackTest --host <host> --service <service-name>  --to <timeout-ms>");
	    return;
	}
    }


    public void run() {
		
	    final CilClient cazm = new CilClient("CAZM", "TRACK AZIMUTH OFF",  180000L, cil);
	    final CilClient calt = new CilClient("CALT", "TRACK ALTITUDE OFF", 180000L, cil);
	    final CilClient crot = new CilClient("CROT", "TRACK ROTATOR OFF",  180000L, cil);
	    
	    Runnable razm = new Runnable() {
		    public void run() {
			cazm.run();
			System.err.println("Client AZM returned: "+cazm.getReturnCode());
		    }
		};
	    Runnable ralt = new Runnable() {
		    public void run() {
			calt.run();
			System.err.println("Client ALT returned: "+calt.getReturnCode());
		    }
		};
	     Runnable rrot = new Runnable() {
		    public void run() {
			crot.run();
			System.err.println("Client ROT returned: "+crot.getReturnCode());
		    }
		};

	     Thread tazm = new Thread(razm);	  
	     Thread talt = new Thread(ralt);
	     Thread trot = new Thread(rrot);

	     tazm.start();
	     talt.start();
	     trot.start();

	     try {
		 tazm.join();
		 System.err.println("Client AZM joined");
	     } catch (Exception e) {
		 e.printStackTrace();
	     }

	       try {
		 talt.join();
		 System.err.println("Client ALT joined");
	     } catch (Exception e) {
		 e.printStackTrace();
	     }

	       try {
		 trot.join();
		 System.err.println("Client ROT joined");
	     } catch (Exception e) {
		 e.printStackTrace();
	     }

	       System.err.println("All clients are now done");


    }

   
}
