package learn.config;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
		
		writeObj();
		readObj();
		
	}

	private static void readObj() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\obj.object"));
		Person p=null;
		//EOFException 无法判断文件是否读完，只能通过捕获该异常解决
		try {
			while(true){
				p=(Person) ois.readObject();
				System.out.println(p.getName()+":"+p.getAge());
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
		
		}finally{
			ois.close();
		}
	}

	private static void writeObj() throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\obj.object"));
		oos.writeObject(new Person("小强",20));
		oos.writeObject(new Person("小玩",21));
		oos.close();
	}

}
