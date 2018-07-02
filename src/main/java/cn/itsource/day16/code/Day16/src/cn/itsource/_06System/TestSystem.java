package cn.itsource.day16.code.Day16.src.cn.itsource._06System;

import java.util.Arrays;
import java.util.Map;

public class TestSystem {
	/*
	 * System:System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������
	 * 
	 * 		��Ϊ���췽��˽�л�,���Բ��ܴ�������
	 * */
	public static void main(String[] args) {
		/*
		 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
          ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý����� 
          
          Object :���еĶ������鶼ʵ����Object�еķ���
          Object obj = new  Student();
          Object ob = new int[];
		 * */
		int[] src = {1,2,3,4,5,6};
		int[] dest = new int[3];
		System.arraycopy(src, 0, dest, 0, 3);
		System.out.println(Arrays.toString(dest));
		/*
		 * static void exit(int status) 
          ��ֹ��ǰ�������е� Java ������� */
		
		System.exit(0);
		
		/*
		 * static long currentTimeMillis() 
          �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣 
		 * */
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
		/*
		 * static void gc() ���������������� 
		 *  ʲô������:������ʧȥ����,���ڴ���,ռ�ÿռ��,�������ջ���,��������������
		 *  Ϊ��������������һЩŬ������:�����൱��һ��֪ͨ,���ǲ�һ������������
		 * */
		System.gc();
		
		/*
		 * static Map<String,String> getenv() 
          ����һ�������޸ĵĵ�ǰϵͳ�������ַ���ӳ����ͼ�� 
		 * */
		Map<String, String> getenv = System.getenv();
		System.out.println(getenv);
		
		/*
		 * static long nanoTime() 
          ������׼ȷ�Ŀ���ϵͳ��ʱ���ĵ�ǰֵ���Ժ�΢��Ϊ��λ�� 
		 * */
		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);
		
	
		
		

	}

}
