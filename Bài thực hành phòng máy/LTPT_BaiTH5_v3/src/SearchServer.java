import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SearchServer {
	public static void main(String[] args) {
		try {
			Search obj = new SearchQuery();
			LocateRegistry.createRegistry(1975);
			Naming.bind("rmi://localhost:1975/MyRMI", obj);
			System.out.println("Server khoi dong thanh cong");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("That bai!");
		}
	}

}
