package learn.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpSend {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("发送端开启.........");
		Socket s=new Socket("192.168.0.101",10001);
		//发送内容到服务器
		OutputStream os=s.getOutputStream();
		os.write("快快快哟".getBytes());
		
		//接收服务器内容
		InputStream is=s.getInputStream();
		byte[] bt=new byte[1024];
		int len = 0;
		len=is.read(bt);
		System.out.println("1111111111");
		System.out.println("回复："+new String(bt,0,len));
		s.close();
	}

}
