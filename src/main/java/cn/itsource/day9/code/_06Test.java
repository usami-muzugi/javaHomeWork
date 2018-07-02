package cn.itsource.day9.code;

class _06Test{
	/*
		�������������:
			�������������,��ʼ,����
			��ʼ:�о��ж���˵��:
			����: ֲ���� , ������� , û���˶��ڸ��˵ļ���

		��: ʧ�� ׹�� ����������û���˼��� 

		����:
			��ʼ:   new ��ʱ��ʼ:�����ڶ��ڴ���
			����:   ʧ��,�����Ըö����������,���������
					����,java�������ջ���,�����û�õĶ���,����!�����ڴ�

		����:�����ĵ�����ʶ
			��Ա�����ֲ��������ص�:
					1.�ֲ�����:Ϊ�˸�����������ɶ���ʱ���ڵ�,�������н���,�ֲ���������������Ҳ������
					2.��Ա����:ֵ���Ŷ���Ĵ��ڶ�һֱ����[��������,���Ŷ�����������ڴ��ڶ�����]
	*/
	public static void main(String[] args) {
		Student stu = new Student();//��������,�Ǹ�ӡ��һ�ݸ�ӡ��,��ӡ���Ƕ���
		stu.eat(10);
		stu.eat(20);

		stu.name = "���H�H...";

		System.out.println(stu.name);
		System.out.println(stu.name);
		System.out.println(stu.name);
		System.out.println(stu.name);
		System.out.println(stu.name);
		System.out.println(stu.name);
		System.out.println(stu.name);
		System.out.println(stu.name);
	}
}
class Student{
	String name;//��Ա����
	void eat(int i){
		int max = i;//max�ֲ�����
		System.out.println("max="+max);
	}
}
