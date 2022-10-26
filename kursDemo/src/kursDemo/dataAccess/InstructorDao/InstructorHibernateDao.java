package kursDemo.dataAccess.InstructorDao;

import kursDemo.entities.Instructor;

public class InstructorHibernateDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("veritabanına hibernate ile eklendi " + instructor);		
	}

}
