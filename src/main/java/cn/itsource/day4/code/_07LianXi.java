package cn.itsource.day4.code;

class _07LianXi{
	/*
		1)����2��������������ݣ����� ���� a= 3;b=5; ���������ɣ�a=5,b=3;
	*/
	public static void main(String[] args) {
		int a = 6666666;
		int b = 5;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int temp = a;
		System.out.println("-------------------------"+a);
		a = b;
		b = temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
