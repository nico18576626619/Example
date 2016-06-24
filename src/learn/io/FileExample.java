package learn.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * �ļ�����ʾ�����������Բ鿴File API�ĵ�
		 */
		// �����ļ�����
		File f = new File("D:/f.txt");
		try {
			// f.exists()�ж��ļ��Ƿ��Ѿ�����
			if (f.exists()) {
				System.out.println("�ļ��Ѵ���");
			} else {
				// D:/f.txt�ļ�Ŀ¼�²�����f.txtʱ����һ�����ļ�
				f.createNewFile();
			}

			// getTotalSpace()��ȡ�ļ����ڷ���������
			System.out.println("�ļ�������С:" + f.getTotalSpace());
			// getName()��ȡ�ļ�����Ŀ¼������
			System.out.println("�ļ���Ŀ¼������:" + f.getName());
			// getName()��ȡ�ļ�����Ŀ¼����·��
			System.out.println("�ļ���Ŀ¼������:" + f.getPath());
			// getParent()��ȡ��Ŀ¼·��
			System.out.println("�ļ���Ŀ¼������:" + f.getParent());
			// list()��ȡĿ¼�µ������ļ�����Ŀ¼������һ���ַ�������
			String[] list = f.list();
			// isFile()�ж��Ƿ��Ǳ�׼���ļ�
			if (!f.isFile())
				for (String i : list) {
					System.out.println(i);
				}

			System.out.println("�ļ�����:" + f.toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
