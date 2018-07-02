public class PrivateAndPublicDemo{
	public static void main(String[] args){
		/*
			Java中进行封装给
				①私有化字段
				②怎么存取值？ 提供get、set方法
				③提供一个无参的构造方法

			封装的意识
				一个标准的java类需要提供封装和接口
			思考
				
		
		*/
		//封装之前，随意访问，随意修改，不安全
		//new Computer().number = 666;

		new Computer().setName("");//PrivateAndPublicLearing.java:4: 错误: name可以在Computer中访问private

		Computer computer = new Computer();
		computer.setName("花花");
		computer.setNumber(3436260);
		
		System.out.println(computer);

		Computer student = new Computer();
		student.setName("小宝贝");
		student.setName("大宝贝");
		student.setNumber(123123);
		System.out.println(student.isSex());
		System.out.println(student.getName());

		Computer stu = new Computer();
		stu.setAndGetName("渣渣辉");
		System.out.println(stu.setAndGetName(""));

	}
}

class Computer{
	private String name;
	private int number;
	private boolean sex;

	public Computer(){}		//标准，需要提供一个无参的构造方法

	public String setAndGetName(String s){
		if(name != null){
			return name;
		}
		name = s;
		return name;
	}
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
		if(name != null)	//体现安全
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