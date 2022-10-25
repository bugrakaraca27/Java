package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void Add(Product product) {
		// sadece db erişim kodları buraya yazılır... SQL
		System.out.println("hibernate ile veritabanına eklendi.");
	}
}