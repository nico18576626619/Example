package learn.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Timer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*计数器，每次运行程序次数+1
		 * 
		 */
		int i=getTimer2();
		System.out.println(i);
	}

	private static int getTimer2() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("timer.properties");
		if(!f.exists()){
			f.createNewFile();
		}
		FileInputStream fis=new FileInputStream(f);
		Properties pro=new Properties();
		pro.load(fis);
		int count=0;
		String value=null;
		if((value=pro.getProperty("times"))!=null){
			count=Integer.parseInt(value);
			if(count>=5){
				throw new RuntimeException("给钱！！");
			}
		}
		count++;
		pro.setProperty("times",String.valueOf(count));
		FileOutputStream fos=new FileOutputStream(f);
		pro.store(fos, "timer");
		fos.close();
		fis.close();
		
		return count-1;
	}

	private static int getTimer() throws IOException {
		File f=new File("timer.properties");
		if(!f.exists()){
			f.createNewFile();
		}
		FileReader fr=new FileReader(f);
		Properties pro=new Properties();
		pro.load(fr);
//		pro.list(System.out);
		String time=null;
		if((time=pro.getProperty("times"))==null){
			FileWriter fw=new FileWriter(f);
			pro.setProperty("times","1");
			pro.store(fw,"timer");
			fr.close();
			fw.close();
			return 0;
		}else{
			int i=Integer.parseInt(time);
			FileWriter fw=new FileWriter(f);
			pro.setProperty("times",String.valueOf(i+1));
			pro.store(fw,"timer");
			fr.close();
			fw.close();
			return i;	
		}
		
	}
	
	

}
