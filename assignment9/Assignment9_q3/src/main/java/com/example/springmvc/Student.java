package com.example.springmvc;

public class Student {

	public int id;
	
	public String name;
	public String standard;
	public int hindi;
	public Student(int id, String name, String standard, int hindi, int math, int english, int total,
			String result) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.hindi = hindi;
		this.math = math;
		this.english = english;
		this.total = total;
		this.result = result;
	}
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public int math;
	public int english;
	public int total;
	public String result;
}
