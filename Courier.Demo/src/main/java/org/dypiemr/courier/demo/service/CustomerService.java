package org.dypiemr.courier.demo.service;
import java.util.List;

import org.dypiemr.courier.demo.entity.*;

public interface CustomerService {
    public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Customer theCustomer);
	
	public void deleteById(int theId);


}
