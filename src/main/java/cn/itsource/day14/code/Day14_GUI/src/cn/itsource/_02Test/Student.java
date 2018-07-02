package cn.itsource.day14.code.Day14_GUI.src.cn.itsource._02Test;


import java.util.Arrays;
/*
 * 	��ݼ� ��ϰʹ��
 * 		a.������ʾ��     Alt+/ 
		b.���ƴ��룺     ctrl+alt+����������£�
		c.����ע��
			a)����ע�ͼ�ȡ��ע�ͣ�    ctrl+/
			b)����ע��:ctrl+shift+/(��б��) ȡ������ע��: ctrl+shift+\(��б��)
			c)�ĵ�ע�ͣ�alt+shift+j��
		d.���������ɾ��:ctrl+shift+o:�������ð�ɾ�����ð�
		e.�����ctrl+D
		f.���ϲ���һ�У�ctrl+shift+�س�
		g.���²���һ�п�ݼ���shift+�س�
		h.��ʽ�����룺��ݼ���ctrl+shift+f (���Ƽ�ʹ��)
		i.���ٲ鿴������ctrl+o[��ǰ��ṹ��,ʹ�ÿ�ݼ�,�鿴��ǰ��Ľṹ]
		j.����������Ctrl+��굥�����
		k.���ط�����alt+�����  ����
		l.ctrl+1�������ɱ���
		alt+shift+a,����д����
		ѡ������ƶ�:alt+�����
		ѡ�����:shift+�����
		
		getset������ݼ�����
 * 
 * */
public class Student {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
}
