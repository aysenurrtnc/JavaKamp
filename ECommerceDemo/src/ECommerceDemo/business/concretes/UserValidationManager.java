package ECommerceDemo.business.concretes;



import java.util.regex.Matcher;
import java.util.regex.Pattern;


import ECommerceDemo.business.abstracts.UserValidationService;
import ECommerceDemo.core.abstracts.AuthService;
import ECommerceDemo.dataAccess.abstracts.UserDao;
import ECommerceDemo.entities.concretes.User;

public class UserValidationManager implements UserValidationService {
	
	private AuthService authService;
	
	public UserValidationManager() {
		
		
	}
		
	public UserValidationManager(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public boolean isValidFirstname(String firstName) {
		if (firstName.length() >= 2) 
			return true;
		
		return false;
	}

	@Override
	public boolean isValidLastName(String lastName) {
		if (lastName.length() >= 2) 
			return true;
		
		return false;
	}

	@Override
	public boolean isValidPassword(String password) {
		if (password.length() >= 6)
			return true;
		
		return false;
	}
	

	@Override
	public boolean isValidEmailAddress(String emailAddress) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPath = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPath.matcher(emailAddress);
		return matcher.find();			
		
		//Pattern-> verilen düzenli ifadeyi nesne haline getirir
	}

	@Override
	public boolean isUsedEmailAdress(String emailAddress, UserDao userDao) {
		if (userDao.getByEmail(emailAddress) != null)
			return true;
		
		return false;
	}

	

	@Override
	public boolean isValidUser(User user, UserDao userDao) {
		if (!isValidFirstname(user.getFirstName()))
			return false;
		
		else if (!isValidLastName(user.getLastName()))
			return false;
		
		else if (!isValidEmailAddress(user.getEmail()))
			return false;
		
		else 
			return isValidPassword(user.getPassword());
		
		
				
	}

	@Override
	public boolean isValidLogin(String email, String password, UserDao userDao) {
		if(authService != null)
			return authService.isValidUser();
		
		 User user = userDao.getByEmail(email);
	        if (user == null) {
	            System.out.println("Incorrect e-mail");
	            return false;
	        } 
	        else if (!user.getPassword().equals(password)) {
	            System.out.println("Incorrect password");
	            return false;
	        }
	        return true;	
	}

	@Override
	public boolean tryAuthService() {
		if (authService != null)
			return authService.isValidUser();
		
		return false;
	}

	@Override
	public boolean isThereAnyChange(User user, User oldUser) {
		
		return !(user.getFirstName().equals(oldUser.getFirstName()) &&
				user.getLastName().equals(oldUser.getLastName()) &&
				user.getEmail().equals(oldUser.getEmail()) &&
				user.getPassword().equals(oldUser.getPassword()));
	}

}
