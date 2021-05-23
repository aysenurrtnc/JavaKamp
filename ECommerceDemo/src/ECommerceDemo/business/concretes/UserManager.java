package ECommerceDemo.business.concretes;

import ECommerceDemo.business.abstracts.UserService;
import ECommerceDemo.business.abstracts.UserValidationService;
import ECommerceDemo.core.abstracts.EmailService;
import ECommerceDemo.dataAccess.abstracts.UserDao;
import ECommerceDemo.entities.concretes.User;


public class UserManager implements UserService {
	
	private UserDao userDao;
	private UserValidationService userValidationService;
	private EmailService emailService;
	
	
	public UserManager(UserDao userDao, UserValidationService userValidationService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.userValidationService = userValidationService;
		this.emailService = emailService; 
	}

	@Override
	public void register(User user) {
		if (userValidationService.tryAuthService()) {
			userDao.add(user);
			System.out.println("successfully registration");
			return;
		}
		
		else if ((userValidationService.isValidUser(user, userDao) && !userValidationService.isUsedEmailAdress(user.getEmail(), userDao))) {
            emailService.sendVerificationMail(user.getEmail());
            System.out.println("Verified");
            userDao.add(user);
            System.out.println("successfully registration");
            return;
		}
		
		System.out.println("unsuccessfully registration");
		
	}

	@Override
	public void login(String email, String password) {
		if (userValidationService.isValidLogin(email, password, userDao)) {
			System.out.println("user is logged");
			return;
		}
		System.out.println("unsuccessfully login");
		
		
	}

	@Override
	public void update(User user) {
		User oldUser = userDao.getById(user.getId());
		if (oldUser == null) {
			System.out.println("error : user id doesn't match any user id on database!");
		}
		else if (userValidationService.tryAuthService()) {
			System.out.println("You cannot change your information for now, as it is approved by google.");
		} 
		else if (!userValidationService.isThereAnyChange(user, oldUser)) {
			System.out.println("There is no any change.");
		}
		else if (userValidationService.isValidUser(user, userDao)) {
			if (!user.getEmail().equals(oldUser.getEmail())) {
				emailService.sendVerificationMail(user.getEmail());
				System.out.println("verified");
			}
			
			userDao.update(user, oldUser);
			System.out.println("Updated Successfully");
		}
			else 
				System.out.println("Updated Failed");
			
	}

	@Override
	public void delete(User user) {
		if (userDao.getById(user.getId()) != null) {
			userDao.delete(user);
			System.out.println("Deleted Successfully");
		}
		else 
			System.out.println("Deleted Failed, there is no such user");
		
		
	}


	

}
