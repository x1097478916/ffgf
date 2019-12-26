package view;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import dao.*;
import entity.*;
public class MainUI {
	public static Student user=null;
	public static void show() throws Exception {
		System.out.println("�����������");
		System.out.println("1-ע�᣻2-�޸����룻3-ѡ�Σ�4-��¼��5-��ʾѡ����Ϣ��6-��ѡ��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			RegisterUI.show();
			break;
		case "2":
			if(user==null) {
				System.out.println("���ȵ�¼");
				MainUI.show();
			}
			ModifyPasswordUI.show();
			break;
		case "3":
			if(user==null) {
				System.out.println("���ȵ�¼");
				MainUI.show();
			}
			CourseSelection2UI.show();
			break;
		case "4":
			LoginUI.show();
			break;
		case "5":
			if(user==null) {
				System.out.println("���ȵ�¼");
				MainUI.show();
			}
			CourseSelection3UI.show();
			break;
		case "6":
			if(user==null) {
				System.out.println("���ȵ�¼");
				MainUI.show();
			}
			DropOutCourseUI.show();
			break;
			case "0":
				FileOutputStream fos=new FileOutputStream("CourseDao.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(CourseDao.getInstance());

				FileOutputStream fos2=new FileOutputStream("SCDao.txt");
				ObjectOutputStream oos2=new ObjectOutputStream(fos2);
				oos2.writeObject(SCDao.getInstance());
				
				FileOutputStream fos3=new FileOutputStream("StudentDao.txt");
				ObjectOutputStream oos3=new ObjectOutputStream(fos3);
				oos3.writeObject(StudentDao.getInstance());
		    break;
		}
	
	}
}
