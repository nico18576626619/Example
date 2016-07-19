package learn.io;

import java.io.File;

public class FileExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\app");
		DeleteAll(file);
	}
	/*删除目录下所有文件
	 * 
	 * 
	 * */

	private static void DeleteAll(File file) {
		// TODO Auto-generated method stub
		if (file.isFile())
			file.delete();
		if (file.isDirectory()) {
			File[] listFiles = file.listFiles();
			if (listFiles.length == 0) {
				file.delete();
			} else {
				for (File f : listFiles) {
					DeleteAll(f);
				}
			}
		}
		file.delete();
	}

}
