package cn.itsource.day11.code;

class _11equalDD{
	/*
		==��equal������
			2. == �Ƚ������
				1)�����������ͱ���:    �Ƚϵľ���ֵ�Ƿ����;
				2)�����������ͱ���:    �Ƚϵ��Ƕ���ĵ�ַ�Ƿ�һ��;���ų����� String��
			3. equals ����[��������ڸ���Object�е�,�Ƚ϶����Ƿ����]
				1) ������������ :  ���ܹ�ʹ��!   �����������Ͳ��Ƕ���,���ܹ�����Object�еķ���
				2) ������������ :  ������Object��Դ���ж���ľ��� == ���бȽϱȽ�
		ǿ��һ��:
			�Ƚ϶���Ӧ����equals
			�Ƚ�ֵ[�����������͵�ֵ,��ֵַ]:==
	*/
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		System.out.println(i == j);

		Student stu1 = new Student("С��",15);
		Student stu2 = new Student("С��",15);
		System.out.println(stu1 == stu2);
		Student stu3 = stu1;
		System.out.println(stu1 == stu3);


		System.out.println(stu1.equals(stu2));

		//String ��==�Ƚϵķ���
		String str1 = "1234";
		String str2 = "1234";
		System.out.println("str1="+str1+"--------str2="+str2);
		System.out.println(str1 == str2);

		String str3 = new String("1234");
		String str4 = new String("1234");
		System.out.println("str3="+str3+"--------str4="+str4);
		System.out.println(str3 == str4);
		System.out.println("----equals-------------------------------------------");
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
	


	}
}
class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		Student stu = (Student)obj;
		return this.name.equals(stu.name)&&this.age == stu.age;
	}
}
