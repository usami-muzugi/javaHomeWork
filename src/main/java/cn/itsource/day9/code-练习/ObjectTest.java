public class ObjectTest{

	public static void main(String[] args){
		//创建一个对象 使用 new 关键字
		ObjectDemo objectDemo = new ObjectDemo();	//每一份new复制，都是独立的存在
		//再创建一个
		ObjectDemo objectDemo_1 = new ObjectDemo();	//每一份new复制，都是独立的存在
		//每一个对象都是不同的
		System.out.println(objectDemo == objectDemo_1);	//result: false
		//==比较的是两个对象的内存地址是否相同，因为不相同所以返回为false
		System.out.println(objectDemo);
		System.out.println(objectDemo_1);
		
		objectDemo.name = "刘耀文";
		objectDemo.age = 18;
		objectDemo.sex = false;

		System.out.println(objectDemo.name);
		System.out.println(objectDemo.age);
		System.out.println(objectDemo.sex);

		System.out.println("---------------");

		objectDemo.print();	//使用对象的方法打印输出
		
		System.out.println(objectDemo);


	}
}