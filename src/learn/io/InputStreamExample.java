package learn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//�����ļ�����
		File f=new File("d:/f.txt");
		
		int count = 0;
		InputStream is=null;
		try {
			//�ļ������� ����
			is=new FileInputStream(f);
			byte[] b=new byte[10];
			//��ȡ�ļ��ֽڣ�������ָ�뵽��һ���ֽ�  
			while(is.read(b)!=-1){
				System.out.println("��ȡ������Ϊ:"+is.read(b));
				count++;
			}
			
			System.out.println("��ȡ���ļ�����Ϊ:"+count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				//�ر�����FileInputStream���л������ģ���������֮�����رգ�������ܵ����ڴ�ռ�������ݶ�ʧ�� ��
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		};
	}

