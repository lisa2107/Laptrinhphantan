package code;

public class WorkerThread extends Thread{
	private final CountingSemaphore countingSemaphore;
	private String name;
	
	public WorkerThread(CountingSemaphore countingSemaphore, String name) {
		// TODO Auto-generated constructor stub
		this.countingSemaphore = countingSemaphore;
		this.name = name;
	}
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(name + ": acquiring lock...");
			System.out.println(name + ": available Semaphore permits now: " + countingSemaphore.availablePermit());
			countingSemaphore.P();
			System.out.println(name + ": got the permit!");

			try {
			System.out.println(name + ": is performing operation, available Semaphore permits : "
			+ countingSemaphore.availablePermit());
			Thread.sleep(100); // simulate time to work
			} finally {
			// calling release() after a successful acquire()
			System.out.println(name + ": releasing lock...");
			countingSemaphore.V();
			System.out.println(name + ": available Semaphore permits now: " + countingSemaphore.availablePermit());
			}
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			}
	}
	


