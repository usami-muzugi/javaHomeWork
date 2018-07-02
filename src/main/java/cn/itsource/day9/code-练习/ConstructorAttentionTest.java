public class ConstructorAttentionTest{
	

	//构造方法的注意事项
	//1.普通方法可以名字和类名一致，但是不退将这样，容易混淆
	//2.构造方法的待用方式和普通方法不一样，普通方法就是那三种，但是构造方法现阶段需要用new关键字来调用
		//普通方法的调用方式:
		//1.没有static修饰， 对象名.方法名() +参数列表
		//2.有static修饰， 类名.方法名() + 参数列表 对象名.方法名() + 参数列表
		//3.在同一个类中， 方法名() + 参数列表

		//构造方法的调用方式
		//1.目前:new 构造方法名字+参数列表
	//3.把构造方法Constructor 写成小写了 constructor, *构造方法没有返回，构造方法的方法名和类型同名且大小一样*
	public static void main(String[] args){
	
	}
}
class Constructor{
	
}