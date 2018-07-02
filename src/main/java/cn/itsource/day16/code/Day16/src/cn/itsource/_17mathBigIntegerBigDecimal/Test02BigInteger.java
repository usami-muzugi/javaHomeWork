package cn.itsource.day16.code.Day16.src.cn.itsource._17mathBigIntegerBigDecimal;

import java.math.BigInteger;

public class Test02BigInteger {
	/*BigInteger:
	 * 		��ʾ��һ�����������
	 * 		BigInteger ��һ����,�����˸�����������һ������
	 * 		�����һ������,��������һ������ĸ��������
	 * 
	 * ���췽��
	 * 
	 * 	BigInteger(String val) 
          �� BigInteger ��ʮ�����ַ�����ʾ��ʽת��Ϊ BigInteger��
	 * */
	public static void main(String[] args) {
		//BigInteger bi = 10;//�Զ�װ��,����������.�Զ�����װ��,ֻ���Ӧ�ð�װ�����
		
		BigInteger b1 = new BigInteger("1111111111111111111111111111");
		BigInteger b2 = new BigInteger("1111111111111111111111111111");
		System.out.println(b1);
		//System.out.println(b2+b1);
		System.out.println(b2.multiply(b1));
		System.out.println(b2.add(b1));

	}

}
