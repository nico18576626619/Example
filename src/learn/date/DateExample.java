package learn.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=LoggerFactory.getLogger("DateExample.class");
		//����date����
		Date date=new Date();
		log.info(date.toString());
		//��ȡʱ�����ֵ
		long time=date.getTime();
		System.out.println(time);
		
		//������ֵʱ��ת����date
		Date date1=new Date(time);
	
		//��ʽ������
		DateFormat dateformat=DateFormat.getDateInstance(DateFormat.LONG);
		
		//Ĭ�ϸ�ʽ
		dateformat=DateFormat.getDateInstance();
		
		//�Զ����ʽ
		dateformat=new SimpleDateFormat("yy*MM*dd");
		
		String datestr=dateformat.format(date1);
		System.out.println(datestr);
		//�Ƚ�2��dateʱ��
		int i=date1.compareTo(date);
		System.out.println(i);
		
		Calendar
		
		
		
	}

}
