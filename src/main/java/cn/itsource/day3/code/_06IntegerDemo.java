package cn.itsource.day3.code;

class _06IntegerDemo{
	/*
		�����������͵���ʾ:
			long���͵�����:��Ҫ�ں������L �ű�ʾ��long���͵�����
			long j = 2147483648;//���������
	*/
	public static void main(String[] args) {
		byte b = 127;//-128~17
		short s = 10;
		int i = 10;
		long j = 2147483648L;//��������Ĭ����int����

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(j);

		System.out.println(0b101);
		int y = 0b101;

		System.out.println(12_34_56);
	}
}
