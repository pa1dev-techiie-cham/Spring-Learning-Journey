package com.pa1dev.springlabs.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("prepaid")
public class PrePaid implements Plan{
	Log logger=LogFactory.getLog(this.getClass());
	@Override
	public Boolean enrollToPlan(String planName) {
		// TODO Auto-generated method stub
		logger.debug("customer bean's plan dependency using prepaid bean");
		return planName=="PREPAID"?true:false;
	}

}
