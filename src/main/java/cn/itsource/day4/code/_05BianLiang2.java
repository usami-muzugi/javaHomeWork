package cn.itsource.day4.code;

class _05BianLiang2{
	/*
			4.�����ķ���
				��Ա����:д����Ľṹ���еı�����Ϊ��Ա����
					1.��Ա����,�����������ʹ���Ĭ��ֵ
					2.char��Ĭ��ֵ�Ƚ�����,�˴�û������!
				�ֲ�����:д�ڷ����ڲ��ı���,�����ֲ�����
					1.�����Ա�����;ֲ�����ͬ��,���þֲ�����[�ͽ�ԭ��]
					2.�ֲ�������ʹ��֮ǰ,�����ʼ��ֵ;

				��Ա�����ֲ��������ص�:
					1.�ֲ�����:Ϊ�˸�����������ɶ���ʱ���ڵ�,�������н���,�ֲ���������������Ҳ������
					2.��Ա����:ֵ���Ŷ���Ĵ��ڶ�һֱ����[��������,���Ŷ�����������ڴ��ڶ�����]
				
			5.������������
				1,��Ա����:��Ľṹ����ȫ�ֶ����Է���
				2,�ⲿ�ṹ���еı���,�ڲ��ṹ�������
				3,�ڲ��ṹ���صı���,�Լ������õ����ⲿ��������
				4,ͬһ����������[��ʵ����ͬһ���ṹ��[��ṹ��,�����ṹ��]],���ܴ�����ͬ�ı�����
	*/
	static int i = 10;//����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� i
	static int j;
	static double k;
	static String str;
	public static void main(String[] args) {
		int i = 36;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(str);//�����������͵�Ĭ��ֵ����null  ��ʾû��ָ��һ������ĵ�ַ[�������ݵ����õ�ַ]
		char c;
		c = 'A';
		System.out.println(c);

		{	
			//String y = "ABC";
			int y = 20;
			System.out.println(y);
		}

		//System.out.println(y);

		add(10);
		add(20);
	}

	public static void add(int num){
		int k = num;
		System.out.println("K = "+k);
	}
}
