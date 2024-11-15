package com.pa1dev.springlabs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pa1dev.springlabs.bean.Customer;
import com.pa1dev.springlabs.bean.PostPaid;

@SpringBootApplication
public class SpringLoggingApplication {

	public static void main(String[] args) {
		ApplicationContext context= (ApplicationContext) SpringApplication.run(SpringLoggingApplication.class,args);
		Log LOGGER=LogFactory.getLog(SpringLoggingApplication.class);
		Customer customer=(Customer) context.getBean(Customer.class);
		LOGGER.info("successfully retrived bean using class name "+customer);
		Customer customer2= (Customer) context.getBean("customer");
		LOGGER.info("successfully retrived bean using bean name "+customer);
		PostPaid p=(PostPaid) context.getBean("postPaid");
		//System.out.println("successfully retrieving bean using default name "+p);
		LOGGER.info("successfully retrieving bean using default name "+p);
	       String plan="PREPAID";
	       try{
	               String msg= customer.register(plan);
	               LOGGER.info(msg);
	       }
	       catch (Exception e) {
	               LOGGER.info("Sorry! Some exception occurred! Please check log file");
	       } 
	}

}
