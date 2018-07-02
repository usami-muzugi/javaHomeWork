public class Method {

    public static void main(String[] args) {
        int a = 10086;
		int b = 10000;

		add(a,b);
		Method.add(a,b);
		System.out.println(add(a,b));
		print(add(a,b));
		System.out.println(a);
		System.out.println(b);
		doSomething(a);
		System.out.println(a);		//ֵû�иı�
    }


    /**
     * get the sum of a and b
     * @param a int type a
     * @param b int type b
     * @return add a and b
     */
    public static int add(int a,int b) {
        return a + b;
    }



	//public static void add(int a){		//Method.java:22: ����: ������ Method�ж����˷��� add(int,int)
	//	System.out.println(a + b);			//��ʽ������ͬ�Ĳ���ͬ�������������������������η��ͷ���ֵ��ʲô��
	//}										//���ǲ������

	public static void add(int a){			//������ʽ������ͬ�ķ�����������������ͬ
		System.out.println(a);
	}

	public static void print(int i){
		System.out.println(i);
	}

	public static void doSomething(int i){		//����˵�������ʽ����
		i++;
	}
}