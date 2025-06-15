import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Search extends Remote {
	public int sum(int k) throws RemoteException;

}
