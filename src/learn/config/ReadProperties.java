package learn.config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;


public class ReadProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ͨ��java.util.Properties����ȡ�����ļ�
		Properties pro=new Properties();
		
		InputStream in = null;
		try {
			//���ļ���ȡ����ļ���srcĿ¼�����ļ�Ŀ¼Ϊ./config.properties
			in = new FileInputStream("./src/config.properties");
			
//			//ͨ�������������ȡ
//			in=ReadProperties.class.getClassLoader().getSystemResourceAsStream("config.properties");
			
			//config.properties2
//			in=ClassLoader.getSystemResourceAsStream("config.properties");
			
			//��servlet�У�������ͨ��context����ȡInputStream
//			in = Content.getResourceAsStream("filePath");
			
//			ͨ��URL����ȡ
//			URL url = new URL("path"); 
//			in=url.openStream();
			
			//���������ж�ȡ�����б�����Ԫ�ضԣ���
			pro.load(in);
			
			System.out.println(pro.getProperty("hitao.api.host"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
