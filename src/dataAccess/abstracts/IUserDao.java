package dataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface IUserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getID(int id);
	List<User> getAll();
}
