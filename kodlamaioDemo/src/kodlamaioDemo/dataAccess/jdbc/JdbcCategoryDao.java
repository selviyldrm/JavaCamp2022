package kodlamaioDemo.dataAccess.jdbc;

import kodlamaioDemo.dataAccess.ICategoryDao;
import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println(category.getCategoryName()+" jdbc ile veritabanına eklendi");
		
	}

}
