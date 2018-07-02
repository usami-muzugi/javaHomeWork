package cn.itsource.day16.code.Day16.src.cn.itsource._20Date;

import java.util.Date;

public class TestDate {
	/*
	 * Date���ʹ��:
	 * 		�� JDK 1.1 ֮ǰ���� Date �����������ĺ���������������ڽ���Ϊ�ꡢ�¡��ա�Сʱ�����Ӻ���ֵ��
	 * 			1.���� ��Date��,�ṩ�ķ���ֱ�ӻ�õ� �� �� �� ʱ �� ��
	 *      ��Ҳ�����ʽ���ͽ��������ַ�����
	 *      	1.���Խ����ڶ����ʽ�����ַ���
	 *      	2.���Խ�һ����ʾ���ڵ��ַ���,���������ڶ���"2018-07-01 15:21"
	 *      ��������Щ������ API ������ʵ�ֹ��ʻ���
	 *      �� JDK 1.1 ��ʼ��Ӧ��ʹ�� Calendar ��ʵ�����ں�ʱ���ֶ�֮��ת����
	 *      	1.Calendar �����ʱ�����ڵ��ֶ�ֵ[  ��ʱ�������ֶε�ֵ,��Date   ��   �ֶ�֮���໥ת��]
	 *      ʹ�� DateFormat ������ʽ���ͽ��������ַ�����Date �е���Ӧ�����ѷ�����
	 * 			1.DateFormat���Խ����ڶ����ʽ�����ַ���
	 *      	2.DateFormat���Խ�һ����ʾ���ڵ��ַ���,���������ڶ���   "2018-07-01 15:21"
	 * 		
	 * 		Date ��õõ�ǰϵͳ��ʱ��
	 * 		Date() 
          		���� Date ���󲢳�ʼ���˶����Ա�ʾ��������ʱ�䣨��ȷ�����룩��
          	Date(long date) 
	          	���� Date ���󲢳�ʼ���˶���
	          	�Ա�ʾ�Դӱ�׼��׼ʱ�䣨��Ϊ����Ԫ��epoch�������� 1970 �� 1 �� 1 �� 00:00:00 GMT��������ָ����������
	 * */
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);//Ĭ�ϸ�ʽSun Jul 01 15:25:10 GMT+08:00 2018
		
		Date date2 = new Date(System.currentTimeMillis() - 86400*1000);
		System.out.println(date2);

	}

}
