package com.cg.asgn1;

public class Stud1 {
	public static void main(String args[])
	{
		Stud s=new Stud("sahi", "1-28");
		System.out.println("NAME::"+s.getName());
		 System.out.println("Address::"+s.getAddress());
		   s.toString();
		   
		   s.addCourseGrade("101", 50);
		   s.addCourseGrade("102", 60);
		   s.addCourseGrade("204", 60);
		   s.printGrade();
		   s.getAverageGrade();
		
	}

}