import java.rmi.Remote;
import java.rmi.*;
import java.rmi.RemoteException;

public interface AddServerInterface extends Remote {
	public int sum(int a,int b);
}

