public class StudentTest{
	public static void main(String[] args){
		//ʹ��new �ؼ���������һ��ѧ������
		new Student();		//ÿһ�ݸ��ƣ����Ƕ����Ĵ���	ʹ��new�ؼ����ڶ��п���һ����ռ䣬��ִ����֮������
		//
		new Student().name = "������";	//ʹ��new �ؼ����ٶ��ڴ��п���һ���ڴ�ռ䣬���������Ա����name����Ϊ�����ģ����ǲ�û�н��ڴ�ռ���ڴ��ַ���������棬������ִ���긴��name����֮��ִ����һ����䣬��GC�����ڴ�ռ������

		System.out.println(new Student().name);	//����newһ��Student��������name��ֻ�ǳ�ʼ��������Ϊnull�������������õ�new�Ķ����������ͬһ������
		
		Student student = new Student();	//ʹ��new�ؼ����ٶ��ڴ��п���һ���ڴ�ռ䣬�����ڴ��ַ��ֵ�������͵ı�������ջ�б�����������������洢�����ڴ�ռ�ĵ�ַ��������ִ��֮��Ĳ���
		student.name ="С�ܵ�";	//��С�ܸܵ�ֵ������ĳ�Ա����name
		System.out.println(student.name);	//����student����ĳ�Ա����name �ɹ���ʾ С�ܵ�

		Student student2 = new Student();
		student2.name ="С����";
		System.out.println(student2.name);
		
		student.say();	//����С�ܵ�	�ҽ���0�� ���Ա�������ڱ�new�����ʱ�򣬻��ʼ��һ����ʼֵ
		student.age = 18;
		Student.say();	
		student.eat();	//������ʹ�ã�û��static���Σ� ����.������()
		student.say();
		//���ִ�н�����student �� student2 ���������ڽ�������GC�Զ����պ�����
		//û��static ������.������()+�����б�
		//��static���Σ� ����.������()+�����б�	����.������()+�����б�
		//��ͬһ�����У�������()+�����б�
	}
	//main()����ִ�н���
}