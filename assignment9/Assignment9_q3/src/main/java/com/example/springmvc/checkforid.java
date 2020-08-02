package com.example.springmvc;

import java.util.List;

public class checkforid {

	
	public static Student Check(int id)
	{
		
		List<Student> p=Studentimp.getdetails();
		for(Student temp:p)
		{
			if(temp.getId()==id)
			{
				return temp;
				}
		}
		return null;
		
	}
}
