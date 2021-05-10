import Business.concretes.CustomerManager;

import Business.concretes.EmailManager;
import Business.concretes.PasswordManager;
import Entities.concretes.Corporation;
import Entities.concretes.Customer;
import Entities.concretes.User;
import dataAccess.concretes.UserDao;

public class Main {

	public static void main(String[] args) {
		Customer customer1  = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Melike");
		customer1.setLastName("Kýzýlcýk");
		customer1.seteMail("melikeekizilcikk@gmail.com");
		customer1.setPassword("123456");
		
		UserDao userDao = new UserDao();
		CustomerManager customerManager = new CustomerManager(userDao);
		
		EmailManager emailManager = new EmailManager();
		PasswordManager passwordManager = new PasswordManager();
	
		emailManager.isValidEmail("melikewkizilcikk@gmail.com");
		passwordManager.isValid_Password(customer1);
		customerManager.signUp(customer1);
		
		
		
		
		
 	}

}
