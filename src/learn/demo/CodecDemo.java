package learn.demo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CodecDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="ÁªÍ¨";
		byte[] bytes = str.getBytes("gbk");//-60,-29,-70,-61,
		//utf-8 -28,-67,-96,-27,-91,-67,
		//unicode -2,-1,79,96,89,125,	
		
//		printBytes(bytes);
		String str2=new String(bytes,"utf-8");
		System.out.println(str2);
		byte[] bytes2 = str.getBytes("utf-8");
		String str3=new String(bytes,"GBK");
		System.out.println(str3);
//		byte[] bytes2 = str2.getBytes("gbk");
//		printBytes(bytes2);
//		System.out.println(new String(bytes2,"unicode"));
		
		
	}

	private static void printBytes(byte[] bytes) {
		// TODO Auto-generated method stub
		for(byte b:bytes){
			System.out.print(b+",");
		}
	}

}
