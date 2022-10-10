package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.IInstructorDao;
import kodlamaioDemo.entities.Instructor;

public class InstructorManager {

	private IInstructorDao instructorDao;
	private Logger[]  loggers;

	public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers=loggers;
	}
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
		logger.log(instructor.getFirstName());
	}
	}
	

}
