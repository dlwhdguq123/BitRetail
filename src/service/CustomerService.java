package service;


import java.util.List;
import java.util.Map;

import domain.CustomerDTO;
import proxy.Proxy;


public interface CustomerService {
	public void registCustomer(CustomerDTO cus);
	
	public List<CustomerDTO> bringCustomerList(Proxy pxy); 
	public CustomerDTO retrieveCustomers(CustomerDTO cus);
	public int countCustomer(Proxy pxy);
	public boolean existsCustomer(CustomerDTO cus);
	
	public void modifyCustomer(CustomerDTO cus);
	public void removeCustomer(CustomerDTO cus);
	
	public Map<String, Object> retrievePhone(Proxy pxy);
}
