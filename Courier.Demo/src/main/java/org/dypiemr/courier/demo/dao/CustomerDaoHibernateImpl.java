package org.dypiemr.courier.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import org.dypiemr.courier.demo.entity.Customer;


@Repository
public class CustomerDaoHibernateImpl implements CustomerDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public CustomerDaoHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	public List<Customer> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Customer> theQuery =
				currentSession.createQuery("from Customer", Customer.class);
		
		// execute query and get result list
		List<Customer> customer = theQuery.getResultList();
		
		// return the results		
		return customer;
	}
		@Override
		public Customer findById(int theId) {

			// get the current hibernate session
			Session currentSession = entityManager.unwrap(Session.class);
			
			// get the customer
			Customer theCustomer =
					currentSession.get(Customer.class, theId);
			
			// return the customer
			return theCustomer;
		}


		@Override
		public void save(Customer theCustomer) {

			// get the current hibernate session
			Session currentSession = entityManager.unwrap(Session.class);
			
			// save customer
			currentSession.saveOrUpdate(theCustomer);
		}


		@Override
		public void deleteById(int theId) {
			
			// get the current hibernate session
			Session currentSession = entityManager.unwrap(Session.class);
					
			// delete object with primary key
			Query theQuery = 
					currentSession.createQuery(
							"delete from Customer where id=:customerId");
			theQuery.setParameter("customerId", theId);
			
			theQuery.executeUpdate();
		}
     
		
	

}







