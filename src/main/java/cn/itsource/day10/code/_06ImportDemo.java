package cn.itsource.day10.code;//package cn.itsource;//����д��������
import java.util.Arrays;//���,��Ϊ׼ȷ���ҵ���ָ��������
//import java.util.*;
//import *;//import java.*;//����ʹ��ͨ���
class _06ImportDemo{
	/*
		1.��һ��������Ҫʹ�õ������İ��е��࣬�����ȵ����ڱ�ݵ�ʹ��
		2.Ŀ�ģ� ��Ϊ����ȷ�����õ�ָ��������
		3.ע�⣺ ������Ĵ���Ӧ�����������ĺ��棬�������ǰ��
		4.������﷨ �� 
			1)import ����.�Ӱ���.������
			2)import ����.�Ӱ���.*;//*ͨ�����ͨ����Ӱ���������е���
		5.�����ע������
			3)ͨһ������ͬʱ�õ���java.util.Date   java.sql.Date   ����������˶����ԣ�����ͨ����ȫ�޶����ķ�ʽʹ��
			4)java.lang����Java�涨�ĺ��İ���ʹ�õ�ʱ����Զ����룬���Բ����ֶ�����
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,324,53,45,2345};
		Arrays.sort(arr);
		String str = Arrays.toString(arr);
		System.out.println(str);

		java.util.Date date1 = new java.util.Date();
		java.sql.Date date2 = new java.sql.Date(1L);

		String name = "С����";
		System.out.println(name);

		Thread t = new Thread();
	}
}
