package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.ValidationService;
import Entities.concretes.Customer;
import Entities.concretes.User;

public class EmailManager implements ValidationService {
	Customer customer;
	User user;
	
	public EmailManager() {
		
	}
	
	
	public final Pattern Valid_Email_Adress = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	public boolean isValidEmail(String email) {
		Matcher matcher = Valid_Email_Adress.matcher(email);
			
		return matcher.find();
		
	}
}

