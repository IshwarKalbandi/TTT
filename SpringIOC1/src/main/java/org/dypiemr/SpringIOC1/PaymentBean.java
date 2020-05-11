package org.dypiemr.SpringIOC1;

public class PaymentBean {

	public PaymentBean() {
		// TODO Auto-generated constructor stub
		System.out.println("in cunstructor");
		
	}
	private String message;
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	public void initIt() throws Exception {
		System.out.println("<<<<<<<<Init method after properties are set : " + message);
	}

	public void cleanUp() throws Exception {
		System.out.println(">>>>>>>>Spring Container is destroy! Customer clean up");
	}

		
	}
	

