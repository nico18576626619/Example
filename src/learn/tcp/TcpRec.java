package learn.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpRec {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("服务端开启。。。。。。。。。。。。。");
		ServerSocket ss=new ServerSocket(10001);
		Socket s=ss.accept();
		//接收客户端的内容
		InputStream is=s.getInputStream();
		byte[] bt=new byte[1024];
		int len=0;
		len=is.read(bt);
			
			System.out.println(new String(bt,0,len));

	
		System.out.println("1111111111");
		
		//发送内容到客户端
		OutputStream os=s.getOutputStream();
		
		os.write("收到了啊？？？？".getBytes());
		os.close();
		ss.close();
	}

}
