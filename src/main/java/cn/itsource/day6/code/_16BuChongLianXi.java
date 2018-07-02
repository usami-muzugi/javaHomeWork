package cn.itsource.day6.code;class _16BuChongLianXi{
	/*
		3)����һ������,����һ������,���0~��������Χ,��,��3�ı��������е�����֮��
	*/
	public static void main(String[] args) {
		add(10);

		add(888);

		add();
	}
	static void add(int a){//��
		int sum = 0;
		for(int i = 0;i<= a;i++){
			if(i%3==0){
				sum+=i;
			}
		}
		System.out.println("sum="+sum);
	}
}
