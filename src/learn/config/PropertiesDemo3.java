package learn.config;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 /*修改配置文件
		  * 
		  * */
		//读取配置文件
		File file = new File("info.txt");
		if(!file.exists())
			file.createNewFile();
		FileReader fr=new FileReader(file);
		//fw不能放在这里，否则读的是空文件
		FileWriter fw=new FileWriter(file);
		//加载配置文件
		Properties pro=new Properties();
		pro.load(fr);
		
		pro.setProperty("ip", "修改后P");
		pro.list(System.out);
		
		//存储修改后的配置
		FileWriter fw=new FileWriter(file);
		pro.store(fw, "change");
		
		fr.close();
		fw.close();
		
		

	}

}
