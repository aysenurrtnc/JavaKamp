package Abstract;


import Entities.Customer;

//iki firmanın müşterileri de aynı veri tabanına kaydedilecek o yüzden Base bir abstract class yardımıyla yaptık bunu.Çünkü ortak bir operasyon.
public abstract class BaseCustomerManager implements CustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("saved to db : " + customer.getFirstName());
		
	}

}
