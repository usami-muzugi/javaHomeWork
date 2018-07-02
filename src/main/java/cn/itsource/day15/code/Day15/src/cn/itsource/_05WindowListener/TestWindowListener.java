package cn.itsource.day15.code.Day15.src.cn.itsource._05WindowListener;

import java.awt.Frame;

public class TestWindowListener {
	/*�����¼�
	 * 		�رմ���,����˼·,
	 * 			1.�Զ����಻ֱ��ʵ��WindowListener���Ǽ̳иýӿڵ�����,
	 * 			2.�Զ�����Ҳ��һ���¼�������
	 * */
	public static void main(String[] args) {
		Frame jFrame = new Frame("������");

		
		//MyWindowListener myWindowListener = new MyWindowListener(jFrame);
		
		MyWindowAdapter myWindowAdapter = new MyWindowAdapter(jFrame);
		jFrame.addWindowListener(myWindowAdapter);
		

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
