//package cn.itsoruce.domain;
import java.util.*;
public  class Package{
	/*
		package�����İ���Ҫ��java�ļ������
		javac -d . [java�ļ�]
		����: ������ʽ����ע�ʹ���ʱ�Ž��������� 'Package' 1 ������
		�˴������ִ�з�ʽ�ı�
	*/
	public static void main(String[] args){
		System.out.println("Hello World!");
		int[] arr = {4542,4321324,3167,656475654,65556,53424554,314312,315143,1241454,65857,413245,45,653435,44356,76756,77654,6656,2132676,90,915,678178,76};
		//java.util.Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}


	/*
	C:\JAVA\Java180606\2018-06-20-java��������﷨-DAY10\code-��ϰ>ls
'ls' �����ڲ����ⲿ���Ҳ���ǿ����еĳ���
���������ļ���

C:\JAVA\Java180606\2018-06-20-java��������﷨-DAY10\code-��ϰ>java cn.itsource.domain.Package
����: �Ҳ������޷��������� cn.itsource.domain.Package

C:\JAVA\Java180606\2018-06-20-java��������﷨-DAY10\code-��ϰ>java cn.itsoruce.domain.Package
Hello World!

C:\JAVA\Java180606\2018-06-20-java��������﷨-DAY10\code-��ϰ>
	
	*/
}