package cn.itsource.day13.code;

class _07TestEnum{
	/*
		����:���һ������,��һ���Ա�ľ�̬����
			 �Ա�̬����:ֵֻ��Ҫ����ֵ ��  Ů  ��
			 �������һ����Sex ֻ���ڹ̶�����������[����д��]

	*/
	public static void main(String[] args) {
		Sex man1 = Sex.MAN;
		Sex man2 = Sex.MAN;
		Sex man3 = Sex.MAN;
		System.out.println(man1);
		System.out.println(man2);
		System.out.println(man3);
		/*
			����:��ӡ�ľ�Ȼ�ǵ�ֵַ:ϣ����ֱֵ�۵Ŀ����������
			����һ���ֶ�:��̬����
			���췽����ʼ���ֶ�
			��дtoString
		*/
		Sex woman = Sex.WOMAN;
		System.out.println(woman);
	}
}
class Sex{
	private String name;//��������
	private Sex(){}//��һ����˽�л����й��췽��
	public static final Sex MAN = new Sex("��");//����ģʽ
	public static final Sex WOMAN = new Sex("Ů���Ӵ�ү��");
	private Sex(String name){
		this.name = name;
	}
	public String toString(){
		return this.name;
	}
}
