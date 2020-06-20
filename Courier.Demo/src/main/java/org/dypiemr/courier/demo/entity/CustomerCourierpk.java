package org.dypiemr.courier.demo.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerCourierpk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int cust_id;
	private int courier_id;
	/**
	 * @return the cust_id
	 */
	public int getCust_id() {
		return cust_id;
	}
	/**
	 * @param cust_id the cust_id to set
	 */
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	/**
	 * @return the courier_id
	 */
	public int getCourier_id() {
		return courier_id;
	}
	/**
	 * @param courier_id the courier_id to set
	 */
	public void setCourier_id(int courier_id) {
		this.courier_id = courier_id;
	}
	
	

}
