/*
 *
 *public �� class Ϊ���η���public ���θ���Ϊ������ class����HelloWorldΪһ����
 *��ʹ��public ���ε� �࣬Դ�ļ���������������ͬ��
 *
 *JAVA���ŵı�ʶ��������Ϊ�������������������� �� ���ǣ�ֻ������ΪA-Z a-z $ _ ��ͷ�������ֽ����ʹ��
 *
 */
public class HelloWorld{
	//main()��������Ҫ��public�����Σ�main()������JAVA������������JAVA����ִ��ʱ����ڣ�һ��JAVA����ֻ�а���
	//main()���������ܱ�ִ��
	public static void main(String[] args){
		//main�����ڵ���䣬�ᱻ��˳�������ִ��
		//��ӡ���System.out.println();s
		System.out.println("Hello World!");
		System.out.println(10);	 //10����
		System.out.println(0B1111100);
		System.out.println(0x66CCFF);
		System.out.println("Hello World!");
		System.out.println("");
		//������������


		//����
		int i = 1;
		byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;  //10Ĭ����int���ͣ�������Ҫ��10�����L

		//������������
		//�ࣨclass�� �����һ����������
		HelloWorld helloWorld = new HelloWorld();



		//������
		/*

		*/
			
	}

	//��̬�ڲ���
	public static class innertClass{  

	}

	//�ֲ��ڲ���
	public static HelloWorld innert(){
		return new HelloWorld();
	}


	//�����ڲ���
}


   