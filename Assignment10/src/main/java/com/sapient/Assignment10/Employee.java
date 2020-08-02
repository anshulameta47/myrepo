package com.sapient.Assignment10;

public class Employee {
public int id;
public String name;
public int contact;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public Employee(int id, String name, int contact) {
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
}
}
