package learn.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TextTransClient {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
		
		/*ת���ͻ���
		 * 1������socket�ͻ��˶���
		 * 2���ͻ�������Դ:����
		 * 3���ͻ���Ŀ��socket
		 * 
		 * 4.���շ�������ݣ�Դsocket
		 * 5.�����ݴ�ӡ  Ŀ�ģ�����̨
		 * 6.����Щ���в��������ݶ����ı�����
		 * */
		
		/*ת�������
		 * 1������socket����
		 * 2����ȡ����¼��
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("�ͻ�������~~~~~~~~");
		//�����ͻ���socket����
		Socket socket=new Socket("192.168.0.101",10008);
		//��ȡ����¼��
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//socket�����
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
		//socket������
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//4.socket
		String line=null;
		while((line=br.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			out.println(line);
			
			
			String upstr=in.readLine();
			System.out.println("����������Ϣ��");
			System.out.println(upstr);
		}
		socket.close();
	}

}
