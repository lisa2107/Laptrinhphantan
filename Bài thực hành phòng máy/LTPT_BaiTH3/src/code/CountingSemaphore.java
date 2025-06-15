package code;

public class CountingSemaphore {
	int value;
	

	public CountingSemaphore(int initValue) {
		// TODO Auto-generated constructor stub
		value = initValue;

	}

	public synchronized void P() {
		value--;
		if (value < 0)
			Util.myWait(this);
	}

	public synchronized void V() {
		value++;
		if (value <= 0)
			notify();
	}
	public int availablePermit() {
		return value;
	}
	

}
