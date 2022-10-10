package kodlamaioDemo.dataAccess.jdbc;

import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		
		System.out.println(course.getCourseName()+ " Jdbc ile veritabanına eklendi");
	}

}
