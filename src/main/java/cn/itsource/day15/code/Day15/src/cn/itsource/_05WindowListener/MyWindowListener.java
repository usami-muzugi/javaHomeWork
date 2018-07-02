package cn.itsource.day15.code.Day15.src.cn.itsource._05WindowListener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener {
	Frame jFrame;
	public MyWindowListener(Frame jFrame) {
		this.jFrame = jFrame;
	}

	@Override
	public void windowOpened(WindowEvent e) {//�򿪴����ʱ��ᷢ��������
		System.out.println("���ڱ�����");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {//���ڹرյ�ʱ��
		//System.exit(0);//�˳����������,��Ϊֱ����ֹ��������windowClosed�����ܻ�ִ�е�
		jFrame.dispose();//�ͷ���Ļ��Դ
	}

	@Override
	public void windowClosed(WindowEvent e) {//�ر�֮��
		System.out.println("�ر�֮��Ĳ���");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
