package code;

public class SemaphoreExample {
	private static CountingSemaphore semaphore = new CountingSemaphore(4);
	public static void main(String[] args) {
		System.out.println("Total available semaphore permits: "+ semaphore.availablePermit());
		for(int i = 0; i <= 6;i++) {
			WorkerThread workerThread = new WorkerThread(semaphore, "ATM"+i);
			workerThread.start();
		}
	}

}
