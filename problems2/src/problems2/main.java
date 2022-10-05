package problems2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// dikdörtgen uzun kenar kısa kenar al alan çevre bul.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kısa kenar giriniz :");
		int kısaKenar = scan.nextInt();
		
		
		System.out.println("Uzun kenar giriniz.");
		int uzunKenar = scan.nextInt();
		
		int cevre = (kısaKenar+uzunKenar)*2;
		int alan =uzunKenar*kısaKenar;
		
		System.out.println("Çevresi :" + cevre );
		System.out.println("Alanı :" + alan);
		
		
		
		
	}

}
