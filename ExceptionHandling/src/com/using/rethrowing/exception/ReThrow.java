package com.using.rethrowing.exception;

public class ReThrow {

	public static void main(String[] args) {
             methodWithThrow();
	}

	private static void methodWithThrow() {
		System.out.println("method started!!!!");
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Rethrow the object!!!!");
			throw e;
		}
		System.out.println("method ended!!!!");
	}

}
