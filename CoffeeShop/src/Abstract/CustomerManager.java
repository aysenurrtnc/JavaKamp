package Abstract;

import Entities.Customer;

public interface CustomerManager
{
	//iki firmada müşterileri veri tabanına kaydetmek istiyor
	//iki tip müşteri için de bu operasyon var, mutlaka bir interface yardmıyla soyutlamalısın
	
	void save(Customer customer);
	
}
