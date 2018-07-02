package cn.itsource.day16.code.Day16.src.cn.itsource._07Runtime;

import java.io.IOException;

public class TestRuntime {
	/*
	 * 1.ÿ�� Java Ӧ�ó�����һ�� Runtime ��ʵ��[����]��
	 * 
	 * 		ʲô��һ��javaӦ�ó���:java����д�õ���Ŀ[���]:�ӵ�JVM����
	 * 		Runtime,������Ӧ�ó�����һ�������,�����һ��Runtimeʵ������һ�������Ӧ�ó���
	 * 2.ʹӦ�ó����ܹ��������еĻ��������ӡ�
	 * 		JVM�����ĸ�ƽ̨[����ϵͳ]
	 * 3.����ͨ�� getRuntime ������ȡ��ǰ����ʱ��
	 * 		ͨ�������õ����� 
	   4.Ӧ�ó����ܴ����Լ��� Runtime ��ʵ���� 
	   		˽�л��˹��췽��
	 * */
	public static void main(String[] args) throws IOException{
		/*static Runtime getRuntime() 
          �����뵱ǰ Java Ӧ�ó�����ص�����ʱ���� 
		 * */
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		System.out.println(runtime1 == runtime2);
		
		/*
		 * int availableProcessors() 
          �� Java ��������ؿ��ô���������Ŀ�� 
		 * */
		int availableProcessors = runtime1.availableProcessors();
		System.out.println(availableProcessors);
		
		/*
		 * void exit(int status) 
          ͨ������������Ĺر����У���ֹ��ǰ�������е� Java ������� 
		 * */
		//runtime1.exit(0);
		
		/*
		 * Process exec(String command) 
          �ڵ����Ľ�����ִ��ָ�����ַ������ 
		 * */
		runtime1.exec("cmd");
		runtime1.exec("notePad");
		runtime1.exec("mspaint");
		runtime1.exec("calc");
		
		/*
		 *  long freeMemory() 
          ���� Java ������еĿ����ڴ����� 
		 * */
		long freeMemory = runtime1.freeMemory();
		System.out.println(freeMemory/1024/1024);
		
		/*
		 * void gc() 
          ���������������� 
		 * */
		
		/*
		 * long maxMemory() 
          ���� Java �������ͼʹ�õ�����ڴ����� 
		 * */
		System.out.println(runtime1.maxMemory()/1024/1024);
		
		/*
		 * long totalMemory() 
          ���� Java ������е��ڴ������� 
		 * */

	}

}
