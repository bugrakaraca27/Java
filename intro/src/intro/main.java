package intro;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String ortaMetin="İlginizi Çekebilir";
		String altMetin="Vade süresi";		
				
		System.out.println(ortaMetin);
		
		int vade=12;
		
		double dolarDun=18.10;
		double dolarBugun=18.20;
		
		String okYonu="";
		
	    if (dolarDun>dolarBugun) {
			okYonu="down.svg";
			System.out.println(okYonu);
	    }
	    else if(dolarDun<dolarBugun) {
			okYonu="up.svg";
			System.out.println(okYonu);

	    }
	    else {
			okYonu="equal.svg";
			System.out.println(okYonu);

		}
	    
	    String[] krediler= {"Hızlı kredi","Halkbanktan maaş alanlar","Emekli"};
	    
	    for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
