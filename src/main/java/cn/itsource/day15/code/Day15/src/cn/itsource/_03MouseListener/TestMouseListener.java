package cn.itsource.day15.code.Day15.src.cn.itsource._03MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestMouseListener {
	/*
	 * �������¼�
	 * 
	 * 		1.���㴰����,�а�ť,������,������С
	 * 		˼·:
	 * 			1.�������㴰��
	 * 			2.��ղ���
	 * 			3.׼����ť����
	 * 			4.��ť�������ô�С
	 * 			5.׼������¼�����[����һ����,ʵ��MouseListener�ӿ�]
	 *          6.�Զ�������ʵ�ַ���[ʵ�ֹ���]
	 *          7.׼������¼������Զ�����Ķ���,����ť����¼�����
	 * */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		jFrame.setLayout(null);
		
		//׼����ť
		JButton jButton = new JButton("δ��������");
		jButton.setBounds(100, 100, 150, 150);
		
		//׼���¼������Ķ���
		//MyMouseListener myMouseListener = new MyMouseListener(jButton);
		MyMouseListener myMouseListener = new MyMouseListener();
		jButton.addMouseListener(myMouseListener);
		
		jFrame.add(jButton);

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
