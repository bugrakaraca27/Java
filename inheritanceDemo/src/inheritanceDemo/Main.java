package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager()); // ogretmenkredimanager yerine tarım asker de yazılabilir.(((polimorfizm)))
		krediUI.KrediHesapla(new TarımKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
