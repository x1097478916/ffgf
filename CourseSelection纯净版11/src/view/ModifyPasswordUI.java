package view;

import java.util.Scanner;

import biz.StudentBiz;

public class ModifyPasswordUI {
	public static void show()throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������룺");
		String oldPassword = scanner.nextLine();
		System.out.println("�����������룺");
		String newPassword = scanner.nextLine();
		System.out.println("���ٴ����������룺");
		String newPassword2 = scanner.nextLine();
		StudentBiz sc = new StudentBiz();
		sc.modifyPassword(oldPassword,newPassword,newPassword2);
	}
}
