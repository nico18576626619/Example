package learn.io;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class FileExample2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

//		File file=new File("D:\\liuxin\\workspace\\Example\\config2.properties");
		File file=new File("file1.txt");
		/*file�����÷���
		 * 1.��ȡ��
		 * ��ȡ�ļ�����
		 * ��ȡ�ļ�·��
		 * ��ȡ�ļ���С
		 * ��ȡ�ļ��޸�ʱ��
		 * */
		String name=file.getName();
		String path=file.getPath();//���·��
		String abspath=file.getAbsolutePath();//����·��
		long len=file.length();
		long time=file.lastModified();
		
//		System.out.println("name:"+name);
//		System.out.println("path:"+path);
//		System.out.println("abspath:"+abspath);
//		System.out.println("len:"+len);
//		System.out.println("time:"+time);
		
		//��ʱ�����ֵת��
		Date date=new Date(time);
		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String str_date = dateFormat.format(date);
//		System.out.println("str_date:"+str_date);
		
		/*������ɾ��
		 * 
		 * 
		 * 
		 * */
		//�ļ������򴴽����������򲻴���
		boolean b=file.createNewFile();
		//�ļ�������ɾ������������ɾ��
//		boolean d=file.delete();
		//��JVM�����˳���ʱ��ɾ���ļ�,ͨ��������ʱ�ļ���ɾ��.
		file.deleteOnExit();
		System.out.println("b:"+b);
//		System.out.println("d:"+d);
//		Scanner	scanner=new Scanner(System.in);
//		scanner.hasNext();
//		String str=scanner.next();
//		System.out.println("str:"+str);
//
		File file2=new File("abc\\aaa\\ddd\\fff");
		//�����ļ��У�mkdirs�����༶Ŀ¼
		boolean b2=file2.mkdirs();
		//�ļ��������ļ�ʱɾ�����ˣ�**windowsĿ¼��ɾ���Ǵ�������ɾ��
		//�����ɾ���༶Ŀ¼����ɾ�����Ŀ¼
		file2.delete();	
		System.out.println("b2:"+b2);


		
	}
}
