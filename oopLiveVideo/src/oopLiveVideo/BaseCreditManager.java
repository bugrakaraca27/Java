package oopLiveVideo;

public abstract class BaseCreditManager implements ICreditManager{
	 public abstract void Calculate(); //abstract classlar ortak operasyonları tutar.
	 //hepsinde farklı olduğu için imza olarak bıraktık.
	 
	 public void Save() { //hepsinde aynı olduğu için doldurduk.
		 System.out.println("Kaydedildi.");
	 }
}
