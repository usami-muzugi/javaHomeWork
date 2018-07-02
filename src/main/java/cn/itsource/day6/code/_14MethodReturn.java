package cn.itsource.day6.code;class _14MethodReturn{
	/*
		����return ��ע������
			��������ֵ,����ֵλ��,�������ڲ��ķ���ֵ�����Ӧ
				��ֻ���ṹ����ֵ
	*/
	public static void main(String[] args) {
		
	}
	static int add(byte a,byte b){
		if(a>b){//ֻ���ṹ����ֵ
			int sum = a+b;
			return sum+10;
		}else{
			return b+10;
		}
	}
	/*
	static int add(int a,byte b){
		if(a>b){//ֻ���ṹ����ֵ
			int sum = a+b;
			return sum;
		}else if(b>a){
			return a-b;
		}else if(b == a){
			return a;
		}
	}*/
	/*
	static int add(int a,int b){
		if(a>b){//ֻ���ṹ����ֵ
			int sum = a+b;
			return sum;
		}
	}*/
}
