package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import GroupingExample.EmpBusinessLogic;
import GroupingExample.EmployeeDetails;

public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	   EmployeeDetails employee = new EmployeeDetails();

	   @Test(enabled=true)
	   public void testCalculateAppriasal() {
	   
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      
	      double appraisal = empBusinessLogic.calculateAppraisal(employee);
	      Assert.assertEquals(500, appraisal, 0.0, "500");
	   }

	   // Test to check yearly salary
	   @Test(enabled=true)
	   public void testCalculateYearlySalary() {
	   
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
	      
	      double salary = empBusinessLogic.calculateYearlySalary(employee);
	      Assert.assertEquals(96000, salary, 0.0, "8000");
	   }

}
