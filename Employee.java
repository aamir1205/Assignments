package com.spring.service;

public class Employee {
	
	private String id;
	private String name;
	private String address;
	private int salary;
	private String phone;
	public Employee(String id, String name, String address, int salary, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
