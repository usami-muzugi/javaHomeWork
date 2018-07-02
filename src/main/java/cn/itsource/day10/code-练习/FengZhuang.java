public class FengZhuang{
	public static void main(String[] args){
		//声明一堆学生
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student("うさみ",2,18);	//使用带参构造方法来初始化这个学生的值
		Student student4 = new Student("ミズギ",3,22);	//使用带参构造方法来初始化这个学生的值

		student1.setName("名前なし子");		//赋值
		student1.setAge(22);
		student1.setNumber(0);

		student2.setName("いい子");			//赋值
		student2.setAge(27);
		student2.setNumber(1);

		//打印对象信息
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		//打印对象个数
		System.out.println("sum ="+Student.getSum());
	}
}

class Student{
	//静态属性
	private String name; //student's name
	private int number;	//student's number
	private int age;	//student's age

	//静态类成员属性
	private static int sum;		//the sum of this students

	//动态属性
	public int getStudentSum(){
		return sum;
	}

	//构造方法
	public Student(){
		sum++;
	}

	public Student(String na,int nu,int ag){
		sum++;
		name = na;
		number = nu;
		age = ag;
	}

	//getset方法
	public String getName(){
		return name;
	}

	public void setName(String na){
		name = na;
	}

	public int getNumber(){
		return number;
	}

	public void setNumber(int nu){
		number = nu;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int ag){
		age = ag;
	}

	public static int getSum(){
		return sum;
	}

	//toString方法
	public String toString(){
		return "name ="+name+"\tnumber ="+number+"\tage ="+age;
	}
}