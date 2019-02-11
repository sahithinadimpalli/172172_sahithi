package com.cg.asgn1;

public class Stud {
	private String name;
	private String address;
	private int numcourses=0;
	private String courses[]=new String[30];
	private int grades[]=new int[30];
	public Stud(String name,String address)
	{
		
		 this.name = name;
		 this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumcourses() {
		return numcourses;
	}
	public void setNumcourses(int numcourses) {
		this.numcourses = numcourses;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "stud [name=" + name + ", address=" + address + "]";
	}
	public void addCourseGrade(String Courses,int Grades)
	{
		for(int i=0;i<=30;i++)
		{
			if(courses[i]==null)
			{
				
				courses[i]=Courses;
				grades[i]=Grades;
				break;
			}
				else
				{
					System.out.println("courses exceeds");
				}i++;
			}
		}
	
	public void printGrade()
	{   
		System.out.println("name"+this.name);
		for(int i=0;i<30;i++)
		{
			System.out.println("course:"+courses[i]+ "grade" +grades[i]);
		}
	}
	public void getAverageGrade()
	{
		int sum=0,count=0;
		for(int i=0;i<30;i++)
		{
			sum=grades[i]+sum;
			count++;
		}
		 System.out.println("Average of All grades::"+sum/count);
	}
	
	
	
}
