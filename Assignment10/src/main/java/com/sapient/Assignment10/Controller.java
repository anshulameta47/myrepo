package com.sapient.Assignment10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

@Autowired
Employee_service s;

@GetMapping("/Employee")
public List<Employee> getAll()
{
	return s.getAll();
}

@GetMapping("/Employee/id/{id}")
public Employee getOnebyId(@PathVariable int id)
{
	return s.getOnebyId(id);
}

@GetMapping("/Employee/name/{name}")
public Employee getOnebyName(@PathVariable("name") String name)
{
	return s.getOnebyName(name);
}



@PostMapping("/Employee")
public void AddOne(@RequestBody Employee e)
{
	 s.AddOne(e);
}

@PutMapping("/Employee/{id}")
public void UpdateOne(@RequestBody Employee e,@PathVariable int id )
{
	s.UpdateOne(e, id);
}

@DeleteMapping("/Employee/{id}")
public void DeletebyID(@PathVariable int id)
{
	s.DeleteOne(id);
}
}
