package code;

import java.util.Scanner;

public class MainBakery {
	public static void main(String[] args) throws InterruptedException {
		int N;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Nhap so luong: ");
		N = scanner.nextInt();
		
		Lock lock = new Bakery(N);
		
		BakeryThread[] threadArr = new BakeryThread[N] ;
		for(int i = 0; i< N;i++) {
			threadArr[i] = new BakeryThread(i, lock);
		}
		for(int i = 0; i< N;i++) {
			threadArr[i].start();
		}
		for(int i = 0; i< N;i++) {
			threadArr[i].join();
		}
		
		
	}

}
