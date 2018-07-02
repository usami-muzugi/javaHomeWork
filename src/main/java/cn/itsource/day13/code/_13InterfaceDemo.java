package cn.itsource.day13.code;

class _13InterfaceDemo{
	/*
		��ʵ�ֽӿ�
			�﷨:
			interface USB{}
			class UsbImpl implements USB{}//�൱�ڼ̳�:�ɵ�
		1.������ͬʱʵ�ֶ���ӿ�:�����ж���ɵ�
		2.������,ʵ�ֽӿڵ�ͬʱ�̳�������:�̳����ڽӿ�:�׵����Ǳȸɵ���
	*/
	public static void main(String[] args) {
		
	}
}
class B{
}
interface A{
}
interface USB{
	void eat();//public ���ε�
}
class UsbImpl extends B implements USB,A {
	public void eat(){
		System.out.println("123456");
	}
}
