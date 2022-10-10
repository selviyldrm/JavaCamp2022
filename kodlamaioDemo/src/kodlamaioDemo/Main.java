package kodlamaioDemo;



import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.core.logging.MailLogger;
import kodlamaioDemo.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.hibernate.HibernateCourseDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcCourseDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcInstructorDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] logger=new Logger[] {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		Category category1=new Category();
		category1.setId(1);
		category1.setCategoryName("Web Geliştirme");
		category1.setCategoryDescription("Web Geliştirme,Masaüstü Uygulamaları");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setCategoryName("Programlama ");
		category2.setCategoryDescription("Oyun geliştirme,Mobil Uygulama");
		
		List<Category> categoryList=new ArrayList<>();
		
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(), categoryList, logger);
		categoryManager.add(category1);
	    categoryManager.add(category2);
	    
	    System.out.println("-------------------------");
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("Java");
		course1.setCoursePrice(150);
		Course course2 = new Course();
		course2.setId(2);
		course2.setCourseName("C#");
		course2.setCoursePrice(120);

		List<Course> courseList = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courseList, logger);
		courseManager.add(course1);
		courseManager.add(course2);
		 System.out.println("-------------------------");
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInstructorSalary(9000);
		
		;
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(), logger);
		instructorManager.add(instructor);
	}

}
