package cn.itsource.day16.code.Day16.src.cn.itsource._21DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	/*
	 * SimpleDateFormat
	 * 		��ʽ����Ҳ�������� -> �ı�)
	 * 		�������ı�-> ���ڣ�
	 * 
	 * 
	 * */
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat();//����һ��Ĭ�ϸ�ʽ
		String format = sdf.format(date);
		System.out.println(format);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss E");
		String format2 = sdf2.format(date);
		System.out.println(format2);
		
		String dat = "2018-07-01 15:37:37 ������";
		Date parse = sdf2.parse(dat);
		System.out.println(parse);
		
		/*
		 * ע������:
		 * 		1.�����ַ�������С�ڸ�ʽ����ʽ����,���ܽ���
		 * 		2.�����ַ������ȴ��ڸ�ʱ��,�ܹ�����
		 * 		3.�����ַ����������ʽ����Ӧ
		 * 
		 * */
		/*String dat1 = "2018-07-01";
		Date parse1 = sdf2.parse(dat1);
		System.out.println(parse1);*/
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy��MM��dd��");
		String dat2 = "2018��07��01�� 15:37:37 ������";//ע��:���ı��ļ����Ƶ��ַ���,�������ر���,���ܽ�������
		Date parse2 = sdf3.parse(dat2);
		System.out.println(parse2);

	}

}
