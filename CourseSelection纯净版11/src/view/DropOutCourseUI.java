package view;

import java.util.Scanner;

import biz.SCBiz;

public class DropOutCourseUI {
	public static void show()throws Exception {
		SCBiz sb=new SCBiz();
		sb.show2();
		System.out.println("��������һ��������1-��ѡ��2-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		while(option.equals("1")) {
			System.out.println("��������ѡ�γ̺ţ�");
			String courseid = scanner.nextLine();
			if(!sb.check(courseid)) {
				System.out.println("��δѡ�ÿγ̣���ѡʧ��");
			}
			else {
				sb.dropOutCourse(courseid);
				System.out.println("��ѡ�ɹ�");
				sb.show2();
			}
			System.out.println("��������һ��������1-��ѡ��2-�˳�");
			 option = scanner.nextLine();
		}
		MainUI.show();
		
	}
}
