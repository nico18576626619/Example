package learn.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getFileList(".java");
	}
/*获取文件目录下某类文件清单
 *  
 * */
	private static void getFileList(String suffix) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("mulu.txt");
		BufferedWriter buffw=new BufferedWriter(fw);
		File f=new File("d:\\liuxin");
		fileList(f,suffix,buffw);
		buffw.close();
	}
	
	static void fileList(File f,String suffix,BufferedWriter fw) throws IOException{
		File[] filelist=f.listFiles();
		for(File file:filelist){
			String filename=file.getAbsolutePath();
			
			if(file.isFile()){
				if(filename.endsWith(suffix)){
				fw.write(filename);
				fw.newLine();
				}
			}
			if(file.isDirectory())
			fileList(file,suffix,fw);
		}
	}

}
