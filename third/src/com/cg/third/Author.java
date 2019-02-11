package com.cg.third;

public class Author {
private String name;
private String email;
private char gender;
	
public Author(String name, String email, char gender) {
	super();
	this.name = name;
	this.email = email;
	this.gender = gender;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}

public char getGender() {
	return gender;
}

@Override
public String toString() {
	return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
}




}
