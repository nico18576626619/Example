package learn.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class MergeFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("d:\\Test");
		MergeFile(file);
	}
	public static void MergeFile(File dir) throws IOException{
		File[] listFiles = dir.listFiles(new buffixfilter(".part"));
		ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
		for(int i=0;i<listFiles.length;i++){
			al.add(new FileInputStream(listFiles[i]));
		}
		Enumeration<FileInputStream> e=Collections.enumeration(al);
		//ºÏ²¢Á÷
		SequenceInputStream sis=new SequenceInputStream(e);
		byte[] b=new byte[1024];
		int len=0;
		FileOutputStream fos=new FileOutputStream("d:\\tt\\all1.txt");
		while((len=sis.read(b))!=-1){
			fos.write(b, 0, len);
		}
		sis.close();
		fos.close();
	}
}
