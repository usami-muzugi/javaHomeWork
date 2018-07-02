package cn.itsource.day11.code;

class _10TestEquals{
	/*
		1.Object�е�boolean equals(Object obj){} �Ƚ����������Ƿ����
		2.��ʵ������,���������Ƿ���ͬһ������:Ӧ�ñȽϵ��Ǿ�̬����
		3.д������̬����һ���Ķ���,ʹ�õ���Object���е�equals�Ƚ�,���false!,������ʵ�Ƚ�ӦΪtrue
		4.�鿴Object��equalsԴ��:public boolean equals(Object obj) {  return (this == obj);  }
		  ����Ƚϵ��Ƕ���ĵ�ֵַ,���������������Ҫ�ȽϾ�̬���Ե�����,:��д!
	*/
	public static void main(String[] args) {
		Student stu1 = new Student("��",18);
		Student stu2 = new Student("��",18);
		boolean result = stu1.equals(stu2);
		System.out.println(result);
	}
}
class Student{//stu1   
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	/*
		�汾��:����汾��������
	*/
	public boolean equals(Object obj) {
		//�������� ������ = (��������)ֵ; 
		Student stu = (Student)obj;
		return this.name.equals(stu.name) && this.age == stu.age;//this.name.equals(stu.name)this.name���õ���String��equals����
		
    }
	/*
		�汾3,���ư汾2,���String����Ƚ�,��Ӧ��ʹ��==�з���
		��Ӧ��ʹ��equals����

		����:�汾��:this.name.equals(stu.name) && this.age == stu.age�Ѿ��ǲ���ֵ�����˶����Ƿ����
		û��Ҫдif�ṹ
	*/
	/*
	public boolean equals(Object obj) {
		//�������� ������ = (��������)ֵ; 
		Student stu = (Student)obj;
       if(this.name.equals(stu.name) && this.age == stu.age){//this.name.equals(stu.name)this.name���õ���String��equals����
			return true;
	   }else{
			return false;
	   }
    }*/
	/*
		�汾2,����汾1�Ĵ���
			��ԭ��ʵ����
			��������:name�ֶ���String����,Ҳ���Ƕ���:����ıȽϾ�Ӧ����equals
			���String��==�Ƚ����з��յ�!
			String str1 = new String("123");
			String str2 = new String("123");
			str1==str2  ���Ϊfalse
			String str3 = "123";
			String str4 = "123";
			str3==str4  ���Ϊfalse
	*/
	/*
	public boolean equals(Object obj) {
		//�������� ������ = (��������)ֵ; 
		Student stu = (Student)obj;
       if(this.name==stu.name && this.age == stu.age){
			return true;
	   }else{
			return false;
	   }
    }*/
	/*
		�汾1,�������ԭ��
			obj,ֻ�����Ͳ���ֵ:Object2018/6/22 ��������:Object����name�ֶλ���age�ֶ�!û��
	*/
	/*
	public boolean equals(Object obj) {
       if(this.name==obj.name && this.age == obj.age){
			return true;
	   }else{
			return false;
	   }
    }*/
}
