package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService CustomerCheckService;
	
	

	public NeroCustomerManager(Abstract.CustomerCheckService customerCheckService) {
		super();
		CustomerCheckService = customerCheckService;
	}
	

	@Override
	public void save(Customer customer) {
		
		if (CustomerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
		
	}
	

}
