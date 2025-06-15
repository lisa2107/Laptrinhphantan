package code;

public class MainPeterson {
	public static void main(String[] args) throws InterruptedException {
		Lock lock = new Peterson();

		PetersonThread thread1 = new PetersonThread(0, lock);
		PetersonThread thread2 = new PetersonThread(1, lock);
		thread1.start();
		thread2.start();
//		thread1.join();
//		thread2.join();
	}
}
