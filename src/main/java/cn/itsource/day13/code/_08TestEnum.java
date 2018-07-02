package cn.itsource.day13.code;

class _08TestEnum{
	/*
		����ö�ٵĻ����﷨
			1.ö�ٿ����� һ���� �� �ǳ����Ƶ��½ṹ;
			2.ö�ٵĳ��ֽ��������: ���������һ������,������ֵֻ�й̶�����,�������Ա�����������
			class ����{}
			enum ö������{}
			3.
				enum Sex{
					��,Ů  Ĭ����public static final
				}
			ѧ��ö�ٵ�99%
			4.һ�㲻д����,дӢ��Ϊ��д�ǹ淶
			5.%1����
				��ӡ����Ӣ�Ĳ���,ϣ����ӡ��������

			6.ö����   ��չ��Eum����  Enum��̳е���Object

	*/
	public static void main(String[] args) {
		System.out.println(Sex.MAN);//�о���Sex���͵�һ��ֵ
		System.out.println(Sex.WOMAN);

		System.out.println(Sex.WOMAN.getClass());
		System.out.println(Sex.WOMAN instanceof Sex);
	}
}
enum Sex{
	MAN("��"),WOMAN("С���");//ö�ٳ�������д�ڵ�һ��,������治д����,���Բ���д�ֺ�,���Ҫд�Ļ�,����д�ֺ�
	String name;
	Sex(String name){//Ĭ��˽�л�
		this.name = name;
	}
	public String toString(){
		return this.name;
	}
}