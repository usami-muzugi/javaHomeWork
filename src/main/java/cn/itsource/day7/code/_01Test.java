package cn.itsource.day7.code;

class _01Test{
	/*
		���������:
			���һ������,�����������ĺ�
			�������������ĺ�
			���������ĺ�
			6
			8
			9
			12
			99
			10000

			��û��һ�ַ�ʽ,����һ�δ���������:   
				�������͵Ĳ���,������һ���Դ�����

						
			
	*/
	public static void main(String[] args) {
		add(10,20);
		add(15,20,30);
	}
	static void add(int a,int b){
		System.out.println(a+b);
	}
	static void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
}
