
public class ProductValidator {
//ürünü kaydederken güncellerken kurallara uygun olup olmadığını bulmak için yapılır.
	static {
		System.out.println("statik yapıcı blok çalıştı");
	}

	public ProductValidator() {
		System.out.println("yapıcı blok çalıştı");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
}
