package com.sapient.abc;

public class subtract implements Num_process {
	int x,y,z;

	public int  calc(int x,int y)
	{
	Num_process p=(int d,int f)->d-f;
	z=p.calc(x, y);
	return z;
	
	}
	}