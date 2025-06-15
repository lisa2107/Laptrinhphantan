package code;



public class BinarySemaphore {
	boolean value;
	public BinarySemaphore(boolean initValue) {
		
		value = initValue;
	}
	public synchronized void P() {
		while(value == false)
			Util.myWait(this);
		
		value = false;
	}
	public synchronized void V() {
		value = true;
		notify();
	}
	public boolean getValue() {
		return value;
	}

}
