package cn.itsource.day11.code;

class _09OverrideToString{
	/*
		1.Object:��String toString()���ص��Ƕ�������� 
	*/
	public static void main(String[] args) {
		Student stu = new Student("����",18);
		String na = stu.toString();//�õĸ���Object�е�toString����
		System.out.println(na);//��ӡ��������:Student@15db9742  
		/*
			1.��ʵ:���������Ӧ����"����ľ�̬����
			2.����Student����stu�����˸����toString���صĶ�������,��������ʵ���ڶ��������
			3.����Object���е�toString����,���������������ڶ��������,������Ҫ��д
			4.����Object���е�toString ����Ϊʲô���ӡStudent@15db9742
				public String toString() {
					return getClass().getName() + "@" + Integer.toHexString(hashCode());
						   ��ȡ����ʱ���Ͳ��һ������
				}
			5.��Student���и�дObject�е�toString
		*/
		System.out.println(stu);//��ǰ������õ��Լ���toString:����Լ���д�����Լ���,������Object
	

		String str = "С����";
		String strna = str.toString();
		System.out.println("strna="+strna);

		System.out.println("str="+str);

		/*
			�ڴ�ӡjava�Ѿ�д�õ����ʱ��,û�д�ӡ���Ƶ�ֵַ:��һ��������ַ�������
			˵�������Ѿ���д��Object���е�toString
		*/
		Class cla = "XXX".getClass();
		System.out.println(cla);

		//��ʵ�Լ�дҲ�ǿ����õ�����������,���ǲ���!
		String stt = stu.getString();
		System.out.println("stt-->" + stt);


		Student stuu = null;
		System.out.println(stuu);
	}
}
class Student{
	String name;//"����"
	int age;//18
	Student(String name ,int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name+"--"+age;
	}
	public String getString(){
		return name+"--"+age;
	}
}
