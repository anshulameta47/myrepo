package com.sapient.Assignment10;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import java.util.ArrayList;

@Component
public class Employee_service {

	
static List<Employee> p=new ArrayList<Employee>();	
static
{
	p.add(new Employee(101,"anshul",12345));

	p.add(new Employee(102,"shiv",1345));

	p.add(new Employee(103,"rakesh",1234));
	
}

public List<Employee> getAll()
{
	return p;
}
public Employee getOnebyId(int id)
{
	for(Employee temp:p)
	{
		if(temp.getId()==id)
			return temp;
	}
	return null;
}


public Employee getOnebyName(@PathVariable String name)
{
	
	for(Employee temp:p)
	{
		
		if(temp.getName().equals(name))
		{
			return temp;
			}
	}
	return null;
}


public Employee AddOne( Employee e)
{
	p.add(e);
	return e;
	
}


public void UpdateOne( Employee e,int id)
{
	for(Employee temp:p)
	{
		if(temp.getId()==id)
		{
			temp.setName(e.getName());
			temp.setContact(e.getContact());
		}
	}
}


public void DeleteOne(int id)
{
	for(Employee temp:p)
	{
		if(temp.getId()==id)
		{
			p.remove(temp);
		}
	}
}


}
