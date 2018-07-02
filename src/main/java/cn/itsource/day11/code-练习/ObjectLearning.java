class ObjectLearning {

	/*
protected  Object clone() 
          创建并返回此对象的一个副本。 
 boolean equals(Object obj) 
          指示其他某个对象是否与此对象“相等”。 
 Class<?> getClass() 
          返回此 Object 的运行时类。 
 int hashCode() 
          返回该对象的哈希码值。 
 String toString() 
          返回该对象的字符串表示。 
	*/
	public static void main(String[] args) {
		String string = "123";

		/*
			Class 描述了类这一类事物，所以class获得的对象，就是具体的这个类型，类。
		*/
		// Class<?> getClass()           返回此 Object 的运行时类。 
		Class classTest = string.getClass();	//类，也是一类，具体的一个类，也是一个对象
		System.out.println(classTest);

		//classTest.getName();
		//classTest.getInstance();

		// int hashCode()           返回该对象的哈希码值。 
		Integer integer	= new A().hashCode();

		Student 小林 = new Student("小林",22);
		System.out.println(小林);	//一个对象的字符串描述是对象的地址值...
		string = 小林.toString();
		System.out.println(string);	//这里的内部本质也是在调用toString() 方法 当前对象调用自己的toString() 如果没有重写toString，则打印的是父类的
/*
    public String toString() {		//Object的toString()方法
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*/




/*
 boolean equals(Object obj)  指示其他某个对象是否与此对象“相等”。  
 object.equals(obj)   此对象object 其他对象 obj，

     public boolean equals(Object obj) {
        return (this == obj);
    }

*/
		Student ドラゴン = new Student("ドラゴン",10000);
		System.out.println(ドラゴン == 小林 );// ==号进行比较，是比较两个引用变量的地址值，比较两个基本数据类型变量的值
		System.out.println(ドラゴン.equals(小林));// .equals()比较的是两个对象是否里面的值是否相同

		小林.name ="ドラゴン";
		小林.age = 10000;
		System.out.println(ドラゴン.equals(小林));//要重写.equals	对象的比较，不会因为地址值不同而不是同一个对象

	}
}
class Student{
	String name;
	int age;
	
	public void eat(){
	
	}

	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}


/*
    public String toString() {		//Object的toString()方法	返回的是对象的描述
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*/

	//显示:对象的描述应该是对象的静态描述
	//子类Student对象student调用了父类的toString返回的对象描述，不符合现实对于对象的描述
	@Override	//覆写toString()		//调用toString
	public String toString(){
		return "";
	}

	//Objetc类的equals()方法就是比较的两个对象的地址值，功能不符合，需要自己重写
	@Override
	public boolean equals(Object ojbk){
		/*
			判断两个对象是否地址值相等，相等就是指向的堆是同一个空间，所以返回true
		*/
		if(this == ojbk) return true;

		/*
			判断两个对象的类Class是否相同，不相同就根本不是同样的类new出来的对象，所以返回false
		*/
		if(ojbk == null || getClass() != ojbk.getClass()) return false;
		
		
		//if(!((ojbk instanceof Student) && (ojbk != null))) return false;

		if(ojbk==null|| !(ojbk instanceof Student ) ) return false;
		//如果ojbk是student的实例，并且ojbk不为null 
		/*
			把Objetc对象ojbk强制转型成Student,因为这里，传入的是Objetc对象，并且已经判断过这个对象不为空，
			且ojbk的Class和本对象的类Class相同。所以这里能强制转型为Student！！！！！！！！！！！
		*/
		Student that = (Student)ojbk;	//强制转型

		/*
			
		*/

		//if(name != that.name && age != that.age) return false;
		if(age != that.age ) return false;		//这里因该是值来判断，然后下面是对象进行比较
		return name != null ? name.equals(that.name) : that.name == name;
		//如果age不为空    ？ 比较两个对象的属性age的值是否相等（相等的话，返回true。不相等就是这两个对象的属性还是有不相等的，所以返回false） : 为空的话，就看另一个对象的age是否为空（为空的话就是两个对象都是null，所以返回true，如果另一个对象的age为null，但是这个对象不为null，所以就返回fallse）

	}


	/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtendsAnimal that = (ExtendsAnimal) o;

        if (age != that.age) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }	
	
	*/
}

class A{
}