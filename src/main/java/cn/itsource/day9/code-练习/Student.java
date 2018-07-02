public class Student{//学生类：描述学生这一类

	static String name;	//静态属性:描述学生姓名
	static int age;	//静态属性:描述年龄
	void eat(){ //学生能吃东西
		System.out.println("把自己吃掉");
	}

	static void say(){
		System.out.println("我是"+name+"\t我今年"+age+"岁");
	}

}