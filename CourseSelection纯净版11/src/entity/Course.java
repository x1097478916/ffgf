package entity;
import java.io.*;
public class Course implements IEntity,Serializable {
	private String courseNo;
	private String courseName;
	private double courseGrade;
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(int courseGrade) {
		this.courseGrade = courseGrade;
	}
}
