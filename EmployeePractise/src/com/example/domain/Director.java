package com.example.domain;

public class Director extends Manager{
	private double budget;

	public double getBudget() {
		return budget;
	}

	public Director(int employeeID, String employeeName, String emlployeeSSN, double employeeSalary, String deptName,
			double budget) {
		super(employeeID, employeeName, emlployeeSSN, employeeSalary, deptName);
		this.budget = budget;
	}

	

	
}
