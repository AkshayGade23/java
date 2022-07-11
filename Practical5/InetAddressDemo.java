import java.net.*;

public class InetAddressDemo {
	public static void main (String args[]) throws UnknownHostException{
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("localHost = "+address);
		
		address = InetAddress.getByName("www.google.com");
			
		System.out.println("\nhostByName = " +address);
		System.out.println("getHostAddress = "+address.getHostAddress());
		System.out.println("getHostName = "+address.getHostName());
		System.out.println("isMultiCast = " +address.isMulticastAddress());
		System.out.println("getAddress = " +address.getAddress()+"\n");
		
		InetAddress[] yahoo = InetAddress.getAllByName("www.yahoo.com");
		
		for(int i=0; i<yahoo.length;i++){
			System.out.println(yahoo);
		} 
	}
}
