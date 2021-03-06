public class Review{
	/*
		前面知识点回顾
			直观得再计算机系统看到对象得存在即使用
			JAVA已经写好的类，使用他的对象在计算机中，直观地体现出来
			1.数据类型
				数据类型	8种基本数据类型boolean byte char int lang short float double 4类引用类型 类 数组 枚举 *接口*
				数据	基本数据类型变量存放的是值的本身，引用类型变量存放的是地址值的引用 数据-->具体的值
			2.变量
				变量的概念	一个容器村地处数据，在计算机中分配的存储空间
				变量的语法	[数据类型] [变量名]
				变量的分类
					局部变量	
					全局变量
				变量的作用域
				成员变量和局部变量的区别
			3.代码执行结构	关键代码执行流程
				顺序结构	
				选择结构	if 选择
				循环结构	for循环 for each循环
			4.方法	（普通方法）
				方法的概念
				认识方法
				主方法
				方法的语法
				设计方法
					方法的使用	每次方法的使用，都是独立的
					方法的特点	存在与类的结构体中
				方法return，break，countine
			5.数组	连续的存储空间	引用类型
				一维数组
				二位数组
			6.方法的参数传递:
				值传递 
					1.传递基本数据类型数据，传递的是值本身
					2.传递引用数据类型数据，传递的是引用数据类型地址值
				值引用
					1.方法传递的是对值得引用
					void add (int i){
						//传递基本数据类型传递的是值本身
					}
					void add(String string){
						//传递引用数据类型，传递的是对象的引用
					}
			7.面向对象的编程思想	Object object = new Object();
			8.构造方法
				1.构造方法存在于本类中
				2.构造方法不存在返回类型，方法名和类名相同
				3.作用
					A）创建对象
					B）创建对象并初始化值
				4.构造方法本质也是方法，执行方法同样会完成功能
			9.匿名对象
				没有变量只有地址，存在与堆中，游离的对象
			10.对象的生命周期
				1.对象存在于堆中，什么时候开存在，什么时候结束
				2.清理堆内存的时候，java自动回收
			11.		...
	*/
	public static void main(String[] args){
		//对象的体现
		//package (java.awt.*)
		java.awt.Frame frame = new java.awt.Frame();//new *.Frame();隐式构造方法启动
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}