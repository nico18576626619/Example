package learn.config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;


public class ReadProperties_Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ͨ��java.util.ResourceBundle������ȡ�����ַ�ʽ��ʹ��PropertiesҪ����һЩ��
		//1��ͨ��ResourceBundle.getBundle()��̬��������ȡ��ResourceBundle��һ�������ࣩ�����ַ�ʽ����ȡproperties�����ļ�����Ҫ��.properties��׺����ֻ��Ҫ�ļ������ɡ�
		
		ResourceBundle rb=ResourceBundle.getBundle("config");//��κ������ͬһĿ¼ֱ����д�ļ������ɣ�����Ƿ���ĳ�����£���pathδxx/xx/�ļ���
		System.out.println(rb.getString("dataFolder"));
		
		
	}

}
