package com.sapient.abc;

import java.io.File;

public class Files {

	public static void main(String[] args) {

		 File dir = new File("");
	      String[] d = dir.list();
	      
	      if (d == null) {
	         System.out.println( "Either dir does not exist or is not a directory");
	      } else { 
	         for (int i = 0; i< d.length; i++) {
	            String filename = d[i];
	            System.out.println(filename);
	         }
	      }
	   }
	

}
