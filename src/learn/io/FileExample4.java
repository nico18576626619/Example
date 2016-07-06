package learn.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*根据传入的后缀名过滤文件
		 * 
		 * */
		File file = new File("d:\\");
		
		String[] list=file.list(new FilterByName(".dat"));
//		String[] list = file.list();
		for(String str:list){
			System.out.println(str);
		}
	}
}
