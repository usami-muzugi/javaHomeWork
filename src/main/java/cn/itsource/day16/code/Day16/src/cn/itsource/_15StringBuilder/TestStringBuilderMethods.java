package cn.itsource.day16.code.Day16.src.cn.itsource._15StringBuilder;

public class TestStringBuilderMethods {
	/*
	 *  1.����StringBuidler�ڲ�����
	 *  2.�ַ�����:�ڲ����ַ������ڴ�,�ַ�����
	 *  3.��������Ĳ���! �� ɾ �� ��
	 * 
	 * */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//�ڲ������ʼ����16
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(true);
		sb.append("���");
		sb.append(3.14);
		sb.append('A');
		sb.append(10);
		System.out.println(sb);//String toString();
		sb.append("ƻ����").append("ҫ��").append("����").append("�ֱ�");//sb.append���ض���ͬһ��������
		System.out.println(sb);//String toString();
		
		/*int capacity()���ص�ǰ������ */
		System.out.println(sb.capacity());
		
		/*int length() ���س��ȣ��ַ������� */
		System.out.println(sb.length());;
		
		/*char charAt(int index)���ش�������ָ���������� char ֵ�� */
		
		System.out.println(sb.charAt(3));;
		
		/*StringBuilder delete(int start, int end)   �Ƴ������е����ַ����е��ַ��� */
		sb.delete(0, 6);
		
		System.out.println(sb);
		
		/*void ensureCapacity(int minimumCapacity)    ȷ���������ٵ���ָ������Сֵ��
		 *�ڲ������ǻ�����:
		 *
		 *  */
		sb.ensureCapacity(10000);
		System.out.println(sb.capacity());
		
		/*
		 * int indexOf(String str) 
          ���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е������� 
		 * */
		System.out.println(sb.indexOf("ƻ����"));
		
		/*StringBuilder insert(int offset, String str) ���ַ���������ַ������С� */
		System.out.println(sb);
		sb.insert(12, "�ֹ�");
		System.out.println(sb);
		
		/*StringBuilder replace(int start, int end, String str) 
          ʹ�ø��� String �е��ַ��滻�����е����ַ����е��ַ��� */
		
		/*StringBuilder reverse() �����ַ��������䷴ת��ʽȡ���� */
		System.out.println(sb.reverse());
		
		/*void setLength(int newLength)  �����ַ����еĳ��ȡ� */
		sb.setLength(50);
		System.out.println(sb);
		
		System.out.println(sb.insert(46, "��ǩ"));
		
		/*
		 * String toString() 
			          ���ش����������ݵ��ַ�����ʾ��ʽ�� 
			 void trimToSize() 
			          ���Լ��������ַ����еĴ洢�ռ䡣 

		 * */
		String string = sb.toString();
		System.out.println(string);
		
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
	}

}
