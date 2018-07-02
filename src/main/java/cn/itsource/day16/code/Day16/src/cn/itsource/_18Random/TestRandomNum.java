package cn.itsource.day16.code.Day16.src.cn.itsource._18Random;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class TestRandomNum {
	/*
	 *  1.Math������һ������ random         double             [0.0,1.0)
	 *  	��¼:�����¼..��̨�ͻ�ִ��һ�δ���
		2.Random�ࣨ�кܶ෽����    boolean double int ...         [0,n)
		3.��1.7��ʼRandom������    ������������������        [n,m)
		       ThreadLocalRandom
		4.UUID   ����������Ψһ��ʶID
	 * */
	public static void main(String[] args) {
		System.out.println(Math.random());
		/*
		 * Random() 
			          ����һ���µ�������������� 
			Random(long seed) 
			          ʹ�õ��� long ���Ӵ���һ���µ�������������� 
		 * */
		Random random = new Random(1L);
		System.out.println(random.nextBoolean());
		
		/*int nextInt() ������һ��α����������Ǵ�������������������о��ȷֲ��� int ֵ�� */
		System.out.println(random.nextInt());
		
		/*int nextInt(int n) ����һ��α�����������ȡ�Դ���������������еġ��� 0����������ָ��ֵ����������֮����ȷֲ��� int ֵ�� */
		System.out.println(random.nextInt(1));
		
		/* void setSeed(long seed)   ʹ�õ��� long �������ô�����������������ӡ� */
		//random.setSeed(1);
		
		System.out.println(random.nextInt());
		
		/*
		 * ����ȡֵ����0~  ĳ����Χ  7~9ȡֵ
		 * */
		ThreadLocalRandom current = ThreadLocalRandom.current();
		System.out.println(current.nextInt(7, 9));
		
		/*
		 * static UUID randomUUID() 
          ��ȡ���� 4��α������ɵģ�UUID �ľ�̬������ 
		 * */
		UUID randomUUID = UUID.randomUUID();
		System.out.println(randomUUID);
	}

}
