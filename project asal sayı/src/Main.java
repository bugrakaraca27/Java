import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz :");
		
		int number = scan.nextInt();
		
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Asal sayı değildir.");
			return;
		}
		
		if(number<1){
			System.out.println("Geçersiz bir değer.");
		}
		
		for (int i = 2; i < number; i++) {
			
			if(number%i==0) {
				isPrime=false;
				
			}
			
		}
		
		if(isPrime) {
			System.out.println("Sayı asaldır.");
		}
		else {
			System.out.println("Sayı asal değildir.");
		}
		
		
		
		
	}

}
