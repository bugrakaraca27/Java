package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void Add(Product product) {
	//sadece db erişim kodları buraya yazılır... SQL
		System.out.println("jdbc ile veritabanına eklendi.");
	
	}
	
}
