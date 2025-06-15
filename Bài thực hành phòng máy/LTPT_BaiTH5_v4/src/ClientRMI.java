import java.rmi.Naming;
import java.util.Scanner;

public class ClientRMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap k");
		int k = scanner.nextInt();
		try {
			RMIInterface access = (RMIInterface) Naming.lookup("rmi://localhost:6060/MyRMI");
			System.out.println("Tong day so tu 1 - > " + k + " = " + access.sum(k));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Khong tim dc"+e);
		}
	}
}
