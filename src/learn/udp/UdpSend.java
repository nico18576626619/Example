package learn.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UdpSend {

	public static void main(String[] args) throws IOException, UnknownHostException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket();
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(isr);
	
		System.out.println("尼強窟僕極。。。。。。。。。。。。。");
		String str=null;
		while((str=br.readLine())!=null){
			byte[] buf=new byte[1024];
			String msg=str;
			buf=msg.getBytes();
			DatagramPacket dp=new DatagramPacket(buf,0,msg.length(),InetAddress.getByName("10.37.116.11"),10003);
			dp.setData(buf);
			ds.send(dp);
		}

		ds.close();
	}

}
