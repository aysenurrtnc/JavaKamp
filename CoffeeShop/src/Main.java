import java.sql.Date;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Ayşenur", "Tunç", new Date(1997, 9, 27), "22196478920");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); //Base hem Starbucks hem de Nero'nun referansını tutabiliyor
	
		
		baseCustomerManager.save(customer);
		
		
		

	}

}
