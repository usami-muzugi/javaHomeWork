package cn.itsource.day6.code;class _13MethodReturn{
	/*
		����return 
	*/
	public static void main(String[] args) {
		int i = 99;
		int sum = add(1,2);

		System.out.println("sum="+(sum+99));
		System.out.println(  add(23,89)   );
	}

	/*
		��� ���� ����
		���һ������,�����������ĺ�,�ú�!��Ҫ�����������������ۼ�,�ͻ����������ô�
		����������Ľ�����ظ�,������ʹ����!
		��,��������ֵ,��������ڲ�,���߷�������ֵ��λ��,�з���ֵ!!!�����Ӧ
		�ڷ�������ֵ������ѧϰ��,���ʽ,����֮��!�����Ľ��ֵ,Ҫôֱ��ʹ��,Ҫô��һ��������������Ȼ��ʹ��
	*/
	static int add(int a,int b){
		int sum = a+b;
		//System.out.println(a+b);
		return sum;
	}
}
