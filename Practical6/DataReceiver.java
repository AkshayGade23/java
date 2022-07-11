	import java.net.*;
	import java.io.*;

public class DataReceiver{
	public static void main(String args[]) throws Exception{
		DatagramSocket ds = new DatagramSocket(3000);
		byte[] data = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(data,1024);
		System.out.println("waiting...");
		ds.receive(dp);
		
		String str = new String(dp.getData(),0,dp.getLength());
		System.out.println("Msg => " + str);
		ds.close();
	}
}
