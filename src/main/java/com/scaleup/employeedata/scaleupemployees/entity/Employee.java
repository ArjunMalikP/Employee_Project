package com.scaleup.employeedata.scaleupemployees.entity;

public class Employee {

	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String age;
	
	private String email;

	private String mobile;
	
	private String city;
	
	private String salary;
	
	public Employee() {
		
	}
	
	public Employee(String id, String firstName, String lastName, String age, String email, String mobile, String city, String salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.salary = salary;
	}

	public Employee(String firstName, String lastName, String age, String email, String mobile, String city, String salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", email=" + email + ", mobile=" + mobile + ", city=" + city + ", salary=" + salary + "]";
	}
}
