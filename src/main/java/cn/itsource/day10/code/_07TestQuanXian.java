package cn.itsource.day10.code;class _07TestQuanXian{
	public static void main(String[] args) {
		//new Computer().name = "ƻ��";
		new Computer().num = 666;
	}
}
class Computer{
	private String name;
	public int num;
	void add(){
		System.out.println(name);
	}
}