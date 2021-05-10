package Business.concretes;

import Business.abstracts.ValidationService;
import Entities.concretes.Customer;

public class PasswordManager implements ValidationService{
	Customer customer;
	
	public void isValid_Password(Customer customer) {
		if(customer.getPassword().length() >= 6) {
			System.out.println("valid password");
		}
	}
	
}
