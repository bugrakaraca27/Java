import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 3, 4, 5, 7 };

		Scanner scan = new Scanner(System.in);

		System.out.println("Aradığınız sayıyı giriniz :");
		int aranacak = scan.nextInt();

		boolean varMi = false;

		for (int arama : sayilar) {
			if (arama==aranacak) {
				varMi = true;

			}

		}

		if (varMi) {
			System.out.println("Sayı bulundu.");
		} else {
			System.out.println("Sayı bulunamadı.");
		}

	}

}
