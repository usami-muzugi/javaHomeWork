package cn.itsource.day6.code;class _11ReturnDemo{
	/*
		return  ��ʾ������ǰ�ķ���

		break,continue,return,���治��д���
	*/
	public static void main(String[] args) {
		for(int i = 1;i<=7;i++){
			if(i==4){
				return;
				//System.out.println("123456");//_11ReturnDemo.java:11: ����: �޷����ʵ����
			}
			System.out.println("ҫ�ĵĵ�"+i+"��");
		}
		System.out.println("С��");
	}
}
