package kursDemo.dataAccess.CourseDao;

import kursDemo.entities.Course;

public class CourseHibernateDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("hibarnate ile veritabanına eklendi" + course);
	}

}
