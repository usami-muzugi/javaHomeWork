package cn.itsource.day14.code.Day14_GUI.src.cn.itsource._04firstGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestAddButton {
	/*
	 * 	���㴰��Frame����Ӱ�ť
	 * 		1.˼·:�������д����
	 * 		2.�����ִ������
	 * 
	 * */
	public static void main(String[] args) {
		JFrame frame = new JFrame("�߼�������");
		//�����ò���ģʽ
		//frame.setLayout(manager);//LayoutManage manager
		
		//׼��Ҫ��ӵİ�ť
		JButton jb1 = new JButton("1");//{}
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		
		//����ť��ӵ�frame������
		frame.add(jb1);
		frame.add(jb2);
		frame.add(jb3);
		//frame.add(jb4);
		
		frame.setSize(500,500);//��С
		frame.setLocationRelativeTo(null);//����
		frame.setVisible(true);

	}

}
