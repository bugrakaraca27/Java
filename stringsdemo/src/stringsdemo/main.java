package stringsdemo;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";

		System.out.println(mesaj);
		System.out.println("Beşinci harf " + mesaj.charAt(4)); // charAt
		System.out.println("Eleman sayısı " + mesaj.length());

		System.out.println(mesaj.concat(" Yaşasın")); // concat

		System.out.println(mesaj.startsWith("B")); // b ile mi başlıyor sorusu

		System.out.println(mesaj.endsWith(".")); // . ile mi bitiyor ?

		char[] karakterler = new char[8];

		mesaj.getChars(0, 8, karakterler, 0); // karakterleri getirip dizilere atıyor.

		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a')); // seçili karakterin baştan başlayıp kaçıncı olduğunu.

		System.out.println(mesaj.lastIndexOf('e')); // seçili karakterin sondan başlayıp kaçıncı olduğunu söyler.

		String yenimesaj = mesaj.replace(' ', '-'); // ilk karakter yerine yeni karakteri koyar.

		System.out.println(yenimesaj);

		System.out.println(yenimesaj.substring(2, 5)); // rakamlar arasını al ya da sonrasını.

		for (String kelime : mesaj.split(" ")) { // karakteri gördüğünde ayırır. for döngüsüyle yeniden başa alır.

			System.out.println(kelime);

		}

		System.out.println(mesaj.toLowerCase()); // lowercase küçük harf yapar hepsini.
		System.out.println(mesaj.toUpperCase()); //
		// veritabanları büyük küçük harf duyarlıysa datalar için yapılır.

		System.out.println(mesaj.trim()); // baştaki ve sondaki boşlukları atar.

	}

}
