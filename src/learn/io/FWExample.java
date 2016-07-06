package learn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.sound.sampled.Line;

public class FWExample {

	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		//创建读写流对象，指定读写文件
		FileReader fr=new FileReader("config.properties");
		FileWriter fw=new FileWriter("config2.properties");
		
		//创建缓冲区，并指定缓冲的对象
		BufferedReader bufr=new BufferedReader(fr);
		BufferedWriter bufw=new BufferedWriter(fw);
		
		int ch=0;
		while((ch=bufr.read())!=-1){
		bufw.write(ch);
		System.out.println(ch);
		bufw.flush();
		}
		
//		String line=null;
//		//读写操作
//		while((line=bufr.readLine())!=null){
//			bufw.write(line);
//			bufw.newLine();
//			//刷新缓冲区到流中
//			bufw.flush();
//		}
		//关闭读写流
		bufr.close();
		bufw.close();
		/*
		int ch=0;
		char[] buff=new char[1024];
		while((ch=fr.read(buff))!=-1){
			fw.write(buff,0,ch);
		}
		
		fr.close();
		fw.close();
		*/
	}

}
