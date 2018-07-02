public class Method {

    public static void main(String[] args) {
        int a = 10086;
		int b = 10000;

		add(a,b);
		Method.add(a,b);
		System.out.println(add(a,b));
		print(add(a,b));
		System.out.println(a);
		System.out.println(b);
		doSomething(a);
		System.out.println(a);		//值没有改变
    }


    /**
     * get the sum of a and b
     * @param a int type a
     * @param b int type b
     * @return add a and b
     */
    public static int add(int a,int b) {
        return a + b;
    }



	//public static void add(int a){		//Method.java:22: 错误: 已在类 Method中定义了方法 add(int,int)
	//	System.out.println(a + b);			//形式参数相同的并且同名的两个方法，不管他的修饰符和返回值是什么，
	//}										//都是不允许的

	public static void add(int a){			//但是形式参数不同的方法，方法名可以相同
		System.out.println(a);
	}

	public static void print(int i){
		System.out.println(i);
	}

	public static void doSomething(int i){		//所以说这就是形式参数
		i++;
	}
}