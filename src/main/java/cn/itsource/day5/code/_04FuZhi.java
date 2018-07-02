package cn.itsource.day5.code;class _04FuZhi{
	/*
		=    +=     -=     *=     /=    %=
	*/
	public static void main(String[] args) {
		int i = 10;

		//+=
		short s = 10;
		s+=12;//�����ǿ��Կ�����s = s + 12;[ ������ʽ������ת�� ]
		System.out.println(s);

		//��������Ͽ��ɵı��ʽ\
		//s = s + 12;


		//+= �ַ���
		String name = "����������";
		String str = "��Ҷ�ʪ��";
		name+=str;//name = name+str
		System.out.println(name);


		//������:[��ֵ�����,��������,ʹ�õ��Ǳ��ʽ�Ľ��]
		int a = 12;
		//a+=a-=a/=a*=a;
		a*=a-=a/=a+=a;
		System.out.println(a);
		System.out.println(12/144);//��������ת��
	}
}
