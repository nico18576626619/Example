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
		System.out.println("����˿�����������������������������");
		ServerSocket ss=new ServerSocket(10001);
		Socket s=ss.accept();
		//���տͻ��˵�����
		InputStream is=s.getInputStream();
		byte[] bt=new byte[1024];
		int len=0;
		len=is.read(bt);
			
			System.out.println(new String(bt,0,len));

	
		System.out.println("1111111111");
		
		//�������ݵ��ͻ���
		OutputStream os=s.getOutputStream();
		
		os.write("�յ��˰���������".getBytes());
		os.close();
		ss.close();
	}

}
