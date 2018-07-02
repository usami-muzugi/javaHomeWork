package cn.itsource.day6.code;class _01ForDemo1{
	/*
		forѭ�����﷨:
			for(ѭ����ʼ�����A;ѭ���ж����B;ѭ�������C){
				//ѭ���������D
			}
		ִ������:
			A---����ִ��һ��
			B----true----D----C
			B----true----D----C
			B----true----D----C
			.......
			B----false
		ģ��һ��,д��ӡʮ�仰[ѭ��ִ��ʮ�ι���]

	*/
	public static void main(String[] args) {

		/*
		for(int i = 0;i < 10;i++){
			System.out.println(i+" ��ѧϰ");
		}*/


	//forѭ����һЩ�ر�֮��

		//ʹ��forģ��whileѭ���ṹ
		/*
		int i = 0;
		for(;i<10;){
			System.out.println(i+" ������");
			i++;
		}*/

		//forѭ��û�нṹ��
		/*
		int i = 0;
		for(; i<10 ; i++);
		System.out.println(i);*/

		//forѭ��û�нṹ��,���ǿ���ѭ����ĵ�һ�����
		
		for(int i = 0;i < 10;i++)
			System.out.println("Լ��");
		System.out.println("Լ��");

		if(false)
			System.out.println("��ѧϰ");
		System.out.println("���Ͽ�");
		
	}
}
