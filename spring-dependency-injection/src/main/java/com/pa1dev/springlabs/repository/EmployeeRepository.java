package com.pa1dev.springlabs.repository;

import java.util.List;
import java.util.Set;

import com.pa1dev.springlabs.dto.EmployeeDTO;

public interface EmployeeRepository {
	
	public void insertEmployee(EmployeeDTO emp);

	public void removeEmployee(int empId);

	public List<EmployeeDTO> fetchCustomer();
	
	public EmployeeDTO getEmployee(int empId);
	
}
