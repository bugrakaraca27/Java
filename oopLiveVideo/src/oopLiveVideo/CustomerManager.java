package oopLiveVideo;

public class CustomerManager {
	private Customer _customer; //müşteri
	private ICreditManager _creditManager;
	private ICreditManager _creditManager2;
	
	public CustomerManager(Customer customer,ICreditManager creditManager,ICreditManager creditManager2) {//constructor
		_customer = customer;
		_creditManager = creditManager;
		_creditManager2 = creditManager2;
		
	}
	public void Save() {
		System.out.println("müşteri kaydedildi." + _customer.firstName);
	}
	public void Delete() {
		System.out.println("müşteri silindi." + _customer.firstName);
	}
	public void GiveCredit() {
		_creditManager.Calculate();
		_creditManager2.Calculate();
	}
}
