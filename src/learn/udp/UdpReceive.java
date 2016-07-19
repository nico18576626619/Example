package learn.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UdpReceive {
	public static void main(String[] args) throws IOException, UnknownHostException {
		// TODO Auto-generated method stub
		System.out.println("Ω” ’∂À∆Ù∂Ø°£°£°£°£°£°£");
		
		DatagramSocket ds=new DatagramSocket(10003);
		while(true){
		byte[] buf=new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		
		
		ds.receive(dp);
		System.out.println(new String(dp.getData(),0,dp.getLength()));
		}
		
	}
}
