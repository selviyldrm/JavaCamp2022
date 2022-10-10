package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.ICategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private List<Category> categories;
	private Logger[]  loggers;
	

	public CategoryManager(ICategoryDao categoryDao, List<Category> categories, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		for(Category category2:categories) {
			if(category2.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi aynı olamaz"); 
			}
		}
		categoryDao.add(category);
		categories.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}
}
