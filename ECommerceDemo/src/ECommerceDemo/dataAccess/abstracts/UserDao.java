package ECommerceDemo.dataAccess.abstracts;



import java.util.List;

import ECommerceDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	
	void delete(User user);
	
	void update(User user, User oldUser);
	
	User getById(int id);
	
	User getByEmail(String email);
	
	List<User> getAll();
	
	
	

}
