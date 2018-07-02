package cn.itsource.day12.code;

class _14FinalDemo{
	/*
		final��������֮���Ч��
			1.�ⲿ�ࣺ������,������չ����,û�ж��ӵ���,̫����
			2.��ͨ���������շ���:������չ�ķ���,���ܸ�д
				private���εĲ��ܸ�д
				static ���εķ������ܸ�д
				final  ���εķ������ܸ�д
			3.��Ա�ֶΣ��ֲ����������յı���,���ܸı�ֵ
	*/
	final int i = 10;//���յĲ��ɱ�ı���
	public static void main(String[] args) {
		i = 20;
		final int j = 30;
		j = 40;
	}
}








class A{//������,������չ����
	final void eat(){//���շ���,������չ�ķ���,���ɱ�ķ���
	}
}
class B extends A{//_14FinalDemo.java:15: ����: �޷�������A���м̳�
	/*
	void eat(){//_14FinalDemo.java:18: ����: B�е�eat()�޷�����A�е�eat()
	}
	*/
}
