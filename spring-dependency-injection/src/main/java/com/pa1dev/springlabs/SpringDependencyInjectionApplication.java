package com.pa1dev.springlabs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pa1dev.springlabs.dto.EmployeeDTO;
import com.pa1dev.springlabs.service.EmployeeService;
import com.pa1dev.springlabs.service.EmployeeServiceImpl;
import com.pa1dev.springlabs.util.EmployeeManagementConfig;
import com.pa1dev.springlabs.repository.EmployeeRepository;


public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext cntx=new AnnotationConfigApplicationContext(EmployeeManagementConfig.class);
		EmployeeServiceImpl employeeService=cntx.getBean(EmployeeServiceImpl.class);
		// fetch employee details
		System.out.println("current employees");
		showEmployees(employeeService);
		System.out.println("adding an employee");
		EmployeeDTO newEmployee=new EmployeeDTO();
		newEmployee.setName("a");
		newEmployee.setEmpId(1);
		newEmployee.setDepartment("smtg");
		employeeService.insertEmployee(newEmployee);
		showEmployees(employeeService);
		// adding a new employee object with already existing empId
		EmployeeDTO newEmployee2=new EmployeeDTO();
		newEmployee2.setName("b");
		newEmployee2.setEmpId(1);
		newEmployee2.setDepartment("smtg2");
		
		employeeService.insertEmployee(newEmployee2);
		showEmployees(employeeService);
		// removing employye
		System.out.println("after removing employee with id 1");
		employeeService.removeEmployee(1);
		showEmployees(employeeService);
		// getting employee
		
		employeeService.getEmployee(46);
		//showEmployees(employeeService);
		/*
		 * setter injection
		 * first we create a dependent class bean
		 * then we inject into class using setter method of non-dependent class
		 */
		// creating dependency bean
		EmployeeRepository employeeRepository=(EmployeeRepository) cntx.getBean("employeeRepository");
		employeeService.setEmployeeRepository(employeeRepository);
		System.out.println("after adding new dependency to employee service");
		showEmployees(employeeService);
	}
	public static void showEmployees(EmployeeService employeeService) {
		List<EmployeeDTO> employees=employeeService.fetchCustomer();
		for(EmployeeDTO e:employees) {
			System.out.println(e.getName()+","+e.getEmpId()+","+e.getDepartment());
		}
	}

}
