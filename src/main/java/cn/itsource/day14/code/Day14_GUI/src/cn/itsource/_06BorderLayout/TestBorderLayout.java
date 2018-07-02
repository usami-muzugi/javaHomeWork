package cn.itsource.day14.code.Day14_GUI.src.cn.itsource._06BorderLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBorderLayout {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		
		BorderLayout borderLayout = new BorderLayout(100,100);
		jFrame.setLayout(borderLayout);
		
		//׼���齨
		JButton jbE = new JButton("E");
		JButton jbW = new JButton("W");
		JButton jbN = new JButton("N");
		JButton jbS = new JButton("S");
		JButton jbC = new JButton("C");
		
		//jbE.setSize(100, 100);//����
		jbE.setPreferredSize(new Dimension(200,200));//��������
		
		jFrame.add(jbE,BorderLayout.EAST);
		jFrame.add(jbW,BorderLayout.WEST);
		jFrame.add(jbN,BorderLayout.NORTH);
		jFrame.add(jbS,BorderLayout.SOUTH);
		jFrame.add(jbC,BorderLayout.CENTER);
		

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
