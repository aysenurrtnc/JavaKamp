package ECommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerceDemo.dataAccess.abstracts.UserDao;
import ECommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	 List<User> usersInDatabase = new ArrayList<>();

	@Override
	public void add(User user) {
		 System.out.println("Saved to database by hibernate: " + user.getEmail());
	     usersInDatabase.add(new User(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
	      user.getPassword())); // cloning user to another reference to simulate database (representative)
		
	}

	@Override
	public void delete(User user) {
		 System.out.println("Deleted by hibernate: " + user.getEmail());
	     usersInDatabase.remove(getById(user.getId())); // represent
		
	}

	@Override
	public void update(User user, User oldUser) {

        usersInDatabase.remove(oldUser); // representative
        usersInDatabase.add(new User(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                user.getPassword())); // cloning user to another reference to simulate database (representative)
        System.out.println("Updated by hibernate: " + user.getEmail());
		
	}

	@Override
	public User getById(int id) {
		 List<User> users = getAll();
	        if (users != null) {
	            for (User user : users) {
	                if (user.getId() == id) return user;
	            }
	        }
	        return null;
	}

	@Override
	public User getByEmail(String email) {
		 List<User> users = getAll();
	        if (users != null) {
	            for (User user : users) {
	                if (user.getEmail().equals(email)) return user;
	            }
	        }
	        return null;
	}

	@Override
	public List<User> getAll() {
		return usersInDatabase;  // represent
	}

}
