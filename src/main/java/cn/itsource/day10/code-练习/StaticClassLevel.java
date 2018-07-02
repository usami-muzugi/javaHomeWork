public class StaticClassLevel{
	/*
		static修饰的字段
			应该通过类名.字段名访问
			应该通过类名.方法名访问，该字段被该类的所有对象共享

		对象级别
			非static修饰的字段：对象名.字段名来访问
			非static修饰的方法，放创建对象的时候，独属于每一个对象，没有被该类的所有对象共享
		静态上下文不允许访问非静态的变量和方法
		非静态上下文，可以访问静态上下文√
	*/
	public static void main(String[] args){
		add();
		new StaticClassLevel().run();
	}
	static void add(){
	System.out.println("add");

	}
	void run(){
		System.out.println("run");
		add();
	}
}

