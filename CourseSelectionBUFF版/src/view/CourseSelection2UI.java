package view;
import java.util.Scanner;

import biz.*;
public class CourseSelection2UI {
	public static void show() throws Exception{
		CourseBiz cs=new CourseBiz();
		SCBiz sb=new SCBiz();
		System.out.println("�γ��б�");
		cs.show();
		System.out.println("��������һ��������1-ѡ�Σ�2-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		while(option.equals("1")) {
			System.out.println("��������ѡ�γ̺ţ�");
			String courseid = scanner.nextLine();
			sb.add(courseid);
			System.out.println("��������һ��������1-ѡ�Σ�2-�˳�");
			 option = scanner.nextLine();
		}
		MainUI.show();
		
		
		
}
}