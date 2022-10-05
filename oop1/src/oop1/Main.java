package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("A Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Simogi Kahve Makinesi");
		product2.setDiscount(2);
		product2.setUnitPrice(5500);
		product2.setUnitsInStock(32);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Depres Kahve Makinesi");
		product3.setDiscount(10);
		product3.setUnitPrice(600);
		product3.setUnitsInStock(2);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();

		individualCustomer.setId(1);
		individualCustomer.setPhone("05446589845");
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setFirstName("Buğrahan");
		individualCustomer.setSecondName("Karaca");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("12345");
		corporateCustomer.setPhone("05452658789");
		corporateCustomer.setCompanyName("Karaca Software");
		corporateCustomer.setTaxNumber("2522648");

		Customer[] customers = {individualCustomer,corporateCustomer};
		//customer array yaptık-individual ve corporate ekledik.
		
		
	}

}
