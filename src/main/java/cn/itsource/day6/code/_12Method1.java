package cn.itsource.day6.code;class _12Method1{
	/*
		���һ������,��������������
			����:
			ʹ��:
			ִ������:
			������ʹ��ע������
		��ô�ҵ���һ������?
		����ǩ��:��������+�����б�[����,����,˳�� ����һ��]	
		��������:��ͬһ������,����������ͬ,�����б�ͬ
			��ͬһ������,�����������������,��ɶ�Ӧ�Ĺ���,Ӧ������ͬ������,���ǿ��ܴ��ڲ�ͬ�Ĵ������
	*/
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		add(i,j);

		add(99,69);

		_12Method1.add(12,21);

		A.print();

		add(10,12,22);

		add("",12);
	}
	
	static void add(int a,int b){
		int sum = a+b;
		System.out.println(sum);
	}
	//���������������
	static void add(int a,int b,int c){
		int sum = a+b+c;
		System.out.println(sum);
	}
	static void add(String str,int age){
		System.out.println("�޲����ķ���");
	}

}

class A{
	static void print(){
		System.out.println("�õ���������");
	}
}