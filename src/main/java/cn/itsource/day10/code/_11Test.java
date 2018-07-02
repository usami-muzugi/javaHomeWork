package cn.itsource.day10.code;class _11Test{
	/*
		����this���е�ǰ�����Ǹ���ַ

		this���е�ǰ�����ַ:this����һ�����������
		����stu�Ƕ���  thisҲ�Ƕ���


		thisд��λ��:������ʹ����this:��ǰ��Ķ���
	*/
	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println("stu --->" + stu);
		stu.print();

		System.out.println("----�����ķָ���-------------------------------------");

		Student stu2 = new Student();
		System.out.println("stu2 --->" + stu2);
		stu2.print();


	}
}
class Student{
	public void print(){
		System.out.println("this --->"+this);
	}
	public static void pr(){//static���󼶱�   this����:�Ǿ�̬��
		System.out.println("this --->"+this);
	}
}
