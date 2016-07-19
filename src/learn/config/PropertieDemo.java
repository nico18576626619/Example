package learn.config;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertieDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pro=new Properties();
		//存储
		pro.setProperty("ip", "192.168.1.1");
		pro.setProperty("ip2", "192.168.1.2");
		
		
		//修改
		pro.setProperty("ip2", "192.168.1.3");
		
		//取出
		Set<String> s=pro.stringPropertyNames();
//		Iterator<String> it=s.iterator();
//		while(it.hasNext()){
//			String item=it.next();
//			System.out.println(item+":"+pro.getProperty(item));
//		}
		
//		pro.list(System.out); 可以查看流中数据
		FileOutputStream fos=new FileOutputStream("info.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
//		FileWriter fw=new FileWriter("info.txt");
		
		pro.store(osw,"IP地址信息");//注意不要加中文注释信息
		osw.close();

	}

}
