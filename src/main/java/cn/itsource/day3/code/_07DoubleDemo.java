package cn.itsource.day3.code;

class _07DoubleDemo{
	/*
		�����������ݵ���ʾ:
			float:������  3.14f
			double:˫����

		������: ֻ�����Ͳ���ֵ
		������: ����﷨,�Ƿ���Ϲ涨

		������,����׼����ֵ:1.0 �������������������1.0   ֻ�Ǳ�ʾ��һ�����޽ӽ�1.0��ֵ
		1.3*1.4 = 1.82 
		��ô�õ���׼�ĸ�������?
		java���ṩ��:BigDecimal������ʾ��׼�ĸ�����
	*/
	public static void main(String[] args) {
		float f = 3.14f;//3.14Ĭ�ϵ�������double����
		double d = 3.14;

		System.out.println( 3.14e2 );//��ѧ������,��ʾ�������͵�����:����Ҳ�ǿ���ֱ��ʹ�õ�
		System.out.println( 1.3*1.4 );
	}
}
