package cn.itsource.day16.code.Day16.src.cn.itsource._04XY;

public class Test {
	/*
	 * ��Ԫģʽ:����,����[Ԫ��,���������]
	 * 		ʲô����Ԫģʽ:
	 * 		����������:�����õ�ֵ����������[-128 ~ 127]
	 * 
	 * */
	public static void main(String[] args) {
		/*
		 * [-128~127]����,����Integer�Ķ���!
		 * �����ø�ֵ��ʽ,���ȵ������в����Ƿ���ֵ������,�����,ֱ��ʹ�����õ�ַ
		 * */
		Integer i1 = 20;
		Integer i2 = 20;
		System.out.println(i1 == i2);//�˴������ڲ���Ƚ�ֵ
		/*
		 * ������new  �����ڶ��ڴ���,����һ���µĶ���,����ĵ�ֵַ��һ��
		 * */
		Integer i3 = new Integer(20);
		Integer i4 = new Integer(20);
		
		System.out.println("i3 == i1  "+(i3 == i1));
		System.out.println(i3 == i4);
		/*��ֵ��Χ��������ֵ�ķ�Χ,�Զ���������
		 * */
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);
		
		/*
		 * ����ȽϵĶ���Integer ����:
		 * */
		System.out.println(i1.equals(i2));//true
		System.out.println(i1.equals(i3));//true
		System.out.println(i3.equals(i4));//true
		
		/*��ǿ��,����Ƚϻ�����equals
		 *java��Integer  �Ѿ���д��equals
		 * */
		
	}

}
