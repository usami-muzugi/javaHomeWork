package cn.itsource.day9.code;

class _04TestConstructor{
	/*
		���췽����ע������:
			1.��ͨ�����������ֺ�����һ�£����ǲ��Ƽ����������׻���;
			2.���췽���ĵ��÷�ʽ����ͨ������һ��
				��ͨ�����ĵ��÷�ʽ
					1.û��static����:������.������+�����б�
					2.��static����:����.������+�����б�
					3.��ͬһ������:����+�����б�
				���췽���ĵ��÷�ʽ
					1.Ŀǰ:new ���췽������+�����б�
			3.�ѹ��췽�� Student  д��Сд�� student��
				_04TestConstructor.java:23: ����: ����������Ч; ��Ҫ��������
				������ͨ����������
	*/
	public static void main(String[] args) {
		Student stu = new Student();
		stu.Student();
	}
}
class Student{
	void Student(){
		System.out.println("12312312312");
	}
	student(){
		System.out.println("66666666666");
	}
}
