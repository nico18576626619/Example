package learn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//创建文件对象
		File f=new File("d:/f.txt");
		
		int count = 0;
		InputStream is=null;
		try {
			//文件输入流 对象
			is=new FileInputStream(f);
			byte[] b=new byte[10];
			//读取文件字节，并递增指针到下一个字节  
			while(is.read(b)!=-1){
				System.out.println("读取的内容为:"+is.read(b));
				count++;
			}
			
			System.out.println("读取的文件长度为:"+count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				//关闭流（FileInputStream是有缓冲区的，所以用完之后必须关闭，否则可能导致内存占满，数据丢失。 ）
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		};
	}

