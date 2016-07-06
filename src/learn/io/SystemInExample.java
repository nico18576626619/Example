package learn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class SystemInExample {

	private static int ch;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		StringBuffer sb = new StringBuffer();
		//将字节流转换成字符流
		InputStreamReader isr=new InputStreamReader(is);
		//缓冲
		BufferedReader br=new BufferedReader(isr);
		
//		OutputStream out=System.out;
//		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		while((line=br.readLine()).equals("exit")!=true){
		
//				osw.write(line+"\r\n");
//				osw.flush();
			bw.write(line);
			bw.newLine();
			bw.flush();

		}
		
//		
//		while ((ch = is.read()) != -1) {
//			char chh = (char) ch;
//			if (chh == '\r')
//				continue;
//			if (chh == '\n'){
//				String temp = sb.toString();
//				sb.delete(0, sb.length());
//				if (temp.equals("over"))
//				break;
//				System.out.println(temp.toUpperCase());
//			}else
//			sb.append(chh);
//		}
	}
}
