package cn.itsource.day15.code.Day15.src.cn.itsource._02clac;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {
	JButton jButton;
	TextField textField;
	String str = "";
	public MyActionListener(JButton jButton, TextField textField) {
		this.jButton = jButton;
		this.textField = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("�㱻����һ��");
		String text = jButton.getText();
		str+=text;
		textField.setText(str);
	}

}
