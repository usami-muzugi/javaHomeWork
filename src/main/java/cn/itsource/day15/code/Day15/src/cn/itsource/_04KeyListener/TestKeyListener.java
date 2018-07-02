package cn.itsource.day15.code.Day15.src.cn.itsource._04KeyListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestKeyListener {
	/*
	 * ���Լ����¼�[�������������ڲ����д�������]
	 * */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("������");
		jFrame.setLayout(null);
		
		//׼�����
		JButton jButton = new JButton("̹��");
		jButton.setBounds(200, 200, 100, 100);
		
		//jButton��Ӽ��̼����¼�[�����ڲ���]
		/*
		 * 1.һ��Ҫ��KeyListenerʵ����Ķ���
		 * 2.new  KeyListener(){   }//��ʵ�������ڶ���KeyListener�ӿڵ�ʵ��
		 * 3.ʵ��new��ʱ��õ����Ƕ���
		 * 4.�࿴����,���Ǵ���,����û������[�ִ�����һ������ڲ�,���������ڲ���]
		 * */
		jButton.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {//type����
				//System.out.println(e.getKeyCode());
				//System.out.println(e.getKeyChar());
				char keyChar = e.getKeyChar();
				if(keyChar == 'w'){
					jButton.setBounds(jButton.getX(), jButton.getY()-5, 100, 100);
				}else if(keyChar == 's'){
					jButton.setBounds(jButton.getX(), jButton.getY()+5, 100, 100);
				}else if(keyChar == 'a'){
					jButton.setBounds(jButton.getX()-5, jButton.getY(), 100, 100);
				}else if(keyChar == 'd'){
					jButton.setBounds(jButton.getX()+5, jButton.getY(), 100, 100);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {//�����ͷŵ�ʱ��
				// TODO Auto-generated method stub
				//System.out.println("�����ͷ���");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {//���̰��µ�ʱ��,������һЩ����
				// TODO Auto-generated method stub
				//System.out.println("���̰�����");
			}
		});
		
		jFrame.add(jButton);

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
