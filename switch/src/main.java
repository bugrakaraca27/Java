
public class main {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel");
			break;
		case 'B':
		case 'C':
			System.out.println("Geçtiniz");
			break;
		case 'D':
			System.out.println("Kaldınız");
			break;

		default:
			System.out.println("Geçersiz Not Girdiniz");

		}

	}

}
