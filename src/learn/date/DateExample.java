package learn.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建date对象
		Date date=new Date();
		System.out.println(date);
		//获取时间毫秒值
		long time=date.getTime();
		System.out.println(time);
		
		//将毫秒值时间转换成date
		Date date1=new Date(time);
	
		//格式化日期
		DateFormat dateformat=DateFormat.getDateInstance(DateFormat.LONG);
		
		//默认格式
		dateformat=DateFormat.getDateInstance();
		
		//自定义格式
		dateformat=new SimpleDateFormat("yy*MM*dd");
		
		String datestr=dateformat.format(date1);
		System.out.println(datestr);
		//比较2个date时间
		int i=date1.compareTo(date);
		System.out.println(i);
		
		
		
		
		
	}

}
