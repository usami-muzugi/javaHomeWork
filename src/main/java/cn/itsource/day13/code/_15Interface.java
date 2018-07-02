package cn.itsource.day13.code;

class _15Interface{
	/*
		�ӿ�֧�ֶ�̬д��:ע��һ���Ǳ���ʱ������ʱ�Ĺ���
	*/
	public static void main(String[] args) {
		USB usb = new Crilce();
		//ע�����ʱ����ʱ����,���뿴���
		usb.getLength();//����
		//usb.eat();//bu����
		US us = new Crilce();
		UB ub = new Crilce();
	}
	USB getUSB(){//�����ڲ�ֻ�᷵�ص���ʵ����Ķ���
		return new Crilce();
	}
}
interface UB{
}
interface USB{
	void getLength();
}
interface US extends USB,UB{
	void eat();
}
class Crilce implements US{
	public void eat(){}
	public void getLength(){}
}