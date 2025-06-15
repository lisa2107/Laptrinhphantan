package code;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class CountingSemaphoreThread extends Thread{
	private CountingSemaphore mutex;
	private String name;
	static int[] arr = new int[10]; 
	public CountingSemaphoreThread(CountingSemaphore countingSemaphore,String name) {
		// TODO Auto-generated constructor stub
		this.mutex = countingSemaphore;
		this.name = name;
	}
	void CS() throws InterruptedException {
		System.out.println("Luong ghi "+name+"is executing");
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			
			Long duration = (long) (Math.random() * 10000);
			
			int indexArr = random.nextInt(10);
			int randomNum = random.nextInt(100);
			
			
			arr[indexArr] = randomNum;
			System.out.println("W "+ name+" : "+randomNum +" - "+ duration);
			Thread.sleep(duration);
		}
		
		
	}
	void nonCS() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Long duration = (long) (Math.random() * 10000);
			
			int indexArr = random.nextInt(10);
			int beforeNum = arr[indexArr];
			arr[indexArr] = 0;
			
			
		
			System.out.println("R "+ name+" : "+beforeNum +" - "+ " 0 "+" - "+ duration);
			Thread.sleep(duration);
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		mutex.P();
		
		try {
			CS();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		mutex.V();
		
		try {
			nonCS();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
