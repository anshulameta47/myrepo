package com.sapient.abc;

public class Threadrunner {
	public static void main(String args[]){  

		Resourcelock lock=new Resourcelock();
		  Threa t=new Threa(lock);
		  Thr t1=new Thr(lock);
		     
   t.start();
   t1.start();
}
}
