package learn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[3];
		int numberRead=0;
		InputStream ips=null;
		OutputStream ops=null;
		try {
			
			ips=new FileInputStream("D:/f.txt");
			ops=new FileOutputStream("D:/f1.txt");
			//read(b)从文件读取内容存到b数组中
			//读取的数据存储的字节数组b中，然后ops通过write()读取字节数字中的内容
			while((numberRead=ips.read(b))!=-1){
				ops.write(b,0,numberRead);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ips.close();
				ops.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	}

}
