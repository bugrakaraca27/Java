package kursDemo.dataAccess.CategoryDao;

import kursDemo.entities.Category;

public class CategoryHibernateDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("hibernate ile veritabanına eklendi . " + category);
	}

}
