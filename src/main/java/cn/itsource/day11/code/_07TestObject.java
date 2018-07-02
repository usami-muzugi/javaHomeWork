package cn.itsource.day11.code;

class _07TestObject{
	/*
		����:���еĶ���[����]��ʵ����Object���еķ���[���ڼ̳й�ϵ,�̳е���Object����Ķ���]
		����:����:�����Ե���Object����ķ���
		javaд�õ���
		�Զ�����
		����
		������������:û��
	*/
	public static void main(String[] args) {
		/* int hashCode() ���ظö���Ĺ�ϣ��ֵ�� */
		String str = "С���";
		int code = str.hashCode();
		System.out.println(code);
		
		A a = new A();
		int cod = a.hashCode();
		System.out.println(cod);

		int[] arr = {1};
		int cd = arr.hashCode();
		System.out.println(cd);
		/*
		int i = 10;
		int codd = i.hashCode();//�������ݲ���������������,���Ƕ���!�Ͳ����ھ�̬����[�ֶ�]���߶�̬����[����]
		*/
		/*Class<?> getClass() ���ش� Object ������ʱ�ࡣ */
		Class cla = "С���".getClass();
		String name = cla.getName();
		System.out.println(name);

		int nam = "С���".getClass().getName().hashCode();//һ���������,��ô�õ�����,�������ؽ�����Ƕ���,���ؽ������.����
		System.out.println("nam = "+nam);
	}
}
class A{
}
