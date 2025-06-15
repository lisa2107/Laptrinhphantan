package code;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class ServerSocket {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Integer> clientArrayList = new ArrayList<Integer>();
		java.net.ServerSocket welcomeSocket = new java.net.ServerSocket(6786);
		while(true){
		    Socket connectionSocket = welcomeSocket.accept();
		    ObjectInputStream inFromClient = new ObjectInputStream(connectionSocket.getInputStream());
		    ObjectOutputStream outToClient = new ObjectOutputStream(connectionSocket.getOutputStream());
		    //Doc du lieu tu client
		    int[] arrFromClient = (int[]) inFromClient.readObject();
		    for(int i = 0; i < arrFromClient.length; i++) {
		    	if(isPrimeNumber(arrFromClient[i])) {
		    		clientArrayList.add(Integer.valueOf(arrFromClient[i]));
		    		
		    	}
		    }
		    int[] primeArray = clientArrayList.stream().mapToInt(Integer::intValue).toArray();
		    System.out.println("Prime Array: "+Arrays.toString(primeArray));
		    //Gui du lieu ve client
		    outToClient.writeObject(primeArray);
		    
		    
		    inFromClient.close();
		    outToClient.close();
		    connectionSocket.close();
		}

	}
	public static int sumOfArr(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
		
	}
	 public static boolean evenNumber(int n) {
			if (n % 2 == 0) {
				return true;
			}
			else {
				return false;
			}
			
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
