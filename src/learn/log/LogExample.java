package learn.log;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LoggerFactory.getLogger("LogExample.class");
		int x=1;
		int y=1;
		log.info("x:{} y:{}",x,y);
	
	}
}
