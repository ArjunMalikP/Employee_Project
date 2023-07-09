package com.scaleup.employeedata.scaleupemployees.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.scaleup.employeedata.scaleupemployees.entity.Employee;

//@RepositoryRestResource(path="members")
@Repository
public class EmployeeRepository{
	
	private static final Map<String, Employee> employeeMap = new HashMap<String, Employee>();	 
	    static {loadonStartUpEmployees();}	 
	    private static void loadonStartUpEmployees() {
	    	
	        Employee emp1 = new Employee("Scale_UP-ID-01", "Bhim", "Sr","11","Bhima@Scale-UP-vision.com", "7212121212","Bangalore","123");
	        Employee emp2 = new Employee("Scale_UP-ID-02", "Nakul", "Kf","22","Nakul@Scale-UP-vision.com","8434343434","London","456");
	        Employee emp3 = new Employee("Scale_UP-ID-03", "Arjun", "Bw","33","Arjun@Scale-UP-vision.com","9656565656","Srinagar","789");
	 
	        employeeMap.put(emp1.getId(), emp1);
	        employeeMap.put(emp2.getId(), emp2);
	        employeeMap.put(emp3.getId(), emp3);
	    }
	    public Employee findById(String empNo) {
	        return employeeMap.get(empNo);
	    }
	 
	    public Employee save(Employee emp) {
	        employeeMap.put(emp.getId(), emp);
	        return emp;
	    }
	 
	    public Employee updateEmployee(Employee emp) {
	        employeeMap.put(emp.getId(), emp);
	        return emp;
	    }
	 
	    public Employee deleteById(String empNo) {
	       return employeeMap.remove(empNo);
	    }
	 
	    public List<Employee> findAll() {
	        Collection<Employee> c = employeeMap.values();
	        List<Employee> list = new ArrayList<Employee>();	        
	        list.addAll(c); Comparator<Employee> byFirstName = Comparator.comparing(Employee::getFirstName); //.reversed()    
	     // order by Firstname Ascending	        
	        Collections.sort(list, byFirstName);//System.out.println(" *** "+list);      
	        
	        return list;
	    }
}
