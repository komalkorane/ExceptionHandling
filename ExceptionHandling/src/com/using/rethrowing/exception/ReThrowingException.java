package com.using.rethrowing.exception;

public class ReThrowingException {

	public static void main(String[] args) {
		System.out.println("Main method started!!!!!");
           try {
        	   m1(10,0);
           }
           catch(Exception e) {
        	   System.out.println("Exception handled in main!!!!");
           }
           System.out.println("Main method ended!!!!!");
	}

	private static void m1(int a, int b) {
           int res = 0;
           try {
        	   res = a/b;
           }
           catch(ArithmeticException e) {
        	   System.out.println("do some activity!!!!");
        	   throw e;
           }
	}

}
