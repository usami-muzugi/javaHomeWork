package cn.itsource.day15.code.Day15.src.cn.itsource._01Test;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {
	/*
	 * 	��ϲ���
	 * 
	 * */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");//Ĭ�ϱ߿򲼾�
		
		//׼���齨���뵽Frame
		JButton jBE = new JButton("E");
		JButton jBS = new JButton("S");
		JButton jBC = new JButton("C");
		
		JPanel jPanel = new JPanel();
		
		
		
		//jPanel���ò���ģʽ
		jPanel.setLayout(new GridLayout(2, 2));
		
		//׼���ĸ���ť���뵽jPanel
		for (int i = 0; i < 12; i++) {
			jPanel.add(new JButton(i+""));
		}
		
		
		
		//���齨���뵽���㴰��
		jFrame.add(jBE, BorderLayout.EAST);
		jFrame.add(jBS, BorderLayout.SOUTH);
		jFrame.add(jPanel, BorderLayout.CENTER);
		
		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}

}
