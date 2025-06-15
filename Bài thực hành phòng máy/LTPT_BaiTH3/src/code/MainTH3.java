package code;

import java.util.Scanner;

public class MainTH3 {
	public static void main(String[] args) {
		int k,h;
		Scanner scanner = new Scanner(System.in);
		


		System.out.println("Nhap k luong ghi: ");
		k = scanner.nextInt();
		System.out.println("Nhap h luong doc: ");
		h = scanner.nextInt();
		BinarySemaphore binarySemaphore = new BinarySemaphore(true);
		CountingSemaphoreThread[] threadArr = new CountingSemaphoreThread[10];
		for(int i = 0; i < 10; i++) {
//			threadArr[i] = new CountingSemaphoreThread(countingSemaphore, "Th "+i);
		}
		for(int i = 0; i< 10;i++) {
			//threadArr[i].start();
		}
	
		
	}

}
