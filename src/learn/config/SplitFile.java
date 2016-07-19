package learn.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SplitFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\1.txt");
		SplitFile(file);
	}
	
	//按规定大小切割文件
	public static void SplitFile(File file) throws IOException {
		// TODO Auto-generated constructor stub
		FileInputStream fis=new FileInputStream(file);
		byte[] bt=new byte[20];
		int len=0;
		int count=0;
		while((len=fis.read(bt))!=-1){
			count++;
			FileOutputStream fos=new FileOutputStream("d:\\tt\\"+count+".part");
			fos.write(bt, 0, len);
			fos.close();
		}
		
		//生成配置文件
		FileOutputStream f=new FileOutputStream(new File("d:\\tt\\"+(count+1)+".Properties"));
		Properties pro=new Properties();
		pro.setProperty("partNum", String.valueOf(count));
		pro.setProperty("filename", file.getName());
		
		pro.store(f, "config");
		
		fis.close();	
	}
	 
	
	//按文件个数进行切割
	public static void SplitFile(File file,int num) throws IOException {
		// TODO Auto-generated constructor stub
		FileInputStream fis=new FileInputStream(file);
		//
		double number=num;
		double lenght= Math.ceil(file.length()/number);

		byte[] bt=new byte[(int)lenght];
		int len=0;
		int count=0;
		while((len=fis.read(bt))!=-1){
			count++;
			FileOutputStream fos=new FileOutputStream("d:\\tt\\"+count+".part");
			fos.write(bt, 0, len);
			fos.close();
		}
	}
	
}
