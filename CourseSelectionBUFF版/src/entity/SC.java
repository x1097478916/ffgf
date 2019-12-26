package entity;
import java.util.HashMap;
import java.io.Serializable;
public class SC implements IEntity,Serializable {
	private String studentNo;
	private HashMap courseNoGrade=new HashMap();
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public double getCourseGrade(String courseNo) {
		return (double)courseNoGrade.get(courseNo);
	}
	public void reSetCourseGrade(String courseNo,double grade) {
		courseNoGrade.put(courseNo, grade);
	}
	public boolean isCourseHere(String courseNo) {
		return courseNoGrade.containsKey(courseNo);
	}
	public void addone(String courseNo,double grade) {
		courseNoGrade.put(courseNo, grade);
	}
	public void remove(String courseNo) {
		courseNoGrade.remove(courseNo);
	}
	public HashMap getcourseNoGrade() {
		return courseNoGrade;
	}
	public boolean isEmpty() {
		return courseNoGrade.isEmpty();
	}
}
