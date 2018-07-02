package cn.itsource.day15.code.Day15.src.cn.itsource._02clac;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestCalc {
	/*
	 * 	�������ļ򵥽���ʵ��,�Զ��岼�ֵķ�ʽ
	 * 
	 * 		˼·:
	 * 			1.���㴰�彨��
	 * 			2.��ղ���ģʽ
	 * 			3.׼���齨
	 * 				a.�ı���
	 * 				2.��ť
	 * 			4.�齨�����ô�С��λ��
	 *			5.���齨��ӵ����㴰��
	 *
	 *������Ҫ��ɵ����ť��ֵ�����ı���:
	 *			1.�������ʱ���ȡ��ť�е�ֵ
	 *				String text = String getText();
	 			2.�ͷŵ�ʱ��,����õİ�ťֵ,���뵽textField
	 				void setText( text );
	 				
	    �¼���������[ʱ����������]
	    	1.��Ҫ����ť����¼�����
	    		jButton.addActionListener(ActionListener listener);
	    	2.ActionListener�ӿ�:�¼������Ľӿ�
	    	3.ActionListenerʵ����,��ʵ����һ���¼���������,һ���������һ��������¼�����:[�൱��һ����ϵͳ]
	    	4.ActionListener:ActionPerformed ����:[���¼���������ø÷���,���һЩ����,һЩ����]
	    	4.��ȷ�Լ�Ҫ���Ĺ���,��ȡֵ,����ֵ!
	    	5.�Ѿ�ʵ����ActionListener�ӿڵ���,��д�ķ���δ���ܹ������Լ����еķ������ܵ�����
	    	6,����Լ�ʵ�ֽӿڸ�д����
	 * */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		jFrame.setLayout(null);
		
		//׼���齨
		TextField textField = new TextField();
		JButton jButton = new JButton("1");
		//׼����һ���¼������Ķ���
		MyActionListener myActionListener = new MyActionListener(jButton,textField);
		
		jButton.addActionListener(myActionListener);


		
		//�����齨�ô�С��λ��
		textField.setBounds(100, 100, 300, 100);
		jButton.setBounds(100, 300, 300, 100);
		
	
		
		//����齨
		jFrame.add(textField);
		jFrame.add(jButton);

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
