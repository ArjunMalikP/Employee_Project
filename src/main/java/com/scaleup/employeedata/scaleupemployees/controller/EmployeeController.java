package com.scaleup.employeedata.scaleupemployees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.scaleup.employeedata.scaleupemployees.entity.Employee;
import com.scaleup.employeedata.scaleupemployees.services.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	@GetMapping("/list")
	public List<Employee> listEmployees() {
		
		List<Employee> theEmployees = employeeService.findAll();
		//theModel.addAttribute("employees", theEmployees);
		System.out.println("okok");
		return theEmployees; //"employees/list-employees";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Employee newEMployee = new Employee();
		theModel.addAttribute("employee", newEMployee);
		
		return "employees/employee-form";
	}
	
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee saveEmployee) {
		employeeService.save(saveEmployee);
		
		return "redirect:/employees/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") String theId, Model theModel) {
		Employee theEmployee = employeeService.findEmployeById(theId);
		theModel.addAttribute("employee", theEmployee);
		
		return "employees/employee-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") String theId) {
		employeeService.delete(theId);
		return "redirect:/employees/list";
	}
	
}
