package dataAccess.concretes;

import java.util.List;

import Entities.concretes.User;
import dataAccess.abstracts.IUserDao;

public class UserDao implements IUserDao{

	@Override
	public void add(User user) {
		System.out.println("Saved to database: " +user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated: " +user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted from database: " +user.getFirstName());
		
	}

	@Override
	public User getID(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
