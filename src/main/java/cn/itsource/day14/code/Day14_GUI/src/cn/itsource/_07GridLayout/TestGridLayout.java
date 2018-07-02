package cn.itsource.day14.code.Day14_GUI.src.cn.itsource._07GridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGridLayout {
	/*
	 * 	���񲼾�GridLayout
	 * */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		
		/*
		 * GridLayout() 
			          ��������Ĭ��ֵ�����񲼾֣���ÿ�����ռ��һ��һ�С� 
			GridLayout(int rows, int cols) 
			          ��������ָ�����������������񲼾֡� 
			GridLayout(int rows, int cols, int hgap, int vgap) 
			          ��������ָ�����������������񲼾֡� 

		 * */
		GridLayout gridLayout = new GridLayout(2,3,50,50);
		jFrame.setLayout(gridLayout);
		
		//׼�����
		JButton jb1 = new JButton("�㽶");
		JButton jb2 = new JButton("�ƹ�");
		JButton jb3 = new JButton("����");
		JButton jb4 = new JButton("����");
		JButton jb5 = new JButton("����");
		JButton jb6 = new JButton("˿��");
		
		//JButton[] arr = new JButton[6];
		/*for(int i = 0;i<=5;i++){
			 jFrame.add(new JButton(i+""));
		}*/

		jFrame.add(jb1);
		jFrame.add(jb2);
		jFrame.add(jb3);
		jFrame.add(jb4);
		jFrame.add(jb5);
		jFrame.add(jb6);
		

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
