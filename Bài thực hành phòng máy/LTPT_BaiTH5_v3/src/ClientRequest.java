import java.rmi.Naming;
import java.util.Scanner;

public class ClientRequest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap k");
		int k = scanner.nextInt();
		try {
			Search access = (Search) Naming.lookup("rmi://localhost:1975/MyRMI");
			System.out.println("Tong day so tu 1 - > "+k+" = "+access.sum(k));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
