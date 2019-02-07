package com.cg.third;

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Author au=new Author("ssss", "gfdsa", 'f');
   Book b=new Book("ASD",au, 20.0, 3);
   System.out.println(au.toString());
   System.out.println(b.toString());
	}

}
