package com.sapient.abc;

public class Matrix_runner {

	public static void main(String[] args) {
		Matrix p=new Matrix(3,3);
		Matrix q=new Matrix(p);
		Matrix r=new Matrix();
		Matrix s=new Matrix();

		p.readMatrix();
		int d[][];
		d=new int[3][3];
		
		System.out.println("Scanning matrix D");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				d[i][j]=Scan.z.nextInt();
			}
		}
		s.define(d);//Defining metrix
		
		System.out.println("Q matrix is");
	    q.display();//Display metrix//
	    System.out.println("Addition of P & D metrix");
	   
	    p.add(d);
	    s.scalar();
	    System.out.println("Multiplication of P & D metrix");
		   
	    p.multiply(d);
		p=null;q=null;r=null;s=null;
		System.gc();

	}

}
