package cn.itsource.day13.code;

class _11AbstractMethod{
	/*
		���󷽷�:
			1.ʹ��abstract ���εķ������ǳ��󷽷�û�з�������;
			2.���󷽷�������ڳ�������[�ӿ�Ҳ����]�����ܹ�������ͨ����
			3.�����������
				a)�ǳ�������븲д�����е����еĳ��󷽷���
				b)�����಻�ø�д�����еĳ��󷽷�
	*/
	public static void main(String[] args) {
		Cricle cc = new Cricle(1.0);
		cc.getLength();
	}
}
abstract class Graph{
	abstract void getLength();//�ñ��˼̳�,ǿ����ʾ���˱��븲д
}
class Cricle extends Graph{
	double r;
	@Override
	void getLength(){
		System.out.println(2*Math.PI*r);
	}
	Cricle(double r){
		this.r = r;
	}
}

