package com.pa1dev.springlabs.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class PostPaid implements Plan{
	Log logger=LogFactory.getLog(this.getClass());
	@Override
	public String toString() {
		return "PostPaid [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public Boolean enrollToPlan(String planName) {
		// TODO Auto-generated method stub
		logger.debug("customer bean's plan dependency using postpaid bean");
		return planName=="POSTPAID"?true:false;
	}

}
