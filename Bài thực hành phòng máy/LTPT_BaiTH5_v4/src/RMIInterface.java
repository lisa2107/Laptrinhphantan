import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote{
	public int sum(int k) throws RemoteException;

}
