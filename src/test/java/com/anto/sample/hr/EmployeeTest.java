package com.anto.sample.hr;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.Assert;

import com.anto.sample.business.Department;

public class EmployeeTest {
	
  @Test
  public void testYearsOfService() {
	  Employee testEmployee = new Employee();
	  
	  // no active should be null
	  testEmployee.setHireDate(new Date());
	  Assert.assertNull(testEmployee.yearsOfService());
	  
	  // no hire date should be null
	  testEmployee.setHireDate(null);
	  testEmployee.setActive(new Boolean(true));
	  Assert.assertNull(testEmployee.yearsOfService());
	  
	  // test actual years
	  Calendar cal = Calendar.getInstance();
	  cal.add(Calendar.YEAR, -2);
	  Date twoYearsAgo = cal.getTime();
	  
	  testEmployee.setHireDate(twoYearsAgo);
	  
	  Assert.assertEquals(new Integer(2), testEmployee.yearsOfService());
  }
  
  
  @Test
  public void testSetDepartment() {
	  
	  Employee testSupervisor = new Employee();
	  testSupervisor.setFirstName("Anto");
	  testSupervisor.setLastName("Afarian");
	  
	  Department testDepartment = new Department();
	  testDepartment.setLeadEmployee(testSupervisor);
	  
	  Employee testEmployee = new Employee();
	  testEmployee.setDept(testDepartment);
	  
	  Assert.assertEquals(testDepartment, testEmployee.getDept());
	  
	  Assert.assertEquals(testSupervisor, testEmployee.getSupervisor());
	  
	  }
	  
	  
	  
  
}
