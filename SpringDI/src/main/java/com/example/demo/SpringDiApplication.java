package com.example.demo;


public class SpringDiApplication {

	public static void main(String[] args) {

		// create the object
		MyBean theApi = new UPIPayments();
		
		// use the object
		System.out.println(theApi.getDailyPayment());	
		//System.out.println(theApi.getDailyService());
	}


}
