package cn.itsource.day10.code;class _08TestFengZhuang{
	/*
		java����ν��з�װ
			��˽�л��ֶ�
			���ṩsetget����[��ɹ���,��ֵȡֵ]
				public :  ��Ҫ:��Ϊϣ������ͨ��setget������ֵȡֵ,������Ҫ�ṩ
				static :  ����:��������,�ֶ�ҲҪ��,�ֶξͳɹ������
				�������� : setName  getName  :����ֶ������ǲ�������  get �� is
				��ʽ���� : setName(String s) , getName()
				����ֵ     void setName , String getName()
			���ṩһ���޲����Ĺ��췽��[super��ʱ���ͷ��Ϊʲô��Ҫ�޲����Ĺ��췽��]

		��װ��ɵ�һ����:javaBean:һ����׼��java��:��������һ������
	*/
	public static void main(String[] args) {
		//��װ֮ǰ,�������,�����޸�,����ȫ
		/*
		Student stu = new Student();
		stu.name = "����";
		stu.name = "����";
		System.out.println(stu.name);*/

		Student stu = new Student();
		stu.setName("С����");
		stu.setName("������");
		System.out.println( stu.getName() );
	}
}
class Student{
	private String name;//"С����"
	private int age;
	private boolean sex;2
	public void setSex(boolean b){
		sex = b;
	}
	public boolean isSex(){
		return sex;
	}
	public void setName(String s){
		if(name !=null ){
			return;
		}
		name = s;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	Student(){
	}
}
