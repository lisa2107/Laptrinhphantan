package code;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class BinarySemaphoreThread extends Thread{
	private BinarySemaphore mutex;
	private String name;
	static int[] arr = new int[10];
	public BinarySemaphoreThread(BinarySemaphore binarySemaphore,String name) {
		// TODO Auto-generated constructor stub
		this.mutex = binarySemaphore;
		this.name = name;
	}
	void CS() {
		
		
		//Long  time = (long)(Math.random()*1000);
		System.out.println("Luong ghi "+name+"is executing");
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());
			
			int indexArr = random.nextInt(10);
			int randomNum = random.nextInt(100);
			
			
			arr[indexArr] = randomNum;
			System.out.println("W "+ name+" : "+randomNum +" - "+ formatter.format(date));
		}
		
		
	}
	void nonCS() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());
			
			int indexArr = random.nextInt(10);
			int beforeNum = arr[indexArr];
			arr[indexArr] = 0;
			
			
		
			System.out.println("R "+ name+" : "+beforeNum +" - "+ " 0 "+" - "+ formatter.format(date));
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		mutex.P();
		
		CS();
	
		mutex.V();
		
		nonCS();
		
		
	}

}
