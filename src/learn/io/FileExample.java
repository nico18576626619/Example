package learn.io;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;


public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 文件处理示例，其他可以查看File API文档
		 */
		// 创建文件对象
		
		//文件名以创建时间为名字
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("MMddHHmmss");
		String time=df.format(d);
		
		
		System.out.println(time);
		String path="D:/"+time+".txt";
		File f = new File(path);
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
			
			
//			// f.exists()判断文件是否已经存在
//			if (f.exists()) {
//				System.out.println("文件已存在");
//			} else {
//				// D:/f.txt文件目录下不存在f.txt时创建一个新文件
//				f.createNewFile();
//			}
//
//			// getTotalSpace()获取文件所在分区总容量
//			System.out.println("文件分区大小:" + f.getTotalSpace());
//			// getName()获取文件或者目录的名称
//			System.out.println("文件或目录的名称:" + f.getName());
//			// getName()获取文件或者目录完整路径
//			System.out.println("文件或目录的名称:" + f.getPath());
//			// getParent()获取父目录路径
//			System.out.println("文件或目录的名称:" + f.getParent());
//			// list()获取目录下的所有文件或者目录，返回一个字符串数组
//			String[] list = f.list();
//			// isFile()判断是否是标准的文件
//			if (!f.isFile())
//				for (String i : list) {
//					System.out.println(i);
//				}
//
//			System.out.println("文件长度:" + f.toURI());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
