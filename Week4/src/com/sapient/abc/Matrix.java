package com.sapient.abc;

public class Matrix {

	int r,c,a[][];
	public Matrix()
	{
		r=3;c=3;
		a=new int[r][c];
	}
	public Matrix(int r)
	{
		this.r=r;this.c=r;
		a=new int[r][c];
	}
	public Matrix(int r,int c)
	{
		this.r=r;this.c=c;
		a=new int[r][c];
	}
	public void define(int p[][])
	{
		r=p.length;
		c=p[0].length;
		a=new int [r][c];
		a=p;
	}
	public Matrix(Matrix p)
	{
		r=p.r;
		c=p.c;
		a=new int [r][c];
		a=p.a;
	}
	public void readMatrix()
	{
		System.out.println("Scanning matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				a[i][j]=Scan.z.nextInt();
		}
	}
	public void display()
	{
		System.out.println("matrix :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.printf("%d ",a[i][j]);
		System.out.println();
		}
		
	}
	public void add(int d[][])
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				a[i][j]+=d[i][j];
		
		}
		display(); 
	}
	public void scalar()
	{
		int p=1;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if((i==j&&a[i][j]==1)||(i!=j && a[i][j]==0))
				{
					continue;
				}
				else
				{
					p=0;break;
				}
			}
			if(p==0)
				break;
		
		}
		if(p==1)
			System.out.println("it is scalar");
		else
			System.out.println("it is not scalar");
	}
	public void multiply(int d[][])
	{
		int x[][];
		x=new int[r][d[0].length];
		for(int  i=0;i<r;i++)
		{
			for(int j=0;j<d[0].length;j++)
			{
				for(int k=0;k<c;k++)
				{
					x[i][j]+=a[i][k]*d[k][j];
				}
			}
		}
		define(x);
		display();

	}
	public void finalize()
	{
		r=0;c=0;
		a=null;
		System.out.println("I am in destructor");
	}
	
	
}
