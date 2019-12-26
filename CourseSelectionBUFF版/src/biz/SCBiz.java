package biz;
import java.util.*;

import dao.CourseDao;
import dao.SCDao;
import entity.*;
import view.MainUI;
public class SCBiz {
public void add(String courseid ) {
	SCDao scs= SCDao.getInstance();
	SC sc=(SC)scs.getEntity(MainUI.user.getStudentNo());
	CourseDao cd=CourseDao.getInstance();
	if(sc.isCourseHere(courseid)){
		System.out.println("ѡ��ʧ�ܣ��γ���ѡ");
	}
	else if(!cd.isHere(courseid)) {
		System.out.println("ѡ��ʧ��,�޸ÿγ�");
	}
	else {
	sc.addone(courseid, 0);
	System.out.println("ѡ�γɹ�");
	}
	
}
public void show()throws Exception {
	CourseDao csd=CourseDao .getInstance();
	SCDao scs= SCDao.getInstance();
	SC sc=(SC)scs.getEntity(MainUI.user.getStudentNo());
	if(sc.isEmpty()) {
		 System.out.println("����δѡ��");
		 MainUI.show();
	}
	else {
     Set courseNoGradeSet=sc.getcourseNoGrade().entrySet();
     Iterator it=courseNoGradeSet.iterator();
     System.out.println("����ѡ��ѡ����Ϣ���£�");
     while(it.hasNext()) {
    	 Map.Entry entry=(Map.Entry)it.next();
    	 String courseNo=(String)entry.getKey();
    	 double courseGrade=(double)entry.getValue();
    	 Course course=(Course)csd.getEntity(courseNo);
    	 String courseName=course.getCourseName();
    	 System.out.println("�κţ�"+courseNo+" �γ����ƣ�"+courseName+" �ɼ���"+courseGrade);
     }
     MainUI.show();
     }
}
public void show2() {
	CourseDao csd=CourseDao .getInstance();
	SCDao scs= SCDao.getInstance();
	SC sc=(SC)scs.getEntity(MainUI.user.getStudentNo());
     Set courseNoGradeSet=sc.getcourseNoGrade().entrySet();
     Iterator it=courseNoGradeSet.iterator();
     System.out.println("����ѡ��ѡ����Ϣ���£�");
     while(it.hasNext()) {
    	 Map.Entry entry=(Map.Entry)it.next();
    	 String courseNo=(String)entry.getKey();
    	 double courseGrade=(double)entry.getValue();
    	 Course course=(Course)csd.getEntity(courseNo);
    	 String courseName=course.getCourseName();
    	 System.out.println("�κţ�"+courseNo+" �γ����ƣ�"+courseName+" �ɼ���"+courseGrade);
     }
    
}
public boolean check(String courseNo) {

	SCDao scs= SCDao.getInstance();
	SC sc=(SC)scs.getEntity(MainUI.user.getStudentNo());
	return sc.isCourseHere(courseNo);
}
public void dropOutCourse(String courseNo ) {
	SCDao scs= SCDao.getInstance();
	SC sc=(SC)scs.getEntity(MainUI.user.getStudentNo());
	sc.remove(courseNo);
	
}
}
