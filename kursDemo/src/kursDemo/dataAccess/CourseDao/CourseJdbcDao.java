package kursDemo.dataAccess.CourseDao;

import kursDemo.entities.Course;

public class CourseJdbcDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("veritabanına jdbc ile eklendi." + course);
	}

}
