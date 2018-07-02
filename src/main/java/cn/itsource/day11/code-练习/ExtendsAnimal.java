public class ExtendsAnimal extends Animal{	//ExtendsAnimal 继承 Animal
	/*
		基本语法测试
	*/
	public static void main(String[] args){
		ExtendsAnimal extendsAnimal = new ExtendsAnimal();	//创建子类对象
		extendsAnimal.setName("猪猪侠");	//子类继承Animal字段name
		extendsAnimal.setAge(22);		//子类继承Animal字段age
		System.out.print(extendsAnimal.getAge()+extendsAnimal.getName());
		extendsAnimal.run();		//子类继承Animal方法run

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

	//普通のfunction

	void run(){		//父类方法run()
			System.out.println("走起");
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