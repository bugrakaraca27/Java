package kursDemo.dataAccess.CategoryDao;

import kursDemo.entities.Category;

public class CategoryJdbcDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi." + category);
	}

}
