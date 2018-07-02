class IntDemo {
	public static void main(String[] args) 
	{
		/*
		整数类型  位			可存储值范围
		byte	  8		1Btye		-128~127 
		short	  16	2Byte		Short.Min_VALUE~Short.MAX_VALUE
		int		  32	4Byte		...
		long	  64	8Byte		...
		*/

		byte aByte = 120;
		short aShort = 120;
		int aInt = 120;
		long aLong = 120;
		System.out.println("aByte = " + aByte);
		System.out.println("aShort = " +aShort);
		System.out.println("aInt = " + aInt);
		System.out.println("aLong = "+ aLong);
		

		System.out.println("----------------");

		/*
			一个整形值，如果从小类型转到大类型不会精度丢失
		*/

		byte testByte = aByte;
		short testShort = testByte; //这里可以省略(short) 自动转型
		int testInt = testShort;
		long testLong = testInt;

		System.out.println("testByte = " + testByte);
		System.out.println("testShort = " +testShort);
		System.out.println("testInt = " + testInt);
		System.out.println("testLong = "+ testLong);

		/*
			一个整形值，如果从大类型转到小类型*可能*会精度丢失
		*/

		aLong = 0x66CCFF;
		aInt = (int)aLong;  //这里如果不加上(int)就会编译报错，加上(int)的作用是 强制类型转换
		aShort = (short)aInt;
		aByte = (byte)aShort;

		System.out.println("----------------");
		
		System.out.println("aByte = " + aByte);
		System.out.println("aShort = " +aShort);
		System.out.println("aInt = " + aInt);
		System.out.println("aLong = "+ aLong);

		/*
		输出结果
		----------------
		aByte = -1
		aShort = -13057
		aInt = 6737151
		aLong = 6737151
		
		这里可以看到long 和int类型的变量都能正常显示数值，但是short 和byte类型则不能正确显示数值，存在精度丢失
		*/


		/*
		整形数值是可以有多种不同形式来表示的

		1. int i = 10086;  10086都为 int类型
		2. int i = 0b1111100;  0b1111100 是 124的二进制表示方式
		3. int i = 0x66CCFF;   0x66CCFF 是 6737151的16进制表示方式

		*/

		/*
		浮点型数值的表示方式

		1. double d = 3.14;	3.14都为double类型
		2. double d = 3.14F; 这里的3.14F 是float类型的3.14 并且自动类型转换为 double类型 编译通过
		3. double d = 3.14D; 这里的3.14D 是double类型的3.14
		4. double d = 314e-2; 314e-2是3.14的科学计数表示，默认也是double类型
						float f = 314e-2; 这样就会出错
		*/
		double d = 3.14F;
		double PI = 3.14D;
	}
}
