class Constructor{	//ConstructorTest.java:1: ����: ��Constructor�ǹ�����, Ӧ����Ϊ Constructor.java ���ļ�������
	//���һ�����ǹ����ģ�public���εģ���Ҫ��д��һ��������ͬ��.java�ļ���
	private String name;
	private int age;

	public Constructor(){	//�޲ι��췽�� ��ʾ���췽��
		System.out.println("����һ���޲εĹ��췽��");
	}
	
	public Constructor(String name){	//�вι��췽��
		System.out.println("����һ���вεĹ��췽��");
		System.out.println(name + "����ѽ��");
	}

	public void eat(){
		System.out.println("Constructor���ܳԶ���");
	}

	public void say(){
		System.out.println("Constructor�����������");
	}

	public static void run(String name){	//��̬����
		System.out.println("�����߰�"+name+"С��");
	}
}
public class ConstructorTest{
	public static void main(String[] args){
	
	Constructor constructor = new Constructor();	//��ʹ��new�ؼ��ִ����¶����ǣ�����ø���Ķ�Ӧ�Ĺ��췽����������õ����޲ι��췽��
	Constructor constructor_2 = new Constructor("�¶�");	//��ʹ��new�ؼ��ִ����¶����ǣ�����ø���Ķ�Ӧ�Ĺ��췽����������õ����вι��췽��	
	constructor.eat();	//���зǾ�̬��������Ҫ ������.������()+ �����б� ��ʹ��
	constructor.say();	//���зǾ�̬��������Ҫ ������.������()+ �����б� ��ʹ��
	constructor.run("��С��");	//���о�̬���������� ������.������()+ �����б� ��ʹ��
	Constructor.run("��С��");	//���о�̬���������� ����.������()+ �����б� ��ʹ��

	}
}