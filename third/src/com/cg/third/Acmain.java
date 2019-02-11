package com.cg.third;

public class Acmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Customer c=new Customer(1,"sahi", 'f');
     Account a=new Account(01, c);
     a.setBalance(200.0);
     a.deposit(50.0);
     a.withdraw(600.0);
     System.out.println(a.toString());
     System.out.println(c.toString());;
	}

}
