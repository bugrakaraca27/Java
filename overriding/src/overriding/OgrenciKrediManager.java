package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar*1.10;
	}//operasyonumuzu ezmiş olduk overriding ile.
	//aksini belirtmediğimiz halinde overridable(üzerine yazılabilir)
	
}
