package cn.itsource.day16.code.Day16.src.cn.itsource._12StringMethods;

public class TestStringMethods {
	/*
	 * String ���еĳ��÷���
	 * 		String  ���ַ����������ַ�,�����ַ��������,�ڲ����ַ�������
	 * 
	 * */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		char[] ch = {'A','B','C'};
		System.out.println(ch);
		
		/*char charAt(int index) ����ָ���������� char ֵ�� 
		 * */
		String ss = "F:/Java180606/ѧϰ����.txt";
		System.out.println(ss.charAt(1));
		/*String concat(String str) ��ָ���ַ������ӵ����ַ����Ľ�β�� 
		 * */
		String s3 = "UU";
		String concat = s3.concat(ss);//�˴����Ӳ�����һ���µĶ���[��Ϊ�ַ�������ֵ���ܸı�]
		System.out.println(concat);
		
		/*static String copyValueOf(char[] data) 
          ����ָ�������б�ʾ���ַ����е� String 
		 * */
		String copyValueOf = String.copyValueOf(ch);
		System.out.println(copyValueOf);
		
		/*boolean endsWith(String suffix) 
          ���Դ��ַ����Ƿ���ָ���ĺ�׺������ 
		 * */
		System.out.println(ss.endsWith("txt"));
		
		/*
		 * boolean isEmpty() ���ҽ��� length() Ϊ 0 ʱ���� true�� 
		 * */
		String s8 = "";
		System.out.println(s8.length());
		System.out.println(s8.isEmpty());
		
		/*String s9 = null;
		System.out.println(s9.isEmpty());*///java.lang.NullPointerException
		
		/*int lastIndexOf(int ch) 
          ����ָ���ַ��ڴ��ַ��������һ�γ��ִ��������� 
		 * */
		String s10 = "ABC";
		System.out.println(s10.lastIndexOf(66));;
		
		/*
		 * String replace(char oldChar, char newChar) 
          ����һ���µ��ַ���������ͨ���� newChar �滻���ַ����г��ֵ����� oldChar �õ��ġ� 
		 * */
		String s11 = "ABCDE";
		
		char oldChar = 'A';
		char newChar = 'H';
		String replace = s11.replace(oldChar, newChar);
		System.out.println(replace);
		/*
		 * boolean startsWith(String prefix) 
          ���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ�� 
		 * */
		
		/*
		 * String substring(int beginIndex) 
          ����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ����� 
		 * */
		System.out.println(s11.substring(1));
		System.out.println(s11.substring(1,3));
		
		/*char[] toCharArray() 
          �����ַ���ת��Ϊһ���µ��ַ����顣 
		 * */
		char[] charArray = s11.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}
		
		
		
		/*
		 * String trim() 
          �����ַ����ĸ���������ǰ���հ׺�β���հס� 
		 * */
		
		String str = "  jfskdjf fsdfj    ";
		String trim = str.trim();
		System.out.println(trim);
	}

}
