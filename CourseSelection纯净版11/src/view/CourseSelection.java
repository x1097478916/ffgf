package view;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import dao.CourseDao;
import dao.SCDao;
import dao.StudentDao;
import entity.Student;

public class CourseSelection {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("StudentDao.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		StudentDao s =(StudentDao)ois.readObject();
		
		FileInputStream fis1=new FileInputStream("CourseDao.txt");
		ObjectInputStream ois1=new ObjectInputStream(fis1);
		CourseDao cou=(CourseDao)ois1.readObject();
		
		FileInputStream fis2=new FileInputStream("SCDao.txt");
		ObjectInputStream ois2=new ObjectInputStream(fis2);
		SCDao sc=(SCDao)ois2.readObject();
		
		System.out.println("\t欢迎进入学生选课系统！");
		MainUI.show();

	
	}

}
