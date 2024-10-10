package com.pa1dev.springlabs.repository;

import java.util.Set;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.pa1dev.springlabs.dto.EmployeeDTO;


@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	/*
	 * why choosing LinkedHashSet<EmployeeDTO>() ?
	 * first it maintains order
	 * second it does not store duplicate
	 * 
	 * how it works?
	 * when a EmployeeDTO object is going add in employeeList it checks
	 * whether that EmployeeDTO object already exists in employeeList using equals method of EmployeeDTO
	 * 
	 * equals method of EmployeeDTO class generated in such way that
	 * two EmployeeDTO objects with same empId will be considered as same
	 * EmployeeDTO equals method
	 * public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return empId == other.empId;
	}
	 * 
	 * 
	 */
	@SuppressWarnings("unchecked")
	Set<EmployeeDTO> employeeList=new LinkedHashSet<EmployeeDTO>();
	{
		// adding employees to employeeList
		EmployeeDTO emp1=new EmployeeDTO();
		emp1.setName("pavandev");
		emp1.setEmpId(46);
		emp1.setDepartment("production_development");
		employeeList.add(emp1);
		
		EmployeeDTO emp2=new EmployeeDTO();
		emp2.setName("sai");
		emp2.setEmpId(6);
		emp2.setDepartment("fullstack_development");
		employeeList.add(emp2);
		
		EmployeeDTO emp3=new EmployeeDTO();
		emp3.setName("kk");
		emp3.setEmpId(4);
		emp3.setDepartment("software_training");
		employeeList.add(emp3);
	}
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		if(employeeList.add(emp)) {
			System.out.println(emp.getEmpId()+" is successfully added in employee list");
		}
		else {
			System.out.println(emp.getEmpId()+" is not successfully added in employee list");
		}
	}

	@Override
	public void removeEmployee(int empId) {
		// TODO Auto-generated method stub
		for(EmployeeDTO emp:employeeList) {
			if(emp.getEmpId()==empId) {
				employeeList.remove(emp);
				System.out.println(emp.getEmpId()+" is successfully removed in employee list");
				return;
			}
		}
		System.out.println(empId+" is not successfully removed in employee list because no employee found with that id");
	}

	@Override
	public List<EmployeeDTO> fetchCustomer() {
		// TODO Auto-generated method stub
		List<EmployeeDTO> arr=new ArrayList<EmployeeDTO>();
		for(EmployeeDTO e:employeeList) {
			arr.add(e);
		}
		return arr;
	}

	@Override
	public EmployeeDTO getEmployee(int empId) {
		// TODO Auto-generated method stub
		for(EmployeeDTO emp:employeeList) {
			if(emp.getEmpId()==empId) {
				//employeeList.remove(emp);
				System.out.println(emp.getEmpId()+" is successfully fetched in employee list");
				return emp;
			}
		}
		System.out.println(empId+" is not successfully fetched in employee list because no employee found with that id");
		return null;
	}

}
