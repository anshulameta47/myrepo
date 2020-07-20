package com.sapient.abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Num_Process_runner 
{ 
    public static void main(String args[]) 
    { System.out.println("enter two numbers");
    	int p=Scan.z.nextInt();
    	int q=Scan.z.nextInt();
    	System.out.println("Enter 0,1,2,3 for Add,Subtract,Multiply,Divide respectively");

    	int r=Scan.z.nextInt();
    	Map<Integer,Num_process> m=new HashMap<Integer,Num_process>();
    	m.put(0,  new Add());
    	m.put(1,   new subtract());
    	m.put(2, new multiply());
    	m.put(3,  new divide());
    	System.out.println("output is:");
    	 System.out.println(m.get(r).calc(p, q));
       
    }
}