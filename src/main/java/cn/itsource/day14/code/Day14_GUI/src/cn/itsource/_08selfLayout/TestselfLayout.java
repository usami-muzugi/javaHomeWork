package cn.itsource.day14.code.Day14_GUI.src.cn.itsource._08selfLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestselfLayout {
	/*
	 * 	�Զ��岼��
	 * 		�Լ�����ô��,����ô����,���ɲ���ģʽ����
	 * 
	 * 		
	 * */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		
		//�Զ��岼��Ҫ����ղ���ģʽ
		jFrame.setLayout(null);//
		
		//׼�����
		JButton jb1 = new JButton("�㽶");
		
		jb1.setBounds(50, 100, 200, 200);
		
		jFrame.add(jb1);
		
		

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
