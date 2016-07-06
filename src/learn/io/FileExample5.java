package learn.io;

import java.io.File;

public class FileExample5 {

	public static void main(String[] args) {
		/*需求：遍历某个文件加下所有文件，并层级显示
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
//从path中获取文件名字
	private static String getFileName(String path) {
		// TODO Auto-generated method stub
		int index=path.lastIndexOf("\\");
		return path.substring(index,path.length());
	}
	
//分层
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
