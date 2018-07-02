package cn.itsource.day14.code.Day14_GUI.src.cn.itsource._03firstGUI;

import java.awt.Frame;

public class TestFirstGui {
	/*
	 * 	��һ���������
	 * 		1.�׾�Ӧ����һ�����㴰��Frame
	 * 		2.Frame��:�����˶��㴰�����һ������
	 * 		3.�����һ��Frame����,����һ������Ķ��㴰��
	 * 		4.��������[ ע�⵼�� ]
	 * 
	 * Frame(String title) 
          ����һ���µġ�������ɼ��ġ�����ָ������� Frame ����
	 * 
	 * */
	public static void main(String[] args) throws InterruptedException {
		Frame frame = new Frame("�߼�������");//����һ��������ɼ��Ķ��㴰��
		
		frame.setSize(500, 500);
		//frame.setLocation(500, 500);//����λ��,��������
		frame.setLocationRelativeTo(null);//����
		
		Thread.sleep(2000);//�ӳٴ���ִ��2��
		
		frame.setVisible(true);//���ÿɼ�
		
		
		

	}

}
