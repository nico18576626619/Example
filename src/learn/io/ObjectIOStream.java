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
			
			//���ļ���д��
			ops=new ObjectOutputStream(new FileOutputStream("d:/f.txt"));
			//д����߶�ȡ�Ķ������ʵ��Serializable,�ɴ��л�
			ops.writeObject(new Student("����",18));
			ops.writeObject(new Student("����",19));
			
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
