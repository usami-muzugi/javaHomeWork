package cn.itsource.day4.code;

class _01AutoChange{
	/*
		�Զ�����ת��:
	
	*/
	public static void main(String[] args) {
		//1)�������͹��� �� ���
		byte b = 10;//10 ������int,�Զ�ת:    �������
		System.out.println(b);//���b��byte���� ,int�����byte����,�����Զ�����ת��
		//float f = 1.5;//�����Զ�ת��

		//byte bb = 128;//����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		//long g = 2147483648;//����: ���������: 2147483648

		//long  float  doubleֻҪ��������������һ�����������͵ģ���һ���ͻᱻת������Ӧ���ͣ����ҽ��Ҳ�Ǹ�����:
		int num = 10;
		double i = 3.14;
		//int sum = num+i;//����: �����ݵ�����: ��doubleת����int���ܻ�����ʧ
		double sum = num+i;
		System.out.println(sum);

		//�����ͻ���ת���ɸ�����,Ȼ���������
		//System.out.println(1/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(1.0/0);//0��������0.0,    0.0����0����һ�����߽ӽ���0����//     Infinity�����

		//3)���2��������������byte��short��char��int����������ת��Ϊint���ͣ����ҽ��Ҳ��int���Զ�����ת�ͣ�
		//4)char��������߳������ͣ��������ͣ�ת��ʱ����ת��Ϊ��Ӧ��ASCII��ֵ�������������͵��Զ�ת��
		byte b1 = 15;
		byte b2 = 54;
		//byte sumb = b1+b2;//_01AutoChange.java:29: ����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
		int sumb = b1+b2;
		System.out.println("sumb = "+sumb);
		//ϸ��:�ַ���������,�Լ�������������int����,ʹ�õı���ֵ,Ȼ���������
		char c = 'A';
		char d = 'B';
		int sumc = c + d;//ʵ�ʼӵ��Ǳ���ֵ
		System.out.println("sumc = "+sumc);

		/*
			��Ҫע����ǣ�
				1.char�;��������ֽڣ�����ֵ��Χ��0 ~ 2^16-1��
				2.short����Ҳ���������ֽ�,��ֵ�ķ�Χ��-2^15 ~ 2^15-1
				��ֱ�ӵ���byte�Ͳ����Զ�����������char��char��shortֱ��Ҳ���ᷢ���Զ�������������Ϊֵ��Χ���⣩��ͬʱ��byte��Ȼ����ֱ��������short�͡� 
				���ԣ�char ���ܺ�byte short �໥�Զ�ת��
		*/
		//char e = 'c';//����Byte 16��bit
		//short s = e;//short����Byte 16��bit//����: �����ݵ�����: ��charת����short���ܻ�����ʧ

		/*
			5)����	��ֻ�����Ͳ���ֵ
		*/
		byte b4 = 10;
		int j = 5;
		//b4 = j;//ֻ�����Ͳ���ֵj�Ǹ��������:����: �����ݵ�����: ��intת����byte���ܻ�����ʧ
	}
}
