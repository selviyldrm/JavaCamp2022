package kodlamaioDemo.dataAccess.jdbc;

import kodlamaioDemo.dataAccess.IInstructorDao;
import kodlamaioDemo.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println(instructor.getLastName()+ " Jdbc ile veritabanına eklendi");
		
	}

}
