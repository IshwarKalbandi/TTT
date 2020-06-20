package org.dypiemr.courier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courier")
public class Courier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Courier_Id")
	private int courier_id;
	@Column(name="Courier_Cust_Id")
	private int courier_cust_id;
	@Column(name="Courier_Name")
	private String courier_name;
	@Column(name="Courier_Type")
	private String courier_type;
	public int getCourier_id() {
		return courier_id;
	}
	public void setCourier_id(int courier_id) {
		this.courier_id = courier_id;
	}
	public int getCourier_cust_id() {
		return courier_cust_id;
	}
	public void setCourier_cust_id(int courier_cust_id) {
		this.courier_cust_id = courier_cust_id;
	}
	public String getCourier_name() {
		return courier_name;
	}
	public void setCourier_name(String courier_name) {
		this.courier_name = courier_name;
	}
	public String getCourier_type() {
		return courier_type;
	}
	public void setCourier_type(String courier_type) {
		this.courier_type = courier_type;
	}
	
	public void manage_courier() {
		
	}
	public void search_courier() {
		
	}
	public void remove_courier() {
		
	}
}
