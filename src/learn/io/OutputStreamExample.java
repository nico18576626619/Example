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
			//read(b)���ļ���ȡ���ݴ浽b������
			//��ȡ�����ݴ洢���ֽ�����b�У�Ȼ��opsͨ��write()��ȡ�ֽ������е�����
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
