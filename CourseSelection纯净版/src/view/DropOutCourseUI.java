package view;

import java.util.Scanner;

import biz.SCBiz;

public class DropOutCourseUI {
	public static void show()throws Exception {
		SCBiz sb=new SCBiz();
		sb.show2();
		System.out.println("请输入下一步操作：1-退选；2-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		while(option.equals("1")) {
			System.out.println("请输入退选课程号：");
			String courseid = scanner.nextLine();
			if(!sb.check(courseid)) {
				System.out.println("您未选该课程，退选失败");
			}
			else {
				sb.dropOutCourse(courseid);
				System.out.println("退选成功");
				sb.show2();
			}
			System.out.println("请输入下一步操作：1-退选；2-退出");
			 option = scanner.nextLine();
		}
		MainUI.show();
		
	}
}
