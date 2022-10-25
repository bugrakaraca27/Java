package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator[] calculators = new GameCalculator[] 
				{new ManGameCalculator(),new WomanGameCalculator(),new KidsGameCalculator(),new OlderGameCalculator()};
	for(GameCalculator calculator : calculators) {
		calculator.hesapla();
		calculator.gameOver();
	}
	
	
	
	}

}
