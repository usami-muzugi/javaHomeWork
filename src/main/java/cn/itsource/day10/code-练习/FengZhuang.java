public class FengZhuang{
	public static void main(String[] args){
		//����һ��ѧ��
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student("������",2,18);	//ʹ�ô��ι��췽������ʼ�����ѧ����ֵ
		Student student4 = new Student("�ߥ���",3,22);	//ʹ�ô��ι��췽������ʼ�����ѧ����ֵ

		student1.setName("��ǰ�ʤ���");		//��ֵ
		student1.setAge(22);
		student1.setNumber(0);

		student2.setName("������");			//��ֵ
		student2.setAge(27);
		student2.setNumber(1);

		//��ӡ������Ϣ
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		//��ӡ�������
		System.out.println("sum ="+Student.getSum());
	}
}

class Student{
	//��̬����
	private String name; //student's name
	private int number;	//student's number
	private int age;	//student's age

	//��̬���Ա����
	private static int sum;		//the sum of this students

	//��̬����
	public int getStudentSum(){
		return sum;
	}

	//���췽��
	public Student(){
		sum++;
	}

	public Student(String na,int nu,int ag){
		sum++;
		name = na;
		number = nu;
		age = ag;
	}

	//getset����
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

	//toString����
	public String toString(){
		return "name ="+name+"\tnumber ="+number+"\tage ="+age;
	}
}