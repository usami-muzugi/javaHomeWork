package cn.itsource.day3.code;

class _08CharDemo{
	/*
		�ַ����ݵ���ʾ:
			
	*/
	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c);
		/*
			����ASCII:01010101----->65---->A
			���뷽ʽ2 BB   01010101----->65---->B
			000101010101
		*/
		char d = 65;//��ʾ��ʽ
		System.out.println(d);
		char f = 0x41;
		System.out.println(f);

		char k = '\u0041';//����һ�ֱ���
		System.out.println(k);

		char y = '\"';
		System.out.println(y);

		//4.�ַ����ݿ��Ե���һ��������ʹ�ã�
		char u = 'A';
		System.out.println(u + 35);

		char i = 6;//�����6   0101010   A
		System.out.println(i);//����
	}
}
