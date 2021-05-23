package ECommerceDemo.business.abstracts;



import java.util.List;

import ECommerceDemo.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	
	void login(String email, String password);
	
	void update(User user);
	
	void delete(User user);
	

	
	
	

}
