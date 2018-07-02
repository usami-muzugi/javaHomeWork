package cn.itsource.day5.code;class _05BiJiao{
	/*
		==    !=     >  <    >=    <=    instanceof:�Ƚ�������������

		�Ƚ�������ֵ��������:��������  true false

		 instanceof:����ķ�ʽ
		 ֵ instanceof ��������[������������������]

		 ע��:����֧�������������͵ıȽ�

		 ʾ��:�ж�3�Ƿ����2,����С��5;
		  
	*/
	public static void main(String[] args) {
		System.out.println(10!=0);
		String str = "����";
		System.out.println(str instanceof String);
		//System.out.println(10 instanceof int);//_05BiJiao.java:16: ����: ���������
		System.out.println(2<3<5);//����: ��Ԫ[{Ԫ��} ���������� ]����� '<' �Ĳ��������ʹ���
	}
}
