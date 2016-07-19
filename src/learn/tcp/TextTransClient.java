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
		
		/*转换客户端
		 * 1、创建socket客户端对象
		 * 2、客户端数据源:键盘
		 * 3、客户端目的socket
		 * 
		 * 4.接收服务端数据：源socket
		 * 5.将数据打印  目的：控制台
		 * 6.在这些流中操作的数据都是文本数据
		 * */
		
		/*转换服务端
		 * 1、创建socket对象
		 * 2、获取键盘录入
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("客户端启动~~~~~~~~");
		//创建客户端socket对象
		Socket socket=new Socket("192.168.0.101",10008);
		//获取键盘录入
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//socket输出流
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
		//socket输入流
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//4.socket
		String line=null;
		while((line=br.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			out.println(line);
			
			
			String upstr=in.readLine();
			System.out.println("服务器有消息！");
			System.out.println(upstr);
		}
		socket.close();
	}

}
