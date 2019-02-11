package com.abc;

import java.text.NumberFormat;
import com.example.domain.Admin;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {
	
	public static void printEmployee(Employee e1)
	{
		System.out.println("Employee id is "+e1.getEmployeeID());
	      System.out.println("Employee name is " +e1.getEmployeeName());
	      System.out.println("Employee SSN is" +e1.getEmlployeeSSN());
	      System.out.println("Employee salary is "+e1.getEmployeeSalary());
	      System.out.println("Employee salary is "+NumberFormat.getCurrencyInstance().format(e1.getEmployeeSalary()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Engineer e1=new Engineer(110,null, "123-345-678", 50000);
      e1.raiseSalary(-8);
      EmployeeTest.printEmployee(e1);
      Manager m1=new Manager(207, "john", "1234", 1231234, "Us marketing");
      m1.raiseSalary(10000);
      EmployeeTest.printEmployee(m1);
      Admin a1=new Admin(301, "sasi","123-25", 20000);
      a1.raiseSalary(2000);
      EmployeeTest.printEmployee(a1);
      Director d1=new Director(401, "omkar", "12-123", 20000, "mentor",600.0);
      d1.raiseSalary(200);
      EmployeeTest.printEmployee(d1);
     
    
      
     
     
	}
	

}
