package com.custom.exception;

public class MainException {

	 public static void main(String args[]) {
		 
	      try {
	    	  CustomException c = new CustomException("Komal");
	         throw new CustomException("This is a custom message");
	      } catch(CustomException e) {
	         System.out.println(e);
	      }
	   }
	
}
