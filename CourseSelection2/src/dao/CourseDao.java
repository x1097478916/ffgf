package dao;
import entity.IEntity;
import entity.Student;
import entity.Course;

import java.util.HashMap;

public class CourseDao implements IDao {
	private static CourseDao instance;
	private HashMap courses;
	
	private CourseDao() {
		courses = new HashMap();
		Course course1 = new Course();
		course1.setCourseNo("0001");
		course1.setCourseName("大数据技术");
		course1.setCourseGrade(2);
		courses.put(course1.getCourseNo(), course1);
		
		Course course2 = new Course();
		course2.setCourseNo("0002");
		course2.setCourseName("高等数学");
		course2.setCourseGrade(3);
		courses.put(course2.getCourseNo(), course2);
		
		Course course3 = new Course();
		course3.setCourseNo("0003");
		course3.setCourseName("大学英语");
		course3.setCourseGrade(3);
		courses.put(course3.getCourseNo(), course3);
		
	}
	public static CourseDao getInstance() {
		if(instance == null) {
			synchronized(CourseDao.class) {
				if(instance == null) {
					instance = new CourseDao();
					return instance;
				}
			}
		}
		return instance;
	}
	
	public void insert(IEntity entity)  {
		
		Course st = (Course)entity;
		courses.put(st.getCourseNo(), st);
	}

	
	public void delete(String id) {
		courses.remove(id);// TODO Auto-generated method stub

	}

	@Override
	public void update(IEntity entity) {
		Course st = (Course)entity;
		courses.put(st.getCourseNo(), st);// TODO Auto-generated method stub

	}

	@Override
	public HashMap getAllEntities() {
		// TODO Auto-generated method stub
		return courses;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub		
		return (IEntity)courses.get(Id);
	}

}

	
	


