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
		//������д������ָ����д�ļ�
		FileReader fr=new FileReader("config.properties");
		FileWriter fw=new FileWriter("config2.properties");
		
		//��������������ָ������Ķ���
		BufferedReader bufr=new BufferedReader(fr);
		BufferedWriter bufw=new BufferedWriter(fw);
		
		int ch=0;
		while((ch=bufr.read())!=-1){
		bufw.write(ch);
		System.out.println(ch);
		bufw.flush();
		}
		
//		String line=null;
//		//��д����
//		while((line=bufr.readLine())!=null){
//			bufw.write(line);
//			bufw.newLine();
//			//ˢ�»�����������
//			bufw.flush();
//		}
		//�رն�д��
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
