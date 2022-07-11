import java.rmi.*;


public class AddServer{
	public static void main(String args[]) throws Exception {
		
			AddServerInterface addService = new Adder();
			
			Naming.rebind("rmi://localhost/Addservice",addService);
			
			
	}
}
