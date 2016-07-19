package learn.tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileUpLoadClient {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		//创建文件对象
		File file=new File("c://client.txt");
		if(!file.exists())
			System.out.println("文件不存在!!");
		Socket socket=new Socket("10.37.120.37",10009);
		BufferedReader buffr=new BufferedReader(new FileReader(file));
		PrintStream out=new PrintStream(socket.getOutputStream(),true);
		String line=null;
		
		while((line=buffr.readLine())!=null){
			out.println(line);
		}
		socket.shutdownOutput();
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(br.readLine());
		
	}

}
