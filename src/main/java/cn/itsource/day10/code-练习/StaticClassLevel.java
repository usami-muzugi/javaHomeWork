public class StaticClassLevel{
	/*
		static���ε��ֶ�
			Ӧ��ͨ������.�ֶ�������
			Ӧ��ͨ������.���������ʣ����ֶα���������ж�����

		���󼶱�
			��static���ε��ֶΣ�������.�ֶ���������
			��static���εķ������Ŵ��������ʱ�򣬶�����ÿһ������û�б���������ж�����
		��̬�����Ĳ�������ʷǾ�̬�ı����ͷ���
		�Ǿ�̬�����ģ����Է��ʾ�̬�����ġ�
	*/
	public static void main(String[] args){
		add();
		new StaticClassLevel().run();
	}
	static void add(){
	System.out.println("add");

	}
	void run(){
		System.out.println("run");
		add();
	}
}

