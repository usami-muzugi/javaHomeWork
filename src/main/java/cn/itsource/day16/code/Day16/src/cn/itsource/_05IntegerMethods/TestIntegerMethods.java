package cn.itsource.day16.code.Day16.src.cn.itsource._05IntegerMethods;

public class TestIntegerMethods {
	/*
	 * Integer  �еĳ��÷���
	 * 		
	 * */
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		/*
		 * byte byteValue() �� byte ���ͷ��ظ� Integer ��ֵ�� 
		 * */
		byte byteValue = i1.byteValue();
		System.out.println(byteValue);
		
		/*static int parseInt(String s) ���ַ���������Ϊ�з��ŵ�ʮ�����������н����� 
		 * */
		int parseInt = Integer.parseInt("123");
		System.out.println(parseInt);
		
		System.out.println(i1.toString());
		
		String string = Integer.toString(123456);
		System.out.println(string);
		
		/*
		 * static Integer valueOf(int i) 
          		����һ����ʾָ���� int ֵ�� Integer ʵ���� 
		   static Integer valueOf(String s) 
          		���ر���ָ���� String ��ֵ�� Integer ���� 

		 * */
		
	}

}
