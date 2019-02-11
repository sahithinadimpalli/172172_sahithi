package com.cg.phonebook;

public class Phn {
String name;
String number1;
String number2;
public Phn(String name, String number1, String number2) {
	super();
	this.name = name;
	this.number1 = number1;
	this.number2 = number2;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber1() {
	return number1;
}
public void setNumber1(String number1) {
	this.number1 = number1;
}
public String getNumber2() {
	return number2;
}
public void setNumber2(String number2) {
	this.number2 = number2;
}
@Override
public String toString() {
	return "Phn [name=" + name + ", number1=" + number1 + ", number2=" + number2 + "]";
}

}
