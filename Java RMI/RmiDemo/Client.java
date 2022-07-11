import java.rmi.*;


public class Client{
	public static void main(String args[]) throws Exception {		

			AddServerInterface st = (AddServerInterface) Naming.lookup("rmi://localhost/Addservice");	
			
			System.out.println(st.sum(16,25));
			System.out.println(st.msg("Gade"));
	}
}
