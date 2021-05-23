import ECommerceDemo.business.concretes.UserManager;
import ECommerceDemo.business.concretes.UserValidationManager;
import ECommerceDemo.core.concretes.EmailManager;
import ECommerceDemo.core.concretes.GoogleAuthManager;
import ECommerceDemo.dataAccess.concretes.HibernateUserDao;
import ECommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Ayşenur", "Tunç","aysnr@gmail.com", "123456");
		User user2 = new User(2, "Sıla", "Aslan", "sıla12@gmail.com", "123");
		User user3 = new User();
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new UserValidationManager(), new EmailManager());
		
		System.out.println("registiration test: " );
		userManager.register(user1);
		System.out.println();
		userManager.register(user2);
		System.out.println();
		
		System.out.println("**********************************************");
		
		System.out.println("login test: ");
		userManager.login(user1.getEmail(), user1.getPassword());
		
		System.out.println("**********************************************");
	
		System.out.println("update test: ");
		userManager.update(user2); 
		
		userManager.update(user1); //there is no change
		
		
		System.out.println("update test: " + "email change -> ");
		user1.setEmail("ays.123@gmail.com");
		userManager.update(user1);
		
		System.out.println("**********************************************");
		userManager.delete(user1);
		
		System.out.println("**********************************************");
		
		System.out.println("Google Test : ");
		UserManager userManager2 = new UserManager(new HibernateUserDao(), new UserValidationManager(new GoogleAuthManager()), new EmailManager());
		userManager2.register(user3);
		System.out.println();
		userManager2.login(user3.getEmail(), user3.getPassword());
		
		
	
	}

}
