import java.rmi.*;

public interface AddServerInterface extends Remote {
	public int sum(int a,int b)throws RemoteException;
	
	public String msg(String s)throws RemoteException;
}

