public class ObjectTest{

	public static void main(String[] args){
		//����һ������ ʹ�� new �ؼ���
		ObjectDemo objectDemo = new ObjectDemo();	//ÿһ��new���ƣ����Ƕ����Ĵ���
		//�ٴ���һ��
		ObjectDemo objectDemo_1 = new ObjectDemo();	//ÿһ��new���ƣ����Ƕ����Ĵ���
		//ÿһ�������ǲ�ͬ��
		System.out.println(objectDemo == objectDemo_1);	//result: false
		//==�Ƚϵ�������������ڴ��ַ�Ƿ���ͬ����Ϊ����ͬ���Է���Ϊfalse
		System.out.println(objectDemo);
		System.out.println(objectDemo_1);
		
		objectDemo.name = "��ҫ��";
		objectDemo.age = 18;
		objectDemo.sex = false;

		System.out.println(objectDemo.name);
		System.out.println(objectDemo.age);
		System.out.println(objectDemo.sex);

		System.out.println("---------------");

		objectDemo.print();	//ʹ�ö���ķ�����ӡ���
		
		System.out.println(objectDemo);


	}
}