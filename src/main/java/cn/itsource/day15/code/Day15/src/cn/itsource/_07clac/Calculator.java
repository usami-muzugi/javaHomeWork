package cn.itsource.day15.code.Day15.src.cn.itsource._07clac;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {
	public static void main(String[] args) {
		new Interface();
	}
}

class Interface extends JFrame {
	ArrayList<String> list = new ArrayList<String>();// ������������е������Լ������������ı��༭��õ�
	ArrayList<String> lists = new ArrayList<String>();// �������������ʹ���˵��������������������ť���𼯺�lists
	int cout = 0; // �����������������Ϊ�����и�Ԫ�ص��±�
	JPanel inputpanel; // GUI����Ĳ��ְ��������������̣�1��������壬ȷ������еĲ��ֹ���
	JTextField inputField; // 2.�������ӱ�ǩ
	JButton button; // 3.Ϊ�����Ӱ�ť���ı��༭������
	JButton btn1, btn2, btn3, btn4;
	JButton btn5, btn6, btn7, btn8;
	JButton btn9, btn10, btn11, btn12;
	JButton btn13, btn14, btn15, btn16;

	public Interface() {
		inputpanel = new JPanel();
		inputField = new JTextField(9); // �ı��򳤶�Ϊ9
		button = new JButton("����");
		inputpanel.add(inputField);
		inputpanel.add(button);
		this.add(inputpanel);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel(new GridLayout(4, 4));// ����panel���Ĳ��ֹ���ΪGridLayout��������Ϊһ��4*4������
		btn1 = new JButton("7");
		btn2 = new JButton("8");
		btn3 = new JButton("9");
		btn4 = new JButton("+");
		btn5 = new JButton("4");
		btn6 = new JButton("5");
		btn7 = new JButton("6");
		btn8 = new JButton("-");
		btn9 = new JButton("1");
		btn10 = new JButton("2");
		btn11 = new JButton("3");
		btn12 = new JButton("��");
		btn13 = new JButton("0");
		btn14 = new JButton(".");
		btn15 = new JButton("=");
		btn16 = new JButton("��"); // ����Button��ť
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		panel.add(btn11);
		panel.add(btn12);
		panel.add(btn13);
		panel.add(btn14);
		panel.add(btn15);
		panel.add(btn16); // ����ť��ӽ�panel���
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "7");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "8");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "9");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "4");
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "5");
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "6");
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "1");
			}
		});
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "2");
			}
		});
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "3");
			}
		});

		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + "0");
			}
		});
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText(inputField.getText() + ".");
			}
		}); // Ϊ���ְ�ť��С���㰴ť��ӵ���¼������֮��ť������������ʾ���ı��༭��
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(inputField.getText()); // �����ʵ�֣���ȡ���ı��༭������ʾ���ı��������뼯��list��
				lists.add("+"); // ��ȡ�����������lists��
				cout++; // ���������ĸ�����Ҳ����Ҫ��������Ĵ���
				inputField.setText(""); // ���༭����Ϊ�յģ�������һ�����ݵĶ�����
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(inputField.getText());
				lists.add("-");
				cout++;
				inputField.setText("");
			}
		});
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(inputField.getText());
				lists.add("��");
				cout++;
				inputField.setText("");
			}
		});
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(inputField.getText());
				lists.add("��");
				cout++;
				inputField.setText("");
			}
		});
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.add(inputField.getText()); // �����ť=ʱ���Ѵ��±༭����ʾ�����ݴ���list
				inputField.setText(Operator(lists.get(cout - 1)));// ������õ��Ľ������list����Ϊ��һ������������ǰһ����
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputField.setText("");
				list.clear(); // ��list��lists���ϱ������һ������ĸ�Ҫ�����
				lists.clear();
				cout = 0; // ��cout��ֵ��ԭ
			}
		});
		this.add(panel);
		this.setTitle("������");
		this.setSize(185, 205);
		this.setLayout(new FlowLayout());
		this.setVisible(true); // GUI����
	}

	public String Operator(String str) {
		Double result = 0.0;
		Double a = Double.parseDouble(list.get(2 * cout - 2));// ��list�м�¼�ĵ�һ�������ǰһ������ת��ΪDouble����
		Double b = Double.parseDouble(list.get(2 * cout - 1));// ��list�м�¼�ĵ�һ���������һ������ת��ΪDouble����
		switch (str) { // cout��ʾ�ڼ����ַ�
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "��":
			result = a * b;
			break;
		case "��":
			result = a / b;
			break;
		}
		String res = String.valueOf(result);
		return res; // ͨ��switch���õ���������֮��ķ���ֵ��ת��ΪString����
	}
}