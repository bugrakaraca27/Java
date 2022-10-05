package arrays;

public class main {

	public static void main(String[] args) {

		String[]ogrenciler=new String[3];
		
		ogrenciler[0]="Buğra";
		ogrenciler[1]="Karaca";
		ogrenciler[2]="Java";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) {// 
			System.out.println(ogrenci);
		}
	}

}
