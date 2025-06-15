import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server  {
	
	protected Server() throws RemoteException {
		try {
			RMIInterface c = new ServerImplement();
			Naming.rebind("rmi://localhost:8085/MyServer", c);
			System.out.println("Khoi tao Server thanh cong!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Khoi dong server that bai!");
		}
	}

	

	
	
	
	
	public static void main(String[] args) {
			try {
				new Server();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
