package cn.itsource.day5.code;class _11IfLianXi{
	/*
		1.���2�������е����ֵ
		2.�ж�һ�����Ƿ���3�ı���
			�ٵ���һ����int num = 21;
			��num%3 == 0 
				true ��3�ı���,
				false ����3�ı���
		3.С��java ���Գɼ� ���ȼ���A B C  D ���жϱ���ֵ�ڲ�ͬ�ķ�Χ�ģ���ӡ�����ͬ�ĵȼ�
				90~100  A�ȡ�
				80-89    B�ȡ�
				70-79    C�ȡ�
				60-69    D�ȡ�
				60����   E�ȡ�
	*/
	public static void main(String[] args) {
		//��
		int a = 50;
		int b = 20;
		if(a>b){
			System.out.println("a�ǽϴ������="+a);
		}else{
			System.out.println("b�ǽϴ������="+b);
		}
		//��
		int num = 22;
		if(num%3 == 0){
			System.out.println(num+"��3�ı���");
		}else{
			System.out.println(num+"����3�ı���");
		}
		//��
		int java = 105;
		if(java<60){
			System.out.println("E");
		}else if(java>=60&&java<70){
			System.out.println("D");
		}else if(java>=70&&java<80){
			System.out.println("C");
		}else if(java>=80&&java<90){
			System.out.println("B");
		}else if(java>=90&&java<=100){
			System.out.println("A");
		}

	}
}
