package kursDemo.business;

import kursDemo.dataAccess.InstructorDao.IInstructorDao;
import kursDemo.entities.Instructor;
import kursDemo.logging.ILogger;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private ILogger[] loggers;

	public InstructorManager(IInstructorDao instructorDao,ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for(ILogger logger : loggers) {
			logger.log(instructor.getInstructorFirstName()+instructor.getInstructorLastName());
		}
	}
}
