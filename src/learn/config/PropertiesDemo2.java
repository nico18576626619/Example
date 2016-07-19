package learn.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Ä£Äâload·½·¨
		 *
		 */
		Properties pro = new Properties();
		FileReader fw=new FileReader("info.txt");
		myLoad(pro,fw);
		pro.list(System.out);
	}

	private static void myLoad(Properties pro, FileReader fw) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buff=new BufferedReader(fw);
		String line=null;
		while((line=buff.readLine())!=null){
			if(line.startsWith("#")){
			continue;
			}else{
			int index=line.indexOf("=");
			pro.setProperty(line.substring(0,index), line.substring(index+1,line.length()));
			}
		}
	}
}
