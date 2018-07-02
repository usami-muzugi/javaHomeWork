class IntDemo {
	public static void main(String[] args) 
	{
		/*
		��������  λ			�ɴ洢ֵ��Χ
		byte	  8		1Btye		-128~127 
		short	  16	2Byte		Short.Min_VALUE~Short.MAX_VALUE
		int		  32	4Byte		...
		long	  64	8Byte		...
		*/

		byte aByte = 120;
		short aShort = 120;
		int aInt = 120;
		long aLong = 120;
		System.out.println("aByte = " + aByte);
		System.out.println("aShort = " +aShort);
		System.out.println("aInt = " + aInt);
		System.out.println("aLong = "+ aLong);
		

		System.out.println("----------------");

		/*
			һ������ֵ�������С����ת�������Ͳ��ᾫ�ȶ�ʧ
		*/

		byte testByte = aByte;
		short testShort = testByte; //�������ʡ��(short) �Զ�ת��
		int testInt = testShort;
		long testLong = testInt;

		System.out.println("testByte = " + testByte);
		System.out.println("testShort = " +testShort);
		System.out.println("testInt = " + testInt);
		System.out.println("testLong = "+ testLong);

		/*
			һ������ֵ������Ӵ�����ת��С����*����*�ᾫ�ȶ�ʧ
		*/

		aLong = 0x66CCFF;
		aInt = (int)aLong;  //�������������(int)�ͻ���뱨������(int)�������� ǿ������ת��
		aShort = (short)aInt;
		aByte = (byte)aShort;

		System.out.println("----------------");
		
		System.out.println("aByte = " + aByte);
		System.out.println("aShort = " +aShort);
		System.out.println("aInt = " + aInt);
		System.out.println("aLong = "+ aLong);

		/*
		������
		----------------
		aByte = -1
		aShort = -13057
		aInt = 6737151
		aLong = 6737151
		
		������Կ���long ��int���͵ı�������������ʾ��ֵ������short ��byte����������ȷ��ʾ��ֵ�����ھ��ȶ�ʧ
		*/


		/*
		������ֵ�ǿ����ж��ֲ�ͬ��ʽ����ʾ��

		1. int i = 10086;  10086��Ϊ int����
		2. int i = 0b1111100;  0b1111100 �� 124�Ķ����Ʊ�ʾ��ʽ
		3. int i = 0x66CCFF;   0x66CCFF �� 6737151��16���Ʊ�ʾ��ʽ

		*/

		/*
		��������ֵ�ı�ʾ��ʽ

		1. double d = 3.14;	3.14��Ϊdouble����
		2. double d = 3.14F; �����3.14F ��float���͵�3.14 �����Զ�����ת��Ϊ double���� ����ͨ��
		3. double d = 3.14D; �����3.14D ��double���͵�3.14
		4. double d = 314e-2; 314e-2��3.14�Ŀ�ѧ������ʾ��Ĭ��Ҳ��double����
						float f = 314e-2; �����ͻ����
		*/
		double d = 3.14F;
		double PI = 3.14D;
	}
}
