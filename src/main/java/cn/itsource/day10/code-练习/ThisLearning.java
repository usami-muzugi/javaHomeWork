public class ThisLearning{
	/*

	*/
	public static void main(String[] args){
		This th = new This();
		th.setName("����");
		System.out.println(th.getName());
		System.out.println(th);
		System.out.println(th.getThis());

		//���ĵ�this��ʹ�ò���
		This th_1 = new This("����",53);
		System.out.println(th_1.getName());
		This th_2 = new This("����",53);
	}
}

class This{
	//��̬�ֶ�
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public This getThis(){
		pr(this);	//��Ϊ��������
		return this;	//��Ϊ����ֵ������
	}

	void pr(This th){
		System.out.println("Сǿ���˵��ʲô...");
	}

	public This(){}

	public This(String name){
		this.name = name;
	}

/*
ThisLearning.java:55: ����: ����This(String), �Ҳ������ʵĹ�����
                this(name);             //this()ֻ�ܷ��ڹ��������еĵ�һ��
                ^
    ������ This.This()������
      (ʵ�ʲ����б����ʽ�����б��Ȳ�ͬ)
    ������ This.This(String,int)������
      (ʵ�ʲ����б����ʽ�����б��Ȳ�ͬ)
1 ������
*/

	public This(String name,int age){
		this(name);		//this()ֻ�ܷ��ڹ��������еĵ�һ��
		//this.name = name;	//��ֵ
		this.age = age;
	}
}