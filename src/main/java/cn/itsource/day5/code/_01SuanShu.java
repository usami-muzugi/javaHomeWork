package cn.itsource.day5.code;class _01SuanShu{
	/*
		1)�ӷ���+��������-���˷� ��*�� ����(/) ȡģ(%)
		1.�ӷ���ֵ���ۼ�
		2.�ַ��������ַ���ƴ��
	*/
	public static void main(String[] args) {
		System.out.println(3+4+1.5);//8.5
		System.out.println("С��"+4);

		System.out.println(4-1.5);//2.5
		System.out.println(1.3*4.4);//������,һ������׼������,���޽ӽ��ڱ����һ������

		System.out.println(1.2/4);//0.3
		//System.out.println(1/0);//����Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(1.0/0);//Infinity:�����
		System.out.println(0.0/0.0);//NaN not a number����һ������
		//java������������������
		System.out.println(0.0/0.0==0.0/0.0);
		//System.out.println(NaN == NaN);//NaN������һ������!������,������,�������Ƿ���

		System.out.println(5%3.0);//2
	}
}
