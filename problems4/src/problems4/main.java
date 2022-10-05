package problems4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// fiyat al kdv üzerinden hesapla.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ürünün fiyatını giriniz.");
		
		int fiyat = scan.nextInt();
			 
		double sonFiyat = 118*fiyat/100;
		
		System.out.println("Ürünün kdvli fiyatı : " + sonFiyat);

		
		
		
		
		
		
		

	}

}
