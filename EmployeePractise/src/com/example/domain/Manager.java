package com.example.domain;

public class Manager extends Employee {
private String deptName;
private Employee staff[];
private int employeeCount=0;
	
		// TODO Auto-generated constructor stub
	
	public Manager(int employeeID, String employeeName, String emlployeeSSN, double employeeSalary, String deptName) {
		super(employeeID, employeeName, emlployeeSSN, employeeSalary);
		this.deptName = deptName;
		staff=new Employee[20]; 
	}

	public String getDeptName() {
		return deptName;
	}

	public void findEmployee()
	{
		
	}

	

}
