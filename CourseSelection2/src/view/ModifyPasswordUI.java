package view;

import java.util.Scanner;

import biz.StudentBiz;

public class ModifyPasswordUI {
	public static void show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������룺");
		String newPassword = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.modifyPassword(newPassword);
	}
}
