package learn.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpSend {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("���Ͷ˿���.........");
		Socket s=new Socket("192.168.0.101",10001);
		//�������ݵ�������
		OutputStream os=s.getOutputStream();
		os.write("����Ӵ".getBytes());
		
		//���շ���������
		InputStream is=s.getInputStream();
		byte[] bt=new byte[1024];
		int len = 0;
		len=is.read(bt);
		System.out.println("1111111111");
		System.out.println("�ظ���"+new String(bt,0,len));
		s.close();
	}

}
