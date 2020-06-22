package com.sapient.abc;

public class Int_Array_process_runner {

	public static void main(String[] args) {
		Int_Array_process p=new Int_Array_process(4);
		Int_Array_process q=new Int_Array_process(p);
		Int_Array_process r=new Int_Array_process();
		System.out.println("scanning p array");//4 elements//
		p.readArray();

		System.out.println("scanning r array");//10 elements//
	    r.readArray();
	    System.out.println("Q array is:");
		q.displayHorizontal();
		System.out.println("P array is");
		p.displayverticle();
		System.out.println("Sorted r array is");
		r.Sort();r.displayHorizontal();
		System.out.println("Largest element of Q array is");
		q.biggest();
		System.out.println("smallest element of P array is");
		p.smallest();
		System.out.println(" Second largest element of R array is");
		q.secondlargest();
		p=null;q=null;r=null;
		System.gc();
	}

}
