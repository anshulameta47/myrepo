package com.example.springmvc;

import java.util.List;

import java.util.ArrayList;
public class Studentimp {

	
public static List<Student> getdetails()
{
	List<Student>p=new ArrayList<Student>();
	
	p.add(new Student(1,"anshul","10",30,40,45,115,"pass"));
	p.add(new Student(2,"ram","10",10,20,25,55,"pass"));
	p.add(new Student(3,"shyam","10",10,10,5,25,"Fail"));
	p.add(new Student(4,"mohAN","10",30,40,25,95,"pass"));
	p.add(new Student(5,"VIPIN","10",10,20,43,73,"pass"));
	p.add(new Student(6,"rekha","10",30,0,5,35,"Fail"));
	p.add(new Student(7,"sakshi","10",40,40,45,125,"pass"));
	p.add(new Student(8,"saumya","10",30,40,42,112,"pass"));
	
	
	return p;
}
}
