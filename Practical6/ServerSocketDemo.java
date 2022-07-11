import java.net.*;
import java.io.*;

public class ServerSocketDemo{
	public static void main(String args[])throws Exception{
		ServerSocket ss = new ServerSocket(6666);
		Socket s= ss.accept();
		
		// DataInputStream din = new DataInputStream(s.getInputStream());
		// String msg = (String) din.readUTF();
		// System.out.println("Msg = "+msg);
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello Akshay,I am Server");
		
		
		din.close();
		dout.flush();
		dout.close();
		s.close();
	} 
}
