package cn.itsource.day14.code.Day14_GUI.src.cn.itsource._05FlowLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFlowLayout {
	/*
	 * �����㴰�������ʽ����;FlowLayout
	 * 
	 * */
	public static void main(String[] args) {
		//��׼�����㴰�����
		JFrame jFrame = new JFrame("������");
		//��׼������ģʽ
		/*
		 * 	FlowLayout() 
		          ����һ���µ� FlowLayout�����Ǿ��ж���ģ�Ĭ�ϵ�ˮƽ�ʹ�ֱ��϶�� 5 ����λ�� 
			FlowLayout(int align) 
		          ����һ���µ� FlowLayout��������ָ���Ķ��뷽ʽ��Ĭ�ϵ�ˮƽ�ʹ�ֱ��϶�� 5 ����λ�� 
			FlowLayout(int align, int hgap, int vgap) 
		          ����һ���µ������ֹ�������������ָ���Ķ��뷽ʽ�Լ�ָ����ˮƽ�ʹ�ֱ��϶�� 
		 * */
		System.out.println(FlowLayout.LEFT);
		FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT,50,50);
		//�����ö��㴰��Ĳ���ģʽ
		jFrame.setLayout(flowLayout);
		
		//��׼����Ҫ��ӵİ�ť
		JButton jb1 = new JButton("----------->1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		
		//�ཫ��ť��ӵ����㴰��jFrame
		jFrame.add(jb1);
		jFrame.add(jb2);
		jFrame.add(jb3);
		jFrame.add(jb4);
		
		
		//�����ö��㴰���С
		jFrame.setSize(500, 500);
		//�����ö��㴰���λ��
		jFrame.setLocationRelativeTo(null);
		//����ʾ���㴰��
		jFrame.setVisible(true);
	}

}
