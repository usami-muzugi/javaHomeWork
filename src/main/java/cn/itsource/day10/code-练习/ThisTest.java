public class ThisTest{
	/*
		What is this?
			this ��*���е�ǰ�����ַ*
			this ָ����ǰ����*���е�ǰ����ĵ�ַ*
		�ٷ�:this���ڵĺ��������ڱ�˭���þ�ָ��˭
		���:this��ǰ��������У�this��ָ��˭�� ģ��----> ��ӡ��

		this��������ʱ��ʹ�ã�ָ�����ǵ�ǰ��Ķ���
	*/
	public static void main(String[] args){
		This th = new This();
		System.out.println(th);
		th.getAdd();

		System.out.println("--------�����ķָ���---------");
		This th_1 = new This();
		System.out.println(th_1);
		th_1.getAdd();
	}
}

class This{
	//��̬�ֶ�
	private String name;
	private int age;

	//getset����
	public String getName(){
		return name;
	}

//	public void setName(String na){	//	na�������������setName������
//		name = na;	//��Ա����name�������������setName����������setName������ȡ����Ա����name��������ʽ����na�ɹ���ֵ����Ա����name
//	}

//	public void setName(String name){	//name�����������setName��
//		name = name;	//��Ϊ�ͽ�ԭ�������������βθ�ֵ���Լ�
//	}	//�����������ֲ��������٣���û�д�ֵ�� ��Ա���� name

	public void setName(String name){
		this.name = name;	//ʹ��this�ؼ��֣�ָ����ǰ����ĸ�ӡ���ĳ�Ա����
	}

	public int getAge(){
		return age;
	}

//	public void setAge(int ag){
//		age = ag;
//	}

	public void setAge(int age){
		this.age = age;
	}

	public void getAdd(){
		System.out.println(this);
	}

//	public static void pr(){
//		System.out.println(this);	//����˵���this���Ƕ��󼶱�ģ��Ǿ�̬�� not static
//	}

	/*
	ThisTest.java:57: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� this
                System.out.println(this);
                                   ^
	1 ������
	*/

	public void print(){
		System.out.println("name ="+ this.name);
	}
}