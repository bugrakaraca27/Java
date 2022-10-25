package overriding;

public class BaseKrediManager {
	public /*final*/double hesapla(double tutar) { //final yazdığımızda overriding olmaz demek.
		return tutar*1.18;
	}
}
