public class ObjectDemo{

	/*
		����:���еĶ��󣬰������飬��ʵ����Object���еķ���
		java���е���	��
		�Զ�����		��
		����			��
		������������	��
	*/
	public static void main(String[] args){
		String string = "÷��";

		int hashcode = string.hashCode();	//��ȡHashCode
		System.out.println(hashcode);

		//����:String��javaд�õ��࣬�Զ��̳�Object��

		//�Զ�����
		Test test = new Test();
		hashcode = test.hashCode();

		System.out.println(hashcode);

		//����
		int[] arr = {1,2,3,4};
		hashcode = arr.hashCode();
		System.out.println(hashcode);

		//������������
		int i = 1;
		//hashcode = i.hashCode();
		//���ڻ����������ͣ�������������(���Ƕ���)
		//���Բ�����.xxx or .xxx() �����з���

		Integer integer = 1;	//��װ�����
		hashcode = integer.hashCode();
		System.out.println(hashcode);
		
		Class classTest = "�����".getClass();
		System.out.println(classTest);
		System.out.println(classTest.getName());

		string = "���۹�".getClass().getName().getClass().getName();

		System.out.println(string);
		
		string = test.getClass().getName();
		System.out.println(string);
	}
}

class Test{
	private String name;
	private Integer age;
}