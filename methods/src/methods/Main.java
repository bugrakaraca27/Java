package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 3, 4, 5, 7 };

		Scanner scan = new Scanner(System.in);

		System.out.println("Aradığınız sayıyı giriniz :");
		int aranacak = scan.nextInt();

		boolean varMi = false;

		for (int arama : sayilar) {
			if (arama == aranacak) {
				varMi = true;
				break;
			}

		}

		if (varMi) {
			mesajVer("Sayı bulundu." + aranacak);
		} else {
			mesajVer("Sayı bulunamadı." + aranacak);
		}		

	}

	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);	

	}

}
