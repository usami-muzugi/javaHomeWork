public class ExtendsAnimal extends Animal{	//ExtendsAnimal �̳� Animal
	/*
		�����﷨����
	*/
	public static void main(String[] args){
		ExtendsAnimal extendsAnimal = new ExtendsAnimal();	//�����������
		extendsAnimal.setName("������");	//����̳�Animal�ֶ�name
		extendsAnimal.setAge(22);		//����̳�Animal�ֶ�age
		System.out.print(extendsAnimal.getAge()+extendsAnimal.getName());
		extendsAnimal.run();		//����̳�Animal����run

		java.awt.Frame frame = new java.awt.Frame();
		frame.setSize(500,500);
		frame.setVisible(true);
		//frame.setIconImage();
		//frame.isResizable(true);
	}

}

class Animal{
	private String name;
	private int age;

	public Animal(){}

	//��ͨ��function

	void run(){		//���෽��run()
			System.out.println("����");
	}

	//getAndSet

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
}