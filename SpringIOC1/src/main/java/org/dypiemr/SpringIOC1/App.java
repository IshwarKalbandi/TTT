package org.dypiemr.SpringIOC1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    //	ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		PaymentBean obj= (PaymentBean) context.getBean("mybean",PaymentBean.class);
		obj.getMessage();
		context.close();
    }
}
