package Entities.concretes;

public class User {
	int id;
	String firstName;
	String eMail;
	String password;
	
	public User() {
		
	}

	public User(int id, String firstName, String eMail, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.eMail = eMail;
		this.password = password;
	}

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

	public String geteMail() {
		return eMail;
	}

	public void setePosta(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
