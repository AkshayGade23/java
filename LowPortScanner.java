import java.net.*;
import java.io.*;

public class LowPortScanner {
	public static void main(String[] args) throws UnkonwnHostException,IOException{
		ServerSocket ss ;
		Socket s;
					
		ss = new ServerSocket(5000); 
		System.out.println("Server started");
		System.out.println("Waiting for a client ...");
		
		s = new Socket(ss.getInetAddress(),5000);
		System.out.println("Socket Address = "+  s.getInetAddress());
		System.out.println("Socket Port = "+ s.getPort()); 
		System.out.println("Socket LocalPort = " + s.getLocalPort()); 
	}
}
