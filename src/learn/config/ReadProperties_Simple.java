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
		//二、通过java.util.ResourceBundle类来读取，这种方式比使用Properties要方便一些。
		//1、通过ResourceBundle.getBundle()静态方法来获取（ResourceBundle是一个抽象类），这种方式来获取properties属性文件不需要加.properties后缀名，只需要文件名即可。
		
		ResourceBundle rb=ResourceBundle.getBundle("config");//如何和类放在同一目录直接填写文件名即可，如果是放在某个包下，则path未xx/xx/文件名
		System.out.println(rb.getString("dataFolder"));
		
		
	}

}
