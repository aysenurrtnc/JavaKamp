import java.sql.Date;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Ayşenur", "Tunç", new Date(1998, 9, 27), "12345");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); //Base hem Starbucks hem de Nero'nun referansını tutabiliyor
	
		
		baseCustomerManager.save(customer);
		
		
		

	}

}
