package kursDemo.business;

import java.util.ArrayList;

import kursDemo.dataAccess.CourseDao.ICourseDao;
import kursDemo.entities.Course;
import kursDemo.logging.ILogger;

public class CourseManager {
	private ICourseDao courseDao;
	private ILogger[] loggers;
	private ArrayList<Course> courses = new ArrayList<Course>();

	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		for (Course courseList : courses) {
			if (courseList.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi zaten var.");
			}
		}
		if(course.getPrice()<0){
			throw new Exception("Kursun ücreti olmak zorunda.");
		}
		
		courseDao.add(course);
		courses.add(course);

		for (ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
