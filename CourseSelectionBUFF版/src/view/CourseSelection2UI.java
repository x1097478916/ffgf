package view;
import java.util.Scanner;

import biz.*;
public class CourseSelection2UI {
	public static void show() throws Exception{
		CourseBiz cs=new CourseBiz();
		SCBiz sb=new SCBiz();
		System.out.println("课程列表：");
		cs.show();
		System.out.println("请输入下一步操作：1-选课；2-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		while(option.equals("1")) {
			System.out.println("请输入所选课程号：");
			String courseid = scanner.nextLine();
			sb.add(courseid);
			System.out.println("请输入下一步操作：1-选课；2-退出");
			 option = scanner.nextLine();
		}
		MainUI.show();
		
		
		
}
}