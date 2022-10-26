package kursDemo.business;

import java.util.ArrayList;

import kursDemo.dataAccess.CategoryDao.ICategoryDao;
import kursDemo.entities.Category;
import kursDemo.logging.ILogger;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private ArrayList<Category> categories = new ArrayList<Category>();


	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	public void add(Category category) throws Exception{
		for(Category categoryList : categories) {
			if(categoryList.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi zaten var.");
			}
		}
		categoryDao.add(category);
		categories.add(category);
		for(ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
