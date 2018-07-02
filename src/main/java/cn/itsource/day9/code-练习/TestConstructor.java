public class TestConstructor{
	public static void main(String[] args){

		//创建对象
		Person person = new Person();		//person -->存的是引用地址
		System.out.println(person);			//如果没有重写Object类的toString()方法，就会打印这种东西，之后教到重写会学到
		person.name = "うさみ";
		person.length = 15.0;
		System.out.println(person);
		System.out.println("name ="+person.name+"\tlength ="+person.length);

		Person man = new Person("大好き",18);	//使用带参数列表的构造器所传入的值，可以直接初始化
		System.out.println("name =" + man.name+"\tlength ="+man.length);
	}
}

class Person{
	String name;
	double length;
	

	//构造方法
	public Person(){	//无参构造器
		System.out.println("我是Person无参构造器");
	}

	//构造方法目前的使用方式是用new 调用
	//构造方法的另一个作用，创建对象的同时初始化值！
	public Person(String s ,int g){	//这里使用s 和 g 有点东西的
		//因为如果在一个方法里String类型变量修改为name，name = name 的话由于就近原则，所以就是 形参 赋值给形参，并没有
		//赋值给成员变量，现阶段只能用其他变量名来代替，以后会用到this 关键字
		System.out.println("我是Person有参构造器");
		name = s;
		length = g;	//自动转型
	}

	public String toString(){
		return "name ="+this.name+"\tlength ="+this.length;
	}
}