public class PrivateAndPublicLearning{
	public static void main(String[] args){
		/*
			Java�н��з�װ��
				��˽�л��ֶ�
				����ô��ȡֵ�� �ṩget��set����
				���ṩһ���޲εĹ��췽��

			��װ����ʶ
				һ����׼��java����Ҫ�ṩ��װ�ͽӿ�
			˼��
				
		
		*/
		//��װ֮ǰ��������ʣ������޸ģ�����ȫ
		//new Computer().number = 666;

		new Computer().setName("");//PrivateAndPublicLearing.java:4: ����: name������Computer�з���private

		Computer computer = new Computer();
		computer.setName("����");
		computer.setNumber(3436260);
		
		System.out.println(computer);

		Computer student = new Computer();
		student.setName("С����");
		student.setName("�󱦱�");
		student.setNumber(123123);
		System.out.println(student.isSex());
		System.out.println(student.getName());


	}
}

class Computer{
	private String name;
	private int number;
	private boolean sex;

	public Computer(){}		//��׼����Ҫ�ṩһ���޲εĹ��췽��
	
	public boolean isSex(){
		if(sex == false)
			return false;
		return true;
	}

	void add(){
		System.out.println();
	}
	
	public String getName(){
		return this.name;
	}

//	public void setName(String name){
//		this.name = name;
//	}

	public void setName(String n){
		if(name != null)	//���ְ�ȫ
			return;
		name = n;
	}
	
	public int getNumber(){
		return this.number;
	}

//	public void setNumber(int number){
//		this.number = number;
//	}
	
	public void setNumber(int nu){
		number = nu;
	}

	public String toString(){
		return "name = "+this.name+",Number = "+this.number;
	}

}