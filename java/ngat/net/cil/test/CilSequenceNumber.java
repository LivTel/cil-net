package ngat.net.cil.test;

/** Wrapper to allow sequence numbers to be generated.*/
public class CilSequenceNumber {

    private volatile int seq;

    public CilSequenceNumber() {
	seq = 1;
    }

    public synchronized int getNextSequenceNumber() {
	seq = ((seq + 1) % Integer.MAX_VALUE);
	return seq;
    }


}