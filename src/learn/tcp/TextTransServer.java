package learn.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TextTransServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*ת�������
		 * ������
		 * 1��ServerSocket�����
		 * 2����ȡsocket����
		 * 3.Դ��socket����ȡ�ͻ���socket���󷢹�����Ӣ��
		 * 4��Ŀ�ģ���ʾ�ڷ���˿���̨
		 * 5��������ת���ɴ�д���͸��ͻ���
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("���������~~~~~~~~~~~");
		//����������socket
		ServerSocket ss=new ServerSocket(10008);
		//��ȡ�ͻ���socket
		Socket socket=ss.accept();
		//��ȡIP
		String ip=socket.getInetAddress().getHostAddress();
		System.out.println(ip+".........connect");
		//��ȡ������
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);//ע��һ��Ҫˢ��
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
			out.println(line.toUpperCase());
		}
		socket.close();
		ss.close();
	}

}
