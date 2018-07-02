package cn.itsource.day17.code.Day17_Execption.src.cn.itsource._01Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestException {
	/*
	 * �����쳣
	 * */
	public static void main(String[] args) throws ParseException, IOException {
//		System.out.println(1/0);//java.lang.ArithmeticException: / by zero  ����ʱ
//		System.out.println("Hello    ");
		
//		int[] arr = {12};
//		arr[arr.length] = 100; //java.lang.ArrayIndexOutOfBoundsException: 1 ����Խ�� ����ʱ
		
//		int[] arr = null;
//		System.out.println(arr.length);//java.lang.NullPointerException
		
		//new Integer("A");//java.lang.NumberFormatException
		
//		String str = "123456";
//		new SimpleDateFormat().parse(str);//ParseException  ����ʱ,���봦��
		
		Runtime.getRuntime().exec("cmd");//IOException ����ʱ���봦��
		
	}

}
