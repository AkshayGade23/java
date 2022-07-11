import java.net.*;
import java.io.*;

public class Printhostname {
	
  public static void main(String args[]) throws MalformedURLException,IOException{
  	URL hp = new URL("https://web.telegram.org/k/");
  	System.out.println("URL = https://web.telegram.org/k/");
  	System.out.println("Protocal = "+hp.getProtocol());
  	System.out.println("Port = "+hp.getPort());
  	System.out.println("Host = "+hp.getHost());
  	System.out.println("File = "+hp.getFile());
  	System.out.println("Authority = "+hp.getAuthority());
  	
  	URLConnection urlC = hp.openConnection();
  	System.out.println("\nURLConnection");
  	System.out.println("ContentType = "+urlC.getContentType());
  	System.out.println("Expiration = " + urlC.getExpiration());
  	System.out.println("LastModified = " + urlC.getLastModified());
  	System.out.println("ContentLength = " +urlC.getContentLength());
  }
}
