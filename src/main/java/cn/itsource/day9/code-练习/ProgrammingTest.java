class Programming{	//һ�������java��������С�ĵ�λ
	//��ͬһ���ļ����У��������ͬ���࣬��������֮ǰ�����class�ļ����ǵ�
	//���һ����������ѧ����һ�������
	//���췽��	new Programming(); --> ()

	//��Ա���� ���ֶΣ�
	private String name;
	private int age;
	

	//���췽��
	//1.���췽���Ǻ���ͨ���������ƵĽṹ������
	//2.���췽��Ҳ�Ƿ���������Ҳ��ִ�У���ɹ���
	//3.���췽��Ҳ�ô�������Ľṹ����
	//A.���췽���ķ�����������һ�£���Сд��һ��
	//B.���췽��û�з���ֵ����ͨ�����з���ֵ
	//C.���췽�����ڲ�û�з���ֵ
	//D.���췽�������з������η�
	//E.���췽�������в����б�
	//F.�з�����
	//G.ÿ���඼����һ�����췽�������û����ʾ��д��������ô����һ����ʾ���޲εĹ��췽��
			//�����ʾ�Ĺ��췽��д�����ˣ���ô��ʾ���޲ι��췽���Ͳ�������
	//[�������η�]	[����]	(�����б�){
	//}
	//Ŀǰ���ڹ��췽����ʹ������new�ؼ��ֵ���
	//new Programming();

	public Programming(){	//�޲ι��췽��
		System.out.println("����ѽ��");
	}

	public Programming(int a){
		System.out.println(a+"����ѽ��");
	}

	//
	public void eat(){
		System.out.println("�Է���");
	}
	public void run(){
	
	}
	public void sleep(){
	
	}
	public void say(){
		System.out.println("��ѧϰ��������");
	}

}

public class ProgrammingTest{
	public static void main(String[] args){
		//��������ʼ��һ��Programming���͵ı���
		Programming programming = new Programming(1);	//����ѽ��
		programming.eat();		//�Է���
		programming.say();		//�������ѧϰ
	}
}