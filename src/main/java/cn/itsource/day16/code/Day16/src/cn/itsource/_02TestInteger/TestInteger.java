package cn.itsource.day16.code.Day16.src.cn.itsource._02TestInteger;

public class TestInteger {
	/*
	 * 	��װ���ѧϰ:ͨ��Integer ѧϰ,�԰�װ�����㹻����ʶ
	 *  Integer����:��ʾ����������,Ϊint�����ṩ��һ����
	 *  
	 *  Integer ���췽����ѧϰ
	 *  
	 *  	Integer(int value) 
			          ����һ���·���� Integer ��������ʾָ���� int ֵ�� 
			Integer(String s) 
			          ����һ���·���� Integer ��������ʾ String ������ָʾ�� int ֵ�� 
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		
		Integer i1 = new Integer(10);
		System.out.println(i1);
		
		Integer integer = new Integer("10");
		System.out.println(integer);
		/*
		 * �Ĵ�ʽ
		 * 		1.���Ʊ������Ϣ:java.lang.NumberFormatException
		 * 			��Ӧ�ó�����ͼ���ַ���ת����һ����ֵ���ͣ������ַ�������ת��Ϊ�ʵ���ʽʱ���׳����쳣��
		 * 		2.�ڱ�����Ϣ,���Կ�����ĵ�������һ��:
		 * 			�鿴���ܱ���ĵط�,����:�׳��� NumberFormatException - ��� String �������ɽ�����������
				3.ɾ����:����д����,д��һ�����ܾͻ�����һ��,�����᲻��������
				4.deBug:ʹ��Eclipse����һ��һ�е����д���
		 * 
		 * */
		Integer integer1 = new Integer("A");
		System.out.println(integer1);

	}

}
