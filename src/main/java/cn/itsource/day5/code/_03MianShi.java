package cn.itsource.day5.code;class _03MianShi{
	/*	
		�����Լ�������:
	
	*/
	public static void main(String[] args) {
		//�������
		/*
		int i = 3;
		i = i++;//3  4
		System.out.println("i = " + i);//3*/
		//�������
		/*
		int i = 3;
		i = ++i;
		System.out.println("i=" + i);//4*/
		//�������
		/*
		int i = 3;
		//��|�� 3 4   4 5   5 6
		int a = i++ + i++ + i++;
			  //7 7   8 8   9 9
		int b = ++i + ++i + ++i;
		System.out.println("i=" + i);//9
		System.out.println("a=" + a);//12
		System.out.println("b=" + b);//24*/

		//��ϰ��
		/*
		int i=5;
		i++;//6
		System.out.println("i="+i);//6
		++i;//7
		System.out.println("i="+i);//7
		int a=++i;//a = 8 i = 8;
		System.out.println("a="+a);//8
		a = a++;
		System.out.println("a="+a);//8
		a = ++a;
		System.out.println("a="+a);//9*/
		//��ϰ��
		int m = 3;
		//int n = 2 * ++m;
		int n = 2 * m++;
		System.out.println("n="+n);//8
	}
}
