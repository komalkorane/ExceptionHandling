package com.CustomExceptionHandling;

public class CustomException {

	public static void main(String[] args) {

		System.out.println("main method started!!!!!");
		
		Voter v = new Voter("Komal",25,"India",1111);
		Voter v1 = new Voter("Shree",13,"India",0000);
		Voter v2 = new Voter("Madhuri",28,"India",3333);
		
		String res = isValidVoter(v1) ? "valid voter" : "Invalid Voter";
		System.out.println(v1.name+ " is "+ res);  
		System.out.println("main method ended!!!!");
		
	}
	private static boolean isValidVoter(Voter v1) {
		if(v1.age >= 18) {
			return true;
		}
		else
		{
			throw new IsvalidAgeException("Invalid age");
//			return false;
		}
	}
}
