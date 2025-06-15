import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ServerRMI extends UnicastRemoteObject implements RMIInterface {
	protected ServerRMI() throws RemoteException {
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int sum(int k) throws RemoteException{
		int tong = 0;
		for (int i = 0; i <= k; i++) {
			tong = tong + i;
		}
		return tong;
	}
	public static void main(String[] args) {
		try {
			ServerRMI obj = new ServerRMI();
			LocateRegistry.createRegistry(6060);
			Naming.bind("rmi://localhost:6060/MyRMI", obj);
			System.out.println("Server khoi dong thanh cong");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("That bai!");
		}
	}

}
