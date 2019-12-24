package biz;
import java.util.*;

import dao.*;
import entity.*;
public class CourseBiz {
	public void show() {
		CourseDao courseDao = CourseDao.getInstance();
		HashMap courses=courseDao.getAllEntities();
		Set courses2=courses.entrySet();
		Iterator it=courses2.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry=(Map.Entry)it.next();
			String coursename=((Course)entry.getValue()).getCourseName();
			System.out.println("¿ÎºÅ£º"+entry.getKey()+"¿Î³ÌÃû£º"+coursename);
		}
	}
}
