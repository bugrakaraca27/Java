package kursDemo.dataAccess.InstructorDao;

import kursDemo.entities.Instructor;

public class InstructorJdbcDao implements IInstructorDao {
	public void add(Instructor instructor) {
		System.out.println("veritabanına jdbc ile eklendi " + instructor);
	}
}
