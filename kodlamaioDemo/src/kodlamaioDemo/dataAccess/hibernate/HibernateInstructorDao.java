package kodlamaioDemo.dataAccess.hibernate;

import kodlamaioDemo.dataAccess.IInstructorDao;
import kodlamaioDemo.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+ " Hibernate ile veritabanına eklendi");
		
	}

}
