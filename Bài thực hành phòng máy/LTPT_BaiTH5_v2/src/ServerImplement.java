import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServerImplement extends UnicastRemoteObject implements RMIInterface {
	

	protected ServerImplement() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2501325476510926553L;

	@Override
	public int total(int k) throws RemoteException {
		// TODO Auto-generated method stub
		int tong = 0;
		for(int i = 0; i <= k; i++) {
			tong = tong + i ;
		}
		return tong;
	}

	
	
	

}
