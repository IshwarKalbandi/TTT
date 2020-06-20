package org.dypiemr.courier.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
//@NamedQueries({ @NamedQuery(name = "@HQL_GET_ALL_CUSTOMER", query = "from Customer") })
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Customer_id")
	
	private int cust_id;
	
	private String cust_name;
	
	private String cust_address;
	
	private String cust_uname;
	
	private String cust_pass;
	
	public Customer() {}
	
	public Customer(String cust_name, String cust_address, String cust_uname,String cust_pass) {
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.cust_uname = cust_uname;
		this.cust_pass=cust_pass;
	}
	
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_uname() {
		return cust_uname;
	}

	public void setCust_uname(String cust_uname) {
		this.cust_uname = cust_uname;
	}

	public String getCust_pass() {
		return cust_pass;
	}

	public void setCust_pass(String cust_pass) {
		this.cust_pass = cust_pass;
	}

	
	
}
