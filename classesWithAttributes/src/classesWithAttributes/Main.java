package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(1);
		product.setName("Laptop"); 
		product.setDescription("asus laptop");
		product.setPrice(4000);
		product.setStockAmount(5);
		
		
		ProductManager productManager = new ProductManager(); //veritabanına ekleme kodu.!!!!!
		productManager.Add(product);	
		
		System.out.println(product.getCode());
		
	}

}
