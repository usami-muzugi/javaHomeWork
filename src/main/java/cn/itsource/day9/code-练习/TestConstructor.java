public class TestConstructor{
	public static void main(String[] args){

		//��������
		Person person = new Person();		//person -->��������õ�ַ
		System.out.println(person);			//���û����дObject���toString()�������ͻ��ӡ���ֶ�����֮��̵���д��ѧ��
		person.name = "������";
		person.length = 15.0;
		System.out.println(person);
		System.out.println("name ="+person.name+"\tlength ="+person.length);

		Person man = new Person("��ä�",18);	//ʹ�ô������б�Ĺ������������ֵ������ֱ�ӳ�ʼ��
		System.out.println("name =" + man.name+"\tlength ="+man.length);
	}
}

class Person{
	String name;
	double length;
	

	//���췽��
	public Person(){	//�޲ι�����
		System.out.println("����Person�޲ι�����");
	}

	//���췽��Ŀǰ��ʹ�÷�ʽ����new ����
	//���췽������һ�����ã����������ͬʱ��ʼ��ֵ��
	public Person(String s ,int g){	//����ʹ��s �� g �е㶫����
		//��Ϊ�����һ��������String���ͱ����޸�Ϊname��name = name �Ļ����ھͽ�ԭ�����Ծ��� �β� ��ֵ���βΣ���û��
		//��ֵ����Ա�������ֽ׶�ֻ�������������������棬�Ժ���õ�this �ؼ���
		System.out.println("����Person�вι�����");
		name = s;
		length = g;	//�Զ�ת��
	}

	public String toString(){
		return "name ="+this.name+"\tlength ="+this.length;
	}
}