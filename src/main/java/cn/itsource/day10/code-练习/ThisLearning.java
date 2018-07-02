public class ThisLearning{
	/*

	*/
	public static void main(String[] args){
		This th = new This();
		th.setName("至尊宝");
		System.out.println(th.getName());
		System.out.println(th);
		System.out.println(th.getThis());

		//第四点this的使用测试
		This th_1 = new This("老李",53);
		System.out.println(th_1.getName());
		This th_2 = new This("老李",53);
	}
}

class This{
	//静态字段
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
		pr(this);	//作为参数传递
		return this;	//作为对象（值）传递
	}

	void pr(This th){
		System.out.println("小强最后说了什么...");
	}

	public This(){}

	public This(String name){
		this.name = name;
	}

/*
ThisLearning.java:55: 错误: 对于This(String), 找不到合适的构造器
                this(name);             //this()只能放在构造器当中的第一句
                ^
    构造器 This.This()不适用
      (实际参数列表和形式参数列表长度不同)
    构造器 This.This(String,int)不适用
      (实际参数列表和形式参数列表长度不同)
1 个错误
*/

	public This(String name,int age){
		this(name);		//this()只能放在构造器当中的第一句
		//this.name = name;	//赋值
		this.age = age;
	}
}