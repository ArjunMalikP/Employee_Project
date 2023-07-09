package com.scaleup.employeedata.scaleupemployees.services;

import java.util.List;

import com.scaleup.employeedata.scaleupemployees.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findEmployeById(String theId);
	
	public void save(Employee employee);
	
	public void delete(String theId);
}
