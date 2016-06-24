package learn.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectIOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream ops=null;
		ObjectInputStream ips=null;
		
		try {
			
			//类文件读写流
			ops=new ObjectOutputStream(new FileOutputStream("d:/f.txt"));
			//写入或者读取的对象必须实现Serializable,可串行化
			ops.writeObject(new Student("张三",18));
			ops.writeObject(new Student("李四",19));
			
			ips=new ObjectInputStream(new FileInputStream("d:/f.txt"));
			try {
				System.out.println(ips.readObject());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
