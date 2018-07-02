package cn.itsource.day13.code;

class _09TestEnumObject{
	/*
		ö����չ��Enum��  Enum��̳�Object
		�����Լ�д��ö����,��ʽ�ļ̳���Enum��
		ö�������һ����������,һ����д��һ��������.java��Դ�ļ���,��������ɶ������ֽ����ļ�
	*/
	public static void main(String[] args) {
		System.out.println( Sex.MAN.name() );
		System.out.println( Sex.MAN );
		System.out.println( Sex.MAN.toString() );


	}
}

enum Sex{
	MAN,WOMAN
}

