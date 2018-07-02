package cn.itsource.day13.code;

class _10AbstractDemo{
	/*
		������:abstract ���ε�һ������ǳ�����

		1.�����й��췽��,�ֶ�,��ͨ����[����Ҳ��һ����]
		2.����������:һ������Ϊģ����,����,����
		3.�����಻�ܴ�������:

		4.������,�������г��󷽷�
		5.֧�ֶ�̬д��

	*/
	public static void main(String[] args) {
		//_10AbstractDemo.java:10: ����: Graph�ǳ����; �޷�ʵ����  java�涨[ ���������ĳ������еĹ��췽��˽�л� ]
		//new Graph();
		Graph gp = new Cricle();
		gp.area();
	}

	Graph getGrp(){//Graph�϶����������,��ΪGraph���ܴ�������
		return new Cricle();
	}
}
abstract class Graph{//��ȡ��һ�������ĸ���
	int i = 10;
	public void getLength(){ 
		//Graph gp = new Graph();//��Ȼ������������Կ���,���췽����˽�л���,�����Լ����ڲ����ǲ��ܴ�������,java�涨
	}
	Graph(){//Ҳֻ�п��ܷ���Graph�������
	}
}
class Cricle extends Graph{
	void getArea(){}
}