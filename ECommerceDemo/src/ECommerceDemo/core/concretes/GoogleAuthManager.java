package ECommerceDemo.core.concretes;

import ECommerceDemo.core.abstracts.AuthService;

public class GoogleAuthManager implements AuthService {

	@Override
	public boolean isValidUser() {
		System.out.println("User was approved by Google");
		return true;
	}
	

}
