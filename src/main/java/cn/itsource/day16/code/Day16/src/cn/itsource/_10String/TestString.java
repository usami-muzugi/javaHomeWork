package cn.itsource.day16.code.Day16.src.cn.itsource._10String;

public class TestString {
	/*
	 * String�ַ��������ķ�ʽ
	 *		String str = "С��";
	 *String() 
          ��ʼ��һ���´����� String ����ʹ���ʾһ�����ַ����С�
      String(String original) 
          ��ʼ��һ���´����� String ����ʹ���ʾһ���������ͬ���ַ����У����仰˵���´������ַ����Ǹò����ַ����ĸ�����
	  
	  ����Ĺ��췽��,��IO�����˽�
	 * */
	public static void main(String[] args) {
		String string = new String();
		System.out.println(string);
		
		/*
		 * ���ַ���[ ��󿪷��ж��ַ���Ϊ�յ����]
		 * */
		String str = "";//һ���ַ���,û���ַ�
		String stt = null;//û���ַ�������
		
		String string2 = new String("����");//string2�������᲻����ͬһ������
		System.out.println(string2);

	}

}
