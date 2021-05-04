package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Entities.Customer;

//burda herhangi bir firmaya baglı olmadan dogrulama sistemi yapıyoruz
//fake sistem

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

	

}
