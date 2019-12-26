package biz;

import dao.SCDao;
import dao.StudentDao;
import entity.IEntity;
import entity.Student;
import entity.SC;
import view.MainUI;

public class StudentBiz {
	StudentDao studentDao;
	SCDao sCDao;
	private Student student;
	//��¼
	public void login(String studentNo, String studentPassword)throws Exception {

		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("�û�������");
			MainUI.show();
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("��¼�ɹ�");
			MainUI.user=student;
			MainUI.show();
		} else {
			System.out.println("���벻��ȷ");
			MainUI.show();
		}

	}
	//ע�ᣬҵ���߼�ʵ��
	public void register(String studentNo, 
						String studentName, 
						String studentGender, 
						int studentAge, 
						String studentDepartment, 
						String firstPassword, 
						String secondPassword)throws Exception {
		if(firstPassword.equals(secondPassword)) {
			student = new Student();
			student.setStudentNo(studentNo);
			student.setStudentName(studentName);
			student.setStudentAge(studentAge);
			student.setStudentDepartment(studentDepartment);
			student.setStudentPassword(firstPassword);
			studentDao = StudentDao.getInstance();
			studentDao.insert(student);
			SC sc=new SC();
			sc.setStudentNo(studentNo);
			sCDao=SCDao.getInstance();
			sCDao.insert(sc);
			System.out.println("ע��ɹ���");
			MainUI.show();
		}else {
			
		}
	}
	public void modifyPassword(String oldPassword,String newPassword,String newPassword2)throws Exception {
		this.student=MainUI.user;
		if (student.getStudentPassword().equals(oldPassword)) {

			if( newPassword.equals(newPassword2)) {
				MainUI.user.setStudentPassword(newPassword);
				System.out.println("�޸ĳɹ���");
				MainUI.show();
			}
			else {
				System.out.println("�����벻һ�£�δ���޸�");
				MainUI.show();
			}
		}
		else {
			System.out.println("���������δ���޸ġ�");
			MainUI.show();
		}
		
	}
}
