package com.pa1dev.springlabs.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pa1dev.springlabs.exception.CustomException;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component("customer")
public class Customer {
	@Override
	public String toString() {
		return "Customer [plan=" + plan + "]";
	}
	private Plan plan;
	@Autowired
	Customer(@Qualifier("prepaid") Plan plan){
		this.plan=plan;
	}
	Log logger=LogFactory.getLog(this.getClass());
	@PostConstruct
	public void init() {
		logger.debug("my name init(),i am known to be as method of cutomer class and i am annotated with @postconstruct");
	}
	public String register(String planName) throws CustomException{
		try {
			if(plan.enrollToPlan(planName)) {
				return "custome enrolled to a "+planName+" plan";
			}
			else {
				throw new CustomException("customer is not registered!");
			}
		}catch(CustomException e) {
			logger.debug(e.getMessage(), e);
			throw e;
		}
	}
	@PreDestroy
	public void destroy() {
		logger.debug("my name destroy(),i am known to be as method of cutomer class and i am annotated with @predestroy");
	}
}
