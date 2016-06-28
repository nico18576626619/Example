package Runtimedemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Exccmd2 {
	private static int numberRead;

	public static void main(String[] args) {  
 
            Runtime rt = Runtime.getRuntime();  
            Process pr;
            byte[] ch=new byte[10];
			try {
				pr = rt.exec("cmd /c dir");
				InputStream is=	pr.getInputStream();
				while(is.read(ch)!=-1);{
					for(int i=0;i<10;i++){
						System.out.println(ch[i]);
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // cmd /c calc  
            // Process pr = rt.exec("D:\\xunlei\\project.aspx");  
            
    
	}
}
