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
		//����list�ķ�װ�ı�����Ŀ¼��list���鴴������
		String[] list = file.list();
		for(String str:list){
			System.out.println("str:"+str);
		}
	}

	private static void booleandemo() {
		// TODO Auto-generated method stub
		/*�ļ��ж�
		 * 
		 * 
		 * */
		
		File file=new File("a");
//		file.createNewFile();
//		file.mkdir();
		//�ж��ļ��Ƿ����
		boolean e=file.exists();
		System.out.println("e:"+e);
		//�ж��Ƿ���Ŀ¼
		boolean e2=file.isDirectory();
		System.out.println("e2:"+e2);
		
		//������
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
