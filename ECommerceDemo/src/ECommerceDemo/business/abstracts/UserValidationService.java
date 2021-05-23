package ECommerceDemo.business.abstracts;

import ECommerceDemo.dataAccess.abstracts.UserDao;
import ECommerceDemo.entities.concretes.User;

public interface UserValidationService {
	boolean isValidFirstname(String firstName);
	boolean isValidLastName(String lastName);
	boolean isValidPassword(String password);
	boolean isValidEmailAddress(String emailAddress);
	boolean isUsedEmailAdress(String emailAddress, UserDao userDao);
	boolean isValidUser(User user, UserDao userDao);
	boolean isValidLogin(String email, String password, UserDao userDao );
	boolean isThereAnyChange(User user, User oldUser);
    boolean tryAuthService();
	
	
}
