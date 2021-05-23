package ECommerceDemo.core.concretes;

import ECommerceDemo.core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendVerificationMail(String mail) {
		System.out.println("verification mail has send to " + mail);
		System.out.println("Click on the verification link to verify your email -> https://verificationlink.com/ ");
		
		
	}

}
