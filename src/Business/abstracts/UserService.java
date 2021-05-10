package Business.abstracts;

import Entities.concretes.Customer;
import Entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void logIn(String email, String password);
	void deleteAccount(User user);
	void signUp(Customer customer);

}
