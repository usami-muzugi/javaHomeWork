package cn.itsource.day15.code.Day15.src.cn.itsource._06menu;

import java.awt.FileDialog;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TestMenu {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("�߼����±�");
		//׼���˵���ϸ
		Menu menuItem1 = new Menu("new File");//Ӧ�����Ӳ˵�
		MenuItem menuItem2 = new MenuItem("open File");
		MenuItem menuItem3 = new MenuItem("save File");
		MenuItem menuItem4 = new MenuItem("save as");
		MenuItem menuItem5 = new MenuItem("exit");
		
		//��menuItem4����¼����������Ի�����
		menuItem4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//��һ���Ի�����
				FileDialog fileDialog = new FileDialog(jFrame);//�������Frame
				fileDialog.setVisible(true);
				System.out.println("����>..................");
			}
		});
		menuItem5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				jFrame.dispose();
				
			}
		});
		//ΪmenuItem1�˵�׼���˵���ϸ
		MenuItem i1 = new MenuItem("java File");
		MenuItem i2 = new MenuItem("PHP File");
		MenuItem i3 = new MenuItem("HTML File");
		
		//���˵���ϸ��ӵ�menuItem1
		menuItem1.add(i1);
		menuItem1.add(i2);
		menuItem1.add(i3);
		
		//׼���˵�
		Menu menu1 = new Menu("File");
		Menu menu2 = new Menu("Edit");
		Menu menu3 = new Menu("Source");
		Menu menu4 = new Menu("Format");
		Menu menu5 = new Menu("help");
		
		//���˵���ϸ��ӵ��˵���
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.add(menuItem3);
		menu1.add(menuItem4);
		menu1.add(menuItem5);
		
		//׼���˵���
		MenuBar menuBar = new MenuBar();
		
		//�˵���װ�˵���ϸ
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		menuBar.add(menu5);
		
		//���˵���װ�붥�㴰��
		jFrame.setMenuBar(menuBar);
		
		
		//׼�������ı���
		TextArea textArea = new TextArea();
		jFrame.add(textArea);
		

		jFrame.setSize(500, 500);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}

}
