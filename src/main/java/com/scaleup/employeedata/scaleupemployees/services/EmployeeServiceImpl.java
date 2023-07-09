package com.scaleup.employeedata.scaleupemployees.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scaleup.employeedata.scaleupemployees.dao.EmployeeRepository;
import com.scaleup.employeedata.scaleupemployees.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theemployeeRepository) {
		employeeRepository = theemployeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeById(String theId) {
		Employee theEmployee = employeeRepository.findById(theId);
		
		if(theEmployee == null) {
			throw new RuntimeException("Did NOT find the Employee Id - "+theId);
		} else {
		return theEmployee;
		}
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(String theId) {
		employeeRepository.deleteById(theId);
	}

}
