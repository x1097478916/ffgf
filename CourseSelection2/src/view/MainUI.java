package view;

import java.util.Scanner;
import entity.*;
public class MainUI {
	public static Student user;
	public static void show() {
		System.out.println("请输入操作：");
		System.out.println("1-注册；2-修改密码；3-选课；4-登录；5-显示选课信息0-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			RegisterUI.show();
			break;
		case "2":
			ModifyPasswordUI.show();
			break;
		case "3":
			CourseSelection2UI.show();
			break;
		case "4":
			LoginUI.show();
		case "5":
			
			CourseSelection3UI.show();
		}
	}
}
