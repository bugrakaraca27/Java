package conditionals;

public class main {

	public static void main(String[] args) {

		int sayi = 21;
		
		if (sayi<20) {
			System.out.println("Sayı 20'den küçüktür.");
		}
		else if(sayi==20) { //tek eşittir sayıya değer atar.
			System.out.println("Sayı 20'ye eşittir.");
		}
		else {
			System.out.println("Sayı 20'den büyüktür.");
		}
	}

}
