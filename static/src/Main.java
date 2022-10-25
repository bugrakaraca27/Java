
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "fare";
		manager.add(product);

		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();//inner class

	}
	// statikler class isimleriyle çağrılır ve çağrıldığı anda bellekte oluşturulur
}
