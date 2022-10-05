import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz.");

		int number = scan.nextInt();
		int total = 0;
		
		
		if(number==0) {
			System.out.println("Geçersiz değer.");
			return;
		}
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;

			}
		}

		if (total == number) {
			System.out.println("Mükemmel bir sayıdır.");
		} else {
			System.out.println("Mükemmel bir sayı değildir.");
		}
	}

}
