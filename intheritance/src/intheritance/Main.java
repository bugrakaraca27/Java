package intheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();

		CustomerManager customermanager = new CustomerManager();
		EmployeeManager employeemanager = new EmployeeManager();
		PersonManager personmanager =new PersonManager();
		
		employeemanager.BestEmployee();
	}

}
