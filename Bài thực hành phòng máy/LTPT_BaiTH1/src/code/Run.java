package code;

import java.util.ArrayList;
import java.util.List;

public class Run implements Runnable {
	private List<Integer> mainArray;
	 private String nameThread;
	 private Integer tongSoNguyenTo;
	 private Integer tongSoChinhPhuong;
	 private Integer min;
	 private Integer max;
	
	public Run(List<Integer> array, String threadName){
        mainArray = array;
        nameThread = threadName;

    }
	public void run() {
		// TODO Auto-generated method stub
		ArrayList<Integer> soNguyenToArr = new ArrayList<Integer>();
		for (int i = 0; i < mainArray.size(); i++) {
        	
            if (isPrimeNumber(mainArray.get(i))){
                System.out.println(" " + nameThread +
                        ": " + mainArray.get(i) + " la so nguyen to.");
                soNguyenToArr.add(mainArray.get(i));
            }

        }
		System.out.println("Tong so nguyen to o " + nameThread + ": " + soNguyenToArr.size());
		tongSoNguyenTo = soNguyenToArr.size();
		
		
	}
	public Integer demSoNguyenTo(){
        return tongSoNguyenTo;
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
