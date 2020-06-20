package org.dypiemr.courier.demo.dao;

import java.util.List;


import org.dypiemr.courier.demo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> findAll();
    public Customer findById(int theId);
	public void save(Customer theCustomer);
	public void deleteById(int theId);
}
