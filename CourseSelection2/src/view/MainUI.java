package view;

import java.util.Scanner;
import entity.*;
public class MainUI {
	public static Student user;
	public static void show() {
		System.out.println("�����������");
		System.out.println("1-ע�᣻2-�޸����룻3-ѡ�Σ�4-��¼��5-��ʾѡ����Ϣ0-�˳�");
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
