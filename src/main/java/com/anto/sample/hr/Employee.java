package com.anto.sample.hr;

import java.util.Date;

import com.anto.sample.business.Department;

public class Employee extends Person {
	private Department dept;
	private Integer employeeId;
	private String officeAddress;
	private Integer officeNumber;
	private Date hireDate;
	private String title;
	private Employee supervisor;
	private Boolean active;
	
	public Integer yearsOfService() {
		if (active == null || !active) {
			return null;
		}
		if (hireDate == null) {
			return null;
		}
		
		Date now = new Date(); 
		long diffMillis = now.getTime() - hireDate.getTime();
		float years = diffMillis / 31536000000L;
		return new Integer(Math.round(years)); 
	}
	
	public void moveToDepartment(Department newDept) {
	    this.setDept(newDept);
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
		this.setSupervisor(dept.getLeadEmployee());
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Integer getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(Integer officeNumber) {
		this.officeNumber = officeNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Employee getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	

}
