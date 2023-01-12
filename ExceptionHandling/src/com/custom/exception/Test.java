package com.custom.exception;

public class Test {

	public static void main(String[] args) {
		
	
	Voter v = new Voter("Komal",25);
	Voter v1 = new Voter("Jagruti",5);
	
	String res = validVoter(v1) ? "Valid voter" : "Invalid voter";
System.out.println(v1.getName()+" "+"is "+res );
	
}


private static boolean validVoter(Voter v1) {
	if(v1.getAge() >= 18) {
		return true;}
	else {
		throw new IsValidAgeEception("Invalid age");
}}
}