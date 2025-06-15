package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Integer sumOfPrime = 0;
		int N, K;
		
        
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang N: ");
		N = scanner.nextInt();
		System.out.println("Nhap so luong luong: ");
		K = scanner.nextInt();
		
		ArrayList<Integer> mangNgauNhien = RandomInteger.getRandom(N);
		int sizeOfElement = (int) Math.ceil((double) N / K);
		
		Run[] arrayRun = new Run[K];
        Thread[] arrayThread = new Thread[K];
		
		System.out.println("Mang ngau nhien: "+ mangNgauNhien);
//		System.out.println("size: "+sizeOfElement);
		
		
        
        for (int i = 0; i < K; i++) {
           
            arrayRun[i] = new Run(mangNgauNhien.subList(sizeOfElement * i, Math.min(sizeOfElement * (i + 1),mangNgauNhien.size())), "Luong - "+(i+1));
        }
        
        int tongSoNguyenTo = 0;
        for(int i = 0; i < K; i++) {
        	arrayThread[i] = new Thread(arrayRun[i]);
        	
        }
        for(int i = 0; i < K; i++) {
        	arrayThread[i].start();
        	
        }
        for(int i = 0; i < K; i++) {
        	arrayThread[i].join();
        	sumOfPrime += arrayRun[i].demSoNguyenTo();
        	
        	
        }
//        for(int i = 0; i < K; i++) {
//        	sumOfPrime += arrayRun[i].demSoNguyenTo();
//        	
//        }
        System.out.println("Tong so nguyen to la: "+ sumOfPrime);
       
	}

}
