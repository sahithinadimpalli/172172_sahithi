package com.example.domain;

import java.util.Scanner;

public class Employee {

	public static final String NumberFormat = null;
	private int employeeID;
	private String employeeName;
	private String emlployeeSSN;
	private double employeeSalary;
	
	
	public Employee(int employeeID, String employeeName, String emlployeeSSN, double employeeSalary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.emlployeeSSN = emlployeeSSN;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		if(employeeName!=null)
		{
		  System.out.println(employeeName);
		}
		else {
			System.out.println("invalid name");
			
			}
		}
		
		
	
	public String getEmlployeeSSN() {
		return emlployeeSSN;
	}
	
		public double getEmployeeSalary() {
		return employeeSalary;
		
	}
	public void raiseSalary(double increase)
			{
		if(increase>0)
		{
		employeeSalary=employeeSalary+increase;
			}
		else {
			System.out.println("invalid raise of salary");
		}
			}
	
}
