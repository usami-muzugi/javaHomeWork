package cn.itsource.day15.code.Day15.src.cn.itsource._03MouseListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyMouseListener implements MouseListener {
	public MyMouseListener() {
		super();
	}

	JButton jButton;
	public MyMouseListener(JButton jButton) {
		this.jButton = jButton;
	}

	@Override
	public void mouseClicked(MouseEvent e) {//����¼�[1,2,3,4,5]
		//System.out.println("����һ�º����");
		System.out.println(e);
		
		int clickCount = e.getClickCount();
		
		if(clickCount == 1){
			System.out.println("����һ�º����");
		}else if(clickCount == 2){
			System.out.println("��������̫�����");
		}else{
			System.out.println("�ܲ�����");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {//����
		// TODO Auto-generated method stub
		//System.out.println("�����˺����");
		
	}

	public void mouseReleased(MouseEvent e) {//�ͷ�
		// TODO Auto-generated method stub
		//System.out.println("�ͷ��˺����");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {//����
		// TODO Auto-generated method stub
		//System.out.println("�����˺����");
		//jButton.setBounds(100, 100, 300, 300);
		//jButton.setBackground(Color.red);
		//System.out.println(e);
		
		//�ƶ�������,��ť,��ť���ƶ�
		/*1.����������һ�����ᴫ�����
		 * */
		/*Object source = e.getSource();//�õ��ľ����¼�Դ
		System.out.println(source);
		if(source instanceof JButton){
			JButton jb = (JButton)source;
			jb.setBounds(jb.getX()+10, jb.getY()+10, 150, 150);
		}*/
	}

	@Override
	public void mouseExited(MouseEvent e) {//�˳�
		// TODO Auto-generated method stub
		//System.out.println("������,���Ǻ����");
		//jButton.setBounds(100, 100, 150, 150);
		//jButton.setBackground(Color.green);
		System.exit(0);//�˳������,�ر��˴���[��ֹ��������]
		
	}

}
