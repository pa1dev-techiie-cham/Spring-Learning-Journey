package com.pa1dev.springlabs.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pa1dev.springlabs.repository.EmployeeRepository;
import com.pa1dev.springlabs.repository.EmployeeRepositoryImpl;
import com.pa1dev.springlabs.service.EmployeeService;
import com.pa1dev.springlabs.service.EmployeeServiceImpl;

@Configuration
public class EmployeeManagementConfig {
	
	@Bean
	@Scope("singleton")
	public EmployeeRepository employeeRepository() {
		return new EmployeeRepositoryImpl();
	}
	@Bean
	@Scope("singleton")
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(employeeRepository());
	}
}
