package learn.io;

import java.io.File;

public class FileExample5 {

	public static void main(String[] args) {
		/*���󣺱���ĳ���ļ����������ļ������㼶��ʾ
		 * 
		 * */
		File file=new File("D:\\liuxin");
		listAll(file,0);
	}

	private static void listAll(File file,int level) {
		// TODO Auto-generated method stub
		level++;
		File[] listFiles = file.listFiles();
		for(File list:listFiles){
			System.out.println(getSpace(level)+getFileName(list.getPath()));
			if(list.isDirectory()){
				listAll(list, level);
			}
		}
	}
//��path�л�ȡ�ļ�����
	private static String getFileName(String path) {
		// TODO Auto-generated method stub
		int index=path.lastIndexOf("\\");
		return path.substring(index,path.length());
	}
	
//�ֲ�
	private static String getSpace(int level) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<level;i++){
			if(i==0){
			sb.append("|--");
			}else{
				sb.insert(0,"|  ");
			}
		}
		return sb.toString();
	}

}
