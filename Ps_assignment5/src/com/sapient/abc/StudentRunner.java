package com.sapient.abc;

import java.util.Arrays;

public class StudentRunner {

	
	public static void main(String[] args) {
		int n=Scan.z.nextInt();
	Student st[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter id,name,city of student");
			 st[i]=new Student(Scan.z.nextInt(),Scan.z.next(),Scan.z.next());
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i]);
		}	
		System.out.println("Enter any city name");
		String city=Scan.z.next();

		System.out.println("Following students belong to city "+city);
		for(int i=0;i<n;i++)
		{
			if(st[i].getCity().equals(city))
				System.out.println(st[i].getName());
		}

		System.out.println("List of students sorted by name");
		Arrays.sort(st,new Sortedbyname());
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i]);
		}

		System.out.println("List of students sorted by City name");
		Arrays.sort(st,new Sortedbycity());
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println(" Enter any student id to display details");
		try
		{
			
		int c=1;
			int x=Scan.z.nextInt();
			for(int i=0;i<n;i++)
			{
				if(x==st[i].getId())
					{
					System.out.println(st[i].getName()+" "+st[i].getCity());
					c=0;break;
					}
					
			}
			if(c==1)
				throw new NullPointerException();
			
		}
		catch(NullPointerException e)
		{
			System.out.println("ID not found");
		}
		
	
		
	}
	

	
	
	
	

	

}


