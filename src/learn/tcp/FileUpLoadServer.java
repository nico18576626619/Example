package learn.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpLoadServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ssocket=new ServerSocket(10009);
		Socket socket=ssocket.accept();
		BufferedReader buffr=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps=new PrintStream(socket.getOutputStream(),true);
		BufferedWriter buffw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c://server.txt")));
		String line=null;
		while((line=buffr.readLine())!=null){
			buffw.write(line);
			buffw.newLine();
			buffw.flush();
		}
		ps.println("上传成功");
		socket.close();
	}

}
