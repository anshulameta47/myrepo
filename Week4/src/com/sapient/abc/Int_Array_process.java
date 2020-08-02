package com.sapient.abc;

import java.util.Arrays;

public class Int_Array_process {
	int size=10,a[];
	
	public Int_Array_process()
	{
		
		a=new int[size];
	}
	public Int_Array_process(int size)
	{
		this.size=size;
		a=new int [size];
	}
	public void define(int p[] )
	{
		size=p.length;
		a=new int [p.length];
		a=p;
	}
	public Int_Array_process(Int_Array_process p)
	{
		size=p.size;
		a=p.a;
		
	}
	public void readArray()
	{
		for(int i=0;i<size;i++)
			a[i]=Scan.z.nextInt();
	}
	public void displayHorizontal()
	{
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
	public void displayverticle()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void Sort()
	{
		Arrays.sort(a);
	
		
	}
	public void biggest()
	{
		Sort();
		System.out.println(a[size-1]);
	}
	public void smallest()
	{
		Sort();
		System.out.println(a[0]);
	
	}
	public void secondlargest()
	{
		int c=1;
		for(int i=size-2;i>=0;i--)
		{
			if(a[i]!=a[size-1])
				{System.out.println(a[i]);c=0;break;}
		}
		if(c==1)
			System.out.println("second largest not exist");
		
	}
	public void finalize()
	{
		size=0;
		a=null;
		System.out.println("I am in destructor");
	}

	
	
	
	

}