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
		
		//通过java.util.Properties来读取配置文件
		Properties pro=new Properties();
		
		InputStream in = null;
		try {
			//从文件获取如果文件在src目录下则文件目录为./config.properties
			in = new FileInputStream("./src/config.properties");
			
//			//通过类加载器来获取
//			in=ReadProperties.class.getClassLoader().getSystemResourceAsStream("config.properties");
			
			//config.properties2
//			in=ClassLoader.getSystemResourceAsStream("config.properties");
			
			//在servlet中，还可以通过context来获取InputStream
//			in = Content.getResourceAsStream("filePath");
			
//			通过URL来获取
//			URL url = new URL("path"); 
//			in=url.openStream();
			
			//从输入流中读取属性列表（键和元素对）。
			pro.load(in);
			
			System.out.println(pro.getProperty("hitao.api.host"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
