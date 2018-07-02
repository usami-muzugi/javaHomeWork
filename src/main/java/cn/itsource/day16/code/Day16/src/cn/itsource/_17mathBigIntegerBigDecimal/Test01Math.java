package cn.itsource.day16.code.Day16.src.cn.itsource._17mathBigIntegerBigDecimal;

public class Test01Math {
	/*
	 * Math ��ѧ������ص���,�ṩ��һЩ����,���ڼ���
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		/*static int abs(int a) ���� int ֵ�ľ���ֵ��|-5| */
		int abs = Math.abs(10);
		System.out.println(abs);
		
		/*static double acos(double a)����һ��ֵ�ķ����ң����صĽǶȷ�Χ�� 0.0 �� pi ֮�䡣 */
		System.out.println(Math.acos(0.06));
		
		/*static double cbrt(double a )  ���� double ֵ���������� */
		System.out.println(Math.cbrt(8));;
		
		/*static int max(int a, int b)    �������� int ֵ�нϴ��һ���� */
		System.out.println(Math.max(10, 20));
		
		/*static double pow(double a, double b) ���ص�һ�������ĵڶ����������ݵ�ֵ�� */
		System.out.println(Math.pow(2, 3));
		
		/*static double random()  ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0�� */
		System.out.println(Math.random());
	}

}
