package learn.config;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 /*�޸������ļ�
		  * 
		  * */
		//��ȡ�����ļ�
		File file = new File("info.txt");
		if(!file.exists())
			file.createNewFile();
		FileReader fr=new FileReader(file);
		//fw���ܷ��������������ǿ��ļ�
		FileWriter fw=new FileWriter(file);
		//���������ļ�
		Properties pro=new Properties();
		pro.load(fr);
		
		pro.setProperty("ip", "�޸ĺ�P");
		pro.list(System.out);
		
		//�洢�޸ĺ������
		FileWriter fw=new FileWriter(file);
		pro.store(fw, "change");
		
		fr.close();
		fw.close();
		
		

	}

}
