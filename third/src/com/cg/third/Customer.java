package com.cg.third;

public class Customer {
private int id;
private String name;
private char gender;
public Customer(int id, String name, char gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public char getGender() {
	return gender;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + "]";
}
}