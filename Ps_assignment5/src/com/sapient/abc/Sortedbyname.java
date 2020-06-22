package com.sapient.abc;

import java.util.Comparator;

public class Sortedbyname implements Comparator<Student> {
		

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}
	

}


