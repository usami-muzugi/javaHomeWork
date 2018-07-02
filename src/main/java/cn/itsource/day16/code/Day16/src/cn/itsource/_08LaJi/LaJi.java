package cn.itsource.day16.code.Day16.src.cn.itsource._08LaJi;

public class LaJi {//���
	String name;
	
	public LaJi(String name) {
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(name +"  ��������.....");
	}
}
