package oopLiveVideo;

public class Customer {
	Customer(){//classı new lediğimiz zaman devreye girecektir.
		System.out.println("müşteri nesnesi başlatıldı.");
	}
	
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	String city;
	String firstName;
	String lastName;
	
	
}
