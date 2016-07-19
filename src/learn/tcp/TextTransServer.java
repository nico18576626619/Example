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
		
		/*转换服务端
		 * 分析：
		 * 1、ServerSocket服务端
		 * 2、获取socket对象
		 * 3.源：socket，获取客户端socket对象发过来的英文
		 * 4、目的：显示在服务端控制台
		 * 5、将数据转换成大写发送给客户端
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("服务端启动~~~~~~~~~~~");
		//创建服务器socket
		ServerSocket ss=new ServerSocket(10008);
		//获取客户端socket
		Socket socket=ss.accept();
		//获取IP
		String ip=socket.getInetAddress().getHostAddress();
		System.out.println(ip+".........connect");
		//获取输入流
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);//注意一定要刷新
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
			out.println(line.toUpperCase());
		}
		socket.close();
		ss.close();
	}

}
