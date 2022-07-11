import java.net.*;
import java.io.*;

public class DataSender{
	public static void main(String args[]) throws Exception{
		DatagramSocket ds = new DatagramSocket();
		String str = "Hiii Receiver, what's up";
		
		InetAddress ip =  InetAddress.getByName("akshayy");
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		System.out.println("Sending...");
		ds.send(dp);
		
		ds.close();
		
	}
	
}
