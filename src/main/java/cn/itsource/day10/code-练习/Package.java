//package cn.itsoruce.domain;
import java.util.*;
public  class Package{
	/*
		package声明的包名要在java文件的最顶行
		javac -d . [java文件]
		错误: 仅当显式请求注释处理时才接受类名称 'Package' 1 个错误
		此处编译后执行方式改变
	*/
	public static void main(String[] args){
		System.out.println("Hello World!");
		int[] arr = {4542,4321324,3167,656475654,65556,53424554,314312,315143,1241454,65857,413245,45,653435,44356,76756,77654,6656,2132676,90,915,678178,76};
		//java.util.Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}


	/*
	C:\JAVA\Java180606\2018-06-20-java面向对象语法-DAY10\code-练习>ls
'ls' 不是内部或外部命令，也不是可运行的程序
或批处理文件。

C:\JAVA\Java180606\2018-06-20-java面向对象语法-DAY10\code-练习>java cn.itsource.domain.Package
错误: 找不到或无法加载主类 cn.itsource.domain.Package

C:\JAVA\Java180606\2018-06-20-java面向对象语法-DAY10\code-练习>java cn.itsoruce.domain.Package
Hello World!

C:\JAVA\Java180606\2018-06-20-java面向对象语法-DAY10\code-练习>
	
	*/
}