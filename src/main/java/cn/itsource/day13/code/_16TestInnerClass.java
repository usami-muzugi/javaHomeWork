package cn.itsource.day13.code;

class _16TestInnerClass{
	/*
		�ڲ����﷨����:
			
	*/
	public static void main(String[] args) {
		//�Ǿ�̬�ڲ��ഴ������[ ������ ]
		Outer.Inner1 inner1  = new Outer().new Inner1();
		//��̬�ڲ��ഴ������[ ������ ]
		Outer.Inner2 inner2 = new Outer.Inner2();

		//�Ǿ�̬�ڲ�����:��̬�����ķ���[����������]
		//�Ǿ�̬�ڲ�����:�Ǿ�̬�����ķ���
		inner1.Inner();

		//��̬�ڲ�����:��̬�����ķ���
		Outer.Inner2.Inner2Static();
		//��̬�ڲ�����:�Ǿ�̬�����ķ���
		inner2.Inner();

		//�ڲ��౾��Ҳ��һ�������:�ڲ�����ô�̳�,��ôʵ�ֽӿ�,��ô????������ô?
	}
}
class Outer{//�ⲿ��
	class Inner1{//�ڲ���
		/*
		static void InnerStatic(){//��������������
			System.out.println("�Ǿ�̬�ڲ�����:��̬�����ķ���");
		}*/
		void Inner(){
			System.out.println("�Ǿ�̬�ڲ�����:�Ǿ�̬�����ķ���");
		}
	}
	static class Inner2{//�ڲ���
		
		static void Inner2Static(){
			System.out.println("��̬�ڲ�����:��̬�����ķ���");
		}
		void Inner(){
			System.out.println("��̬�ڲ�����:�Ǿ�̬�����ķ���");
		}
	}
}
