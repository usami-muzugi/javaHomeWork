package cn.itsource.day16.code.Day16.src.cn.itsource._17mathBigIntegerBigDecimal;

import java.math.BigDecimal;

public class Test03BigDecimal {
	/*
	 * BigDecimal:��ʾ��һ������׼�ĸ�����
	 * 		BigDecimal:һ����,�����˸���׼�ĸ���������һ������
	 * 		һ������,������һ������ĸ���׼�ĸ�����
	 * 
	 * BigDecimal(double val) 
          �� double ת��Ϊ BigDecimal�������� double �Ķ����Ƹ���ֵ׼ȷ��ʮ���Ʊ�ʾ��ʽ��
	 * BigDecimal(String val) 
          �� BigDecimal ���ַ�����ʾ��ʽת��Ϊ BigDecimal��
	 * */
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal(1.3);
		BigDecimal b2 = new BigDecimal(1.4);
		System.out.println(b1.multiply(b2));//�����ʼ���ĸ�����ֵ�Ͳ���׼
		
		BigDecimal b3 = new BigDecimal("1.3");
		BigDecimal b4 = new BigDecimal("1.4");
		System.out.println(b3.multiply(b4));

	}

}
