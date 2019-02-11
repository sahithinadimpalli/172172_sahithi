package com.cg.bank;

import java.util.Scanner; 

public class BankAccount { 
    public static void main(String[] args) { 
            Scanner in = new Scanner(System.in); 
            int userChoice; 
            float MiniStatement = 0;
            boolean quit = false; 
            float balance = 0f; 
            do { 
                  System.out.println("1. Deposit money"); 
                  System.out.println("2. Withdraw money"); 
                  System.out.println("3. Check balance"); 
                  System.out.println("4. Mini statement"); 
                  System.out.print("Your choice, 0 to quit: "); 
                  userChoice = in.nextInt(); 
                  switch (userChoice) { 
                  case 1: 
                        float amount; 
                        System.out.print("Amount to deposit: "); 
                        amount = in.nextFloat(); 
                        if (amount <= 0) 
                             System.out.println("Can't deposit nonpositive amount."); 
                        else { 
                             balance += amount; 
                             System.out.println("$" + amount + " has been deposited."); 
                             MiniStatement=amount;
                        } 
                        break; 
                  case 2: 
                        System.out.print("Amount to withdraw: "); 
                        amount = in.nextFloat(); 
                        if (amount <= 0 || amount > balance) 
                             System.out.println("Withdrawal can't be completed."); 
                        else { 
                             balance -= amount; 
                             System.out.println("$" + amount + " has been withdrawn."); 
                        } 
                        MiniStatement=-amount;
                        break; 
                  case 3: 
                        System.out.println("Your balance: $" + balance); 
                        break; 
                  case 4:
                	    System.out.println("-----MiniStatement-----");
                	    if(MiniStatement>0)
                	    {
                	    	System.out.println("Deposited: "+MiniStatement);
                	    }
                	    else if(MiniStatement<0)
                	    {
                	    	System.out.println("withdrawn: "+Math.abs(MiniStatement));
                	    }
                	    else
                	    {
                	    	System.out.println("no transactions occured");
                	    }
                	    break;
                  case 0: 
                        quit = true; 
                        break; 
                        
                  default: 
                        System.out.println("Wrong choice."); 
                        break; 
                  } 
                  System.out.println(); 
            } while (!quit); 
            System.out.println("Bye!"); 
      } 
}
