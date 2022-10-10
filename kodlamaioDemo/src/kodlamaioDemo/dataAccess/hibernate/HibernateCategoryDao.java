package kodlamaioDemo.dataAccess.hibernate;

import kodlamaioDemo.dataAccess.ICategoryDao;
import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println(category.getCategoryName()+" Hibernate ile veritabınına eklendi");
		
	}

	
	
}
