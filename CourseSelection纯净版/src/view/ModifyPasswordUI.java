package view;

import java.util.Scanner;

import biz.StudentBiz;

public class ModifyPasswordUI {
	public static void show()throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入旧密码：");
		String oldPassword = scanner.nextLine();
		System.out.println("请输入新密码：");
		String newPassword = scanner.nextLine();
		System.out.println("请再次输入新密码：");
		String newPassword2 = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.modifyPassword(oldPassword,newPassword,newPassword2);
	}
}
