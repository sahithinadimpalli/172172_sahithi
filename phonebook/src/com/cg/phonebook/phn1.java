package com.cg.phonebook;
import java.util.*; 
import java.util.ArrayList;
import java.util.Collections;


public class phn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phn p1=new Phn("sahi","123","123");
		Phn p2=new Phn("hell","12","12");
		ArrayList<Phn> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		Iterator itr=list.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Phn p=(Phn)itr.next();  
		    System.out.println(p.name+" "+p.number1+" "+p.number2); 
		
	}

}
}
