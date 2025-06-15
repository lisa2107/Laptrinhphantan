import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RMIInterface extends Remote{
	public int total(int k) throws RemoteException;

}
