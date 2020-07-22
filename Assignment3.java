package com.sapient.abc;


import java.util.Scanner;

public class Ps_assignment3 {

	
	public static void main(String[] args) 
	{
		int array[][]=new int[26][1]; int count=1;
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();
		
		for(int i=0;i<26;i++)
		{
			array[i][0]=count;
			count++;
			while(!isprime(count))
			{
				count++;		
				}
		}
		for (int i=0;i<p.length();i++)
		{
			int c = p.charAt(i);  
			c=c-65;
					String hex = Integer.toHexString(array[c][0]);
					System.out.println("" + hex);
		}
		
	
		

	}
	public static boolean isprime(int a)
	{
		int c=0;
	
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
				{c=1;break;}
		}
		if(c==1)
			return false;
		else
			return true;
		
	}

}
