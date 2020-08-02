package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {

	
	@RequestMapping("/")
	public String a()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/result")
	public ModelAndView abc(@RequestParam("id") int s)
	{
		Student st=checkforid.Check(s);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("myresult", st);
		if(st==null)
			System.out.println("not found");
		return mv;
	}
}
