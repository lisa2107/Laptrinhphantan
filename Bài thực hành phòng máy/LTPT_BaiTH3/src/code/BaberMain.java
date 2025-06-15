package code;

public class BaberMain {
	public static void main(String[] args) throws InterruptedException {
		CountingSemaphore countingSemaphore = new CountingSemaphore(3);
		CountingSemaphoreThread[] threadArr = new CountingSemaphoreThread[10];
		for(int i = 0; i < 10; i++) {
			threadArr[i] = new CountingSemaphoreThread(countingSemaphore, "Th "+i);
		}
		for(int i = 0; i< 10;i++) {
			threadArr[i].start();
		}
	}

}
