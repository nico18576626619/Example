package learn.io;

import java.io.File;
import java.io.IOException;

public class FileExample3 {

	public static void main(String[] args) throws IOException {

//		booleandemo();
//		listrootDemo();
		filelistdemo();
		
	}
	
	private static void filelistdemo() {
		// TODO Auto-generated method stub
		File file = new File("c:\\");
		//调用list的封装的必须是目录，list数组创建不了
		String[] list = file.list();
		for(String str:list){
			System.out.println("str:"+str);
		}
	}

	private static void booleandemo() {
		// TODO Auto-generated method stub
		/*文件判断
		 * 
		 * 
		 * */
		
		File file=new File("a");
//		file.createNewFile();
//		file.mkdir();
		//判断文件是否存在
		boolean e=file.exists();
		System.out.println("e:"+e);
		//判断是否是目录
		boolean e2=file.isDirectory();
		System.out.println("e2:"+e2);
		
		//重命名
		File dest=new File("d:\\best");
		file.renameTo(dest);
	}

	private static void listrootDemo() {
		// TODO Auto-generated method stub
		File file = new File("d:\\");
		System.out.println("getTotalSpace"+file.getTotalSpace());
		System.out.println("getFreeSpace"+file.getFreeSpace());
		System.out.println("getUsableSpace"+file.getUsableSpace());
		
		
//		File[] listRoots = File.listRoots();
//		for(File file:listRoots){
//		System.out.println(file);
//		}
		
	}

}
