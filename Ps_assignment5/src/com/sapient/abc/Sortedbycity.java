package com.sapient.abc;

import java.util.Comparator;

public class Sortedbycity implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getCity().compareTo(arg1.getCity());
	}

}
