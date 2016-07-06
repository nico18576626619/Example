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
		/*file对象常用方法
		 * 1.获取：
		 * 获取文件名称
		 * 获取文件路径
		 * 获取文件大小
		 * 获取文件修改时间
		 * */
		String name=file.getName();
		String path=file.getPath();//相对路径
		String abspath=file.getAbsolutePath();//绝对路径
		long len=file.length();
		long time=file.lastModified();
		
//		System.out.println("name:"+name);
//		System.out.println("path:"+path);
//		System.out.println("abspath:"+abspath);
//		System.out.println("len:"+len);
//		System.out.println("time:"+time);
		
		//将时间毫秒值转换
		Date date=new Date(time);
		DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String str_date = dateFormat.format(date);
//		System.out.println("str_date:"+str_date);
		
		/*创建与删除
		 * 
		 * 
		 * 
		 * */
		//文件存在则创建，不存在则不创建
		boolean b=file.createNewFile();
		//文件存在则删除，不存在则不删除
//		boolean d=file.delete();
		//在JVM进程退出的时候删除文件,通常用在临时文件的删除.
		file.deleteOnExit();
		System.out.println("b:"+b);
//		System.out.println("d:"+d);
//		Scanner	scanner=new Scanner(System.in);
//		scanner.hasNext();
//		String str=scanner.next();
//		System.out.println("str:"+str);
//
		File file2=new File("abc\\aaa\\ddd\\fff");
		//创建文件夹，mkdirs创建多级目录
		boolean b2=file2.mkdirs();
		//文件夹中有文件时删除不了，**windows目录的删除是从里往外删除
		//如果是删除多级目录则至删除最深级目录
		file2.delete();	
		System.out.println("b2:"+b2);


		
	}
}
