package org.dypiemr.courier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Delivery_Boy_Id")
	private int delivery_boy_id;
	@Column(name="Delivery_Cust_Id")
	private int delivery_cust_id;
	@Column(name="Delivery_Cust_Add")
	private String deliver_cust_add;
	public int getDelivery_boy_id() {
		return delivery_boy_id;
	}
	public void setDelivery_boy_id(int delivery_boy_id) {
		this.delivery_boy_id = delivery_boy_id;
	}
	public int getDelivery_cust_id() {
		return delivery_cust_id;
	}
	public void setDelivery_cust_id(int delivery_cust_id) {
		this.delivery_cust_id = delivery_cust_id;
	}
	public String getDeliver_cust_add() {
		return deliver_cust_add;
	}
	public void setDeliver_cust_add(String deliver_cust_add) {
		this.deliver_cust_add = deliver_cust_add;
	}
	
	public void add_delivery() {
		
	}
	public void make_delivery() {
		
	}
	public void remove_delivery() {
		
	}
	
}
