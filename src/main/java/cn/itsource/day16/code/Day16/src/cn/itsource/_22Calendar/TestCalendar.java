package cn.itsource.day16.code.Day16.src.cn.itsource._22Calendar;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	/*
	 * Calendar:���������ڵ�  �ֶ�ֵ ������ʱ����
	 * static Calendar getInstance() 
          		ʹ��Ĭ��ʱ�������Ի������һ���������� 
	 * 
	 * */
	public static void main(String[] args) {
		Calendar instance = Calendar.getInstance();
		System.out.println(instance);
		
		/*
		 * һ����Ϊ�ֶζ����ṩgetset
		 * instance.get(int field)
		 * 
		 * 
		 * 
		 * 
		 * */
		int YEAR = instance.get(Calendar.YEAR);
		int MONTH = instance.get(Calendar.MONTH)+1;
		int DAY_OF_MONTH = instance.get(Calendar.DAY_OF_MONTH);
		int HOUR = instance.get(Calendar.HOUR);
		int MINUTE = instance.get(Calendar.MINUTE);
		int SECOND = instance.get(Calendar.SECOND);
		System.out.println(YEAR +"��"+MONTH+"��"+ DAY_OF_MONTH+"��"+ HOUR+"ʱ"+ MINUTE+"��"+ SECOND+"��");
	
		instance.set(Calendar.YEAR, 2050);
		System.out.println(instance);
		
		Date time = instance.getTime();
		System.out.println(time);
		
		instance.setTime(time);//�����ڶ���,��ʼ������������,����ͨ����������,���ʱ�����ڵ��ֶ�ֵ
		System.out.println(instance.get(Calendar.YEAR));
	
	}

}
