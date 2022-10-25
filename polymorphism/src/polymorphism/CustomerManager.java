package polymorphism;

public class CustomerManager {
	private BaseLogger logger;
	private BaseLogger müsteriBilgisi;
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
		this.müsteriBilgisi = logger;
	}
	public void add() {
		System.out.println("müşteri eklendi.");
		this.logger.log("log mesajı");
		// Log komutu BaseLogger içindeki mesaj yollama komutu.
		this.müsteriBilgisi.log("müşteri bilgisi loglandı.");
	}
}
