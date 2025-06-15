import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SearchQuery extends UnicastRemoteObject implements Search {

	protected SearchQuery() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int sum(int k) throws RemoteException {
		// TODO Auto-generated method stub
		int tong = 0;
		for (int i = 0; i <= k; i++) {
			tong = tong + k;
		}

		return tong;
	}

}
