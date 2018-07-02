package cn.itsource.day6.code;class _15Method{
	/*
		����ʹ�õĳ�������
				1.���Է���ÿ��ʹ�ö���һ�ζ�����ʹ��
				2.����ִ��ִ��˳����ģ��
				3.�������ô���ֻʹ���˷������֣�ȱ�ٲ����б�
				4.�з���ֵ�ķ���ʹ��
					a)ʹ���˷�������û��ʹ�÷����Ľ��ֵ�� ��ӡ��������� ��
					b)���������Ѿ�ʹ�÷�������ӡ����������ٴε��÷���ʹ�ý�������������ظ�ʹ�á�
				5.û����ֵ�ķ���ʹ��
					a)��û�з���ֵ�ķ�����void���������÷����ӡ���С����
	*/
	public static void main(String[] args) {
		add(15,16);

		add(24,18);

		//add();
		
		add(12);
		System.out.println( add(12) );

		System.out.println(  add(12,23)  );//_15Method.java:23: ����: �˴�������ʹ�� '��' ����
	}
	static int add(int a){
		System.out.println(a);
		return a-12;//�˴����ص���ֵ,���Ǳ���,Ҳ���Ǳ��ʽ
	}
	static void add(int a,int b){
		System.out.println(a+b);
	}

}
