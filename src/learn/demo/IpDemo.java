package learn.demo;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip=InetAddress.getLocalHost();
		
		System.out.println(ip.getHostName()+":"+ip.getHostAddress());
		
	}

}
