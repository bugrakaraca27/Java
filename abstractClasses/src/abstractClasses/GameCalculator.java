package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();//hesaplamayı override etmek zorunda.
	public final void gameOver() {//değişmeyecek bir kural
		System.out.println("oyun bitti.");
	}

}
