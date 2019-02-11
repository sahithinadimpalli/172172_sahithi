package com.cg.third;

public class Account {
private int id;
private Customer customer;
private double balance=0.0;
public Account(int id, Customer customer, double balance) {
	super();
	this.id = id;
	this.customer = customer;
	this.balance = balance;
}
public Account(int id, Customer customer) {
	super();
	this.id = id;
	this.customer = customer;
}
	public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public int getId() {
	return id;
}

public Customer getCustomer() {
	return customer;
}
public String getCustomerName()
{

	return customer.getName();
}
public void deposit(double amount)
{
	balance=amount+this.balance;
	
}public void withdraw(double amount)
{
	if(this.balance>=amount)
	{
		balance=this.balance-amount;
	}else
	{
		System.out.println("amount withdraw exceeds the current balance");
	}
}
@Override
public String toString() {
	return "Account [id=" + id + ", balance=" + balance + ", customer name=" + getCustomerName() + "]";
}

}
