package com.pa1dev.springlabs.service;

import java.util.List;

import com.pa1dev.springlabs.dto.EmployeeDTO;

public interface EmployeeService {
	public void insertEmployee(EmployeeDTO emp);

	public void removeEmployee(int empId);

	public List<EmployeeDTO> fetchCustomer();
	
	public EmployeeDTO getEmployee(int empId);
}
