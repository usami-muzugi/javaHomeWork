package cn.itsource.day16.code.Day16.src.cn.itsource._13HW;

public class Test2 {
	/*
	 * 2���ҳ������� ������������  --   ���װ��   --  String ֮���໥ת���ķ���
		���磺
		  int  ת  Integer   new Integer(10);
		  Integer ת int
		  int  ת  String     
		  String ת int
		  Integer ת  String
		  String  ת  Integer
			 
			 
		  byte ---  Byte
		  Byte ---byte
		  byte ---String
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Integer i1 = new Integer(10);//�ֶ�װ�佫intתInteger
		Integer i2 = 10;//�Զ�װ��
		
		int i3 = i1.intValue();//Integer תint
		int i4 = i1;//�Զ�Integer תint
		
		/*static String valueOf(int i)    ���� int �������ַ�����ʾ��ʽ�� */
		String valueOf = String.valueOf(10);
		
		/*String --> int  */
		/*static int parseInt(String s)���ַ���������Ϊ�з��ŵ�ʮ�����������н����� */
		int parseInt = Integer.parseInt("10");
		
		/*���ת*/
		int i5 = new Integer("10");
		
		Integer i6 = new Integer("10");
		

	}

}
