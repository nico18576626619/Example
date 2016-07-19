package learn.config;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileList2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getFileList(".java");
	}
/*将目录下所有.xxx结尾的文件复制到目标目录
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
					FileReader fr=new FileReader(file);
					BufferedReader br=new BufferedReader(fr);
					FileWriter fww=new FileWriter("d:\\testdemo\\"+file.getName());
					BufferedWriter buffw=new BufferedWriter(fww);
					String line=null;
					while((line=br.readLine())!=null){
						buffw.write(line);
						buffw.newLine();
					}
					br.close();
					buffw.close();
				}
			}
			if(file.isDirectory())
			fileList(file,suffix,fw);
		}
	}

}
