public class ThisDemo{
	/*
		this �Ǹ������
			this �ǳ��е�ǰ�����ַ
			this ָ����ǰ���󣬳��е�ǰ����ĵ�ַ
		�ٷ�:this���ڵĺ��������ڱ�˭���þ�ָ��˭
		���:this��ǰ��������У�this��ָ��˭�� ģ��----> ��ӡ��
	*/
	public static void main(String[] args){
		This th = new This();
		th.setName("��Ȯ");
		System.out.println(th.getName());

		This th_1 = new This();
		th_1.setName("�Ų�Դ�Ǹ��¶�");
		System.out.println(th_1.getName());


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

}