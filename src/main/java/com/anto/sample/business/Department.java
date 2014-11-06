package com.anto.sample.business;

import com.anto.sample.hr.Employee;

public class Department {
    private Integer id;
    private String name;
    private Company company;
    private Employee leadEmployee;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Employee getLeadEmployee() {
		return leadEmployee;
	}
	public void setLeadEmployee(Employee leadEmployee) {
		this.leadEmployee = leadEmployee;
	}
    
    
}
