package kodlamaioDemo.dataAccess.hibernate;

import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		
		System.out.println(course.getCourseName()+ " Hibernate ile veritabanına eklendi");
		
	}

}
