package com.pa1dev.springlabs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pa1dev.springlabs.dto.EmployeeDTO;
import com.pa1dev.springlabs.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	// constructor injection
	/*
	 * here EmployeeServiceImpl has dependency called EmployeeRepository
	 * this dependency is injected into EmployeeServiceImpl class via below constructor
	 */
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	// setter injection
	/* below our dependency is injected into EmployeeServiceImpl class using a setter method
	 * 
	 */
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		employeeRepository.insertEmployee(emp);
		
	}
	@Override
	public void removeEmployee(int empId) {
		// TODO Auto-generated method stub
		employeeRepository.removeEmployee(empId);
	}

	@Override
	public List<EmployeeDTO> fetchCustomer() {
		// TODO Auto-generated method stub
		return employeeRepository.fetchCustomer();
	}

	@Override
	public EmployeeDTO getEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployee(empId);
	}

}
