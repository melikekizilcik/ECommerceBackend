package Business.concretes;

import Business.abstracts.UserService;
import Entities.concretes.Customer;
import Entities.concretes.User;
import dataAccess.concretes.UserDao;

public class CustomerManager implements UserService{
	private UserDao userDao;
	private User user;
	
	public CustomerManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void signUp(Customer customer) {
		
		if(customer.getFirstName().length()>= 2 && customer.getLastName().length()>=2) {
			System.out.println("Check your email for complete the registration");
			userDao.add(customer);
		}
		else {
			System.out.println("Try again!");
		}
	}

	@Override
	public void logIn(String email, String password) {
		if(user.geteMail().equals(email) && user.getPassword().equals(password)) {
			System.out.println("Logged in! Welcome: " + user.getFirstName());
		}
		else {
			System.out.println("Try Again");
		}
		
	}

	@Override
	public void deleteAccount(User user) {
		this.user = user;
		userDao.delete(user);
		
	}
	
	public void buy() {
		System.out.println("Product has been bought!");
	}

	@Override
	public void signUp(User user) {
		// TODO Auto-generated method stub
		
	}

}
