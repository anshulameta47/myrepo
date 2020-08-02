package com.wipro.abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyquestionApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(MyquestionApplication.class, args);
	
		ApplicationContext myplayers=new ClassPathXmlApplicationContext("spring.xml");
		
		List<Player> mylist =new ArrayList<Player>();
		
		Country c1=(Country)myplayers.getBean("Country");
		c1.setCountryId("c1");
		c1.setCountryName("west indies");
		
		Country c2=(Country)myplayers.getBean("Country");
		c2.setCountryId("c2");
		c2.setCountryName("Uzhbekistan");
		
		
		Player p1= (Player)myplayers.getBean("Player");
		p1.setPlayerId("p1");
		p1.setPlayerName("Sakshi");
		p1.setCountry(c1);
		mylist.add(p1);
		
		Player p2= (Player)myplayers.getBean("Player");
		p2.setPlayerId("p2");
		p2.setPlayerName("Manisha");
		p2.setCountry(c1);
		mylist.add(p2);
		
		Player p3= (Player)myplayers.getBean("Player");
		p3.setPlayerId("p3");
		p3.setPlayerName("Rishika");
		p3.setCountry(c2);
		mylist.add(p3);
		
		Player p4= (Player)myplayers.getBean("Player");
		p4.setPlayerId("p4");
		p4.setPlayerName("Prerna");
		p4.setCountry(c2);
		mylist.add(p4);
		
		Player p5= (Player)myplayers.getBean("Player");
		p5.setPlayerId("p1");
		p5.setPlayerName("Nivedita");
		p5.setCountry(c2);
		mylist.add(p5);
		
		System.out.println("Here are the details of all the players");
		for(Player temp:mylist)
		{
			System.out.println(temp);
		}
		
		System.out.println("Enter Country name");
		Scanner scanner = new Scanner(System.in);
		String Cname = scanner.nextLine();
		
		Country c3=(Country)myplayers.getBean("Country");
		if(Cname.equals(c1.getCountryName()))
			c3=c1;
		else if(Cname.equals(c2.getCountryName()))
			c3=c2;
		for(Player temp:mylist)
		{
			if(temp.getCountry().equals(c3))
				System.out.println(temp.getPlayerName());
		}
		
	}

}
