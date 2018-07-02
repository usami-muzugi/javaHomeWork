package cn.itsource.day15.code.Day15.src.cn.itsource._05WindowListener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowAdapter extends WindowAdapter {
	Frame jFrame;
	public MyWindowAdapter(Frame jFrame) {
		this.jFrame = jFrame;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		jFrame.dispose();
	}
}
