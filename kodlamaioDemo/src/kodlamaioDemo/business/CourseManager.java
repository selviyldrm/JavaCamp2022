package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {

	private ICourseDao  iCourseDao;
	private List<Course> courses;
	private Logger[]  loggers;
	
	
	public CourseManager(ICourseDao iCourseDao, List<Course> courses, Logger[] loggers) {
		super();
		this.iCourseDao = iCourseDao;
		this.courses = courses;
		this.loggers = loggers;
	}


	public void add(Course course) throws Exception{
		
		for(Course course2:courses) {
			if(course2.getCourseName().equals(course.getCourseName())){
				throw new Exception ("kurs ismi aynı olamaz");
		}
		
		if(course.getCoursePrice()<0) {
			throw new Exception ("Kurs fiyatı 0'dan küçük olamaz");
		}
	}
	iCourseDao.add(course);
	courses.add(course);
	
	for (Logger logger : loggers) {
		logger.log(course.getCourseName());
	}

}
}