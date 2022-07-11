import java.net.*;
import java.io.*;

public class SocketDemo{
	public static void main(String args[]) throws Exception{
		Socket s  = new Socket("localhost",6666);

		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello Server,I am Akshay");
		
		// DataInputStream din = new DataInputStream(s.getInputStream());
		// String msg = (String) din.readUTF();

		// System.out.println("Msg = "+msg);
		
		din.close();
		dout.flush();
		dout.close();
		s.close();
		
	}
}
