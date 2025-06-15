import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so k: ");
		int k = scanner.nextInt();
		
		
		try {
			RMIInterface test = (RMIInterface) Naming.lookup("rmi://localhost:8085/MyServer");
			System.out.println("Tong day so tu 1 -> " + k + ": "+test.total(k));
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
