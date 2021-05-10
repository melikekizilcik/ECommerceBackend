package Business.concretes;

import Business.abstracts.UserService;
import Entities.concretes.Customer;
import Entities.concretes.User;
import dataAccess.concretes.UserDao;

public class CorporationManager implements UserService {
	private UserDao userDao;
	User user;
	
	public CorporationManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public void signUp(User user) {
		this.user = user;
		userDao.add(user);
		
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


	@Override
	public void signUp(Customer customer) {
		// TODO Auto-generated method stub
		
	}



}
