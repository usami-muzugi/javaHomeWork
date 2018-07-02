package cn.itsource.day6.code;class _08BreakLianXi{
	/*
		���100����ǰ5��2�ı���������
			�ٱ���1~100����
			�ڽ�ȡ����ÿһ�����ֽ����ж��Ƿ���2�ı���
			�������:��ӡ����,����Ŀǰȥ�˶����˸���!
			��ÿ��ȡ����֮�����жϸ���Ϊ5,����ѭ��
	*/
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
				count++;
				if(count >= 5)//���if ,д�ڲ�,�Ż���һ��������
					break;
			}
		}
		System.out.println("count="+count);
	}
}
