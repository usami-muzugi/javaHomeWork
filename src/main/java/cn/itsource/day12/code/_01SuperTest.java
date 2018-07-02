package cn.itsource.day12.code;

class _01SuperTest{
	/*
		1.һ��������Դ�ֵȡֵ,һ�����п��Դ�ĵط���,�ֶ�!
		2.����Student Teacherû�м̳е��ֶ�,���Ǽ̳е���get set����
		3.���Դ�ֵ��?����

		4.�Ӵ���ĽǶ�����,��Ȼû�м̳е�������ֶ�:���Ǹо������õ��˸�����ֶε�!
		  Ϊ����?super���� [ super������;���� ] 
	*/
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAcct("С��");
		System.out.println(stu.getAcct());
	}
}
/*
	ѧ������ϵͳ  �˺�  :��ʦ�˺�,ѧ���˺�:java��˵��������Զ���:
	��ʦ��ѧ���˺Ŷ��й����ľ�̬����:�˺� ����
*/
class User{//��׼javaBean
	private String acct;//�˺�
	private String pasw;//����
	public void setAcct(String acct){
		this.acct = acct;
	}
	public String getAcct(){
		return this.acct;
	}
	public void setPasw(String pasw){
		this.pasw = pasw;
	}
	public String getPasw(){
		return this.pasw;
	}
	User(){//ΪʲôҪ�ṩ��,ĳЩ����²��ṩ�Ͳ�����!
	}
}
class Teacher extends User{
}
class Student extends User{
}