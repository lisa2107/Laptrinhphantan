package code;

import java.util.Random;

public class BakeryThread extends Thread{
	Lock lock;
	int threadID;
	static int[] arr = new int[30];
	public BakeryThread(int tid, Lock lock) {
		threadID = tid;
		this.lock = lock;
	}
	void CS() {
		System.out.println("Thread " + threadID + " bat dau");
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int indexArr = random.nextInt(10);
			arr[indexArr] = random.nextInt(100);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println("Thread " + threadID + " ket thuc");
	}
	void nonCS() {
		for (int i = 0; i < arr.length; i++) {
			if (isPrimeNumber(arr[i])) {
				System.out.println("So nguyen to trong Thread " + threadID + " : " + arr[i]);
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.requestCS(threadID);
		CS();
		lock.releaseCS(threadID);
		nonCS();
		
	}
	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}


}
