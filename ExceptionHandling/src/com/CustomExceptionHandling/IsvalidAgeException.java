package com.CustomExceptionHandling;

public class IsvalidAgeException extends RuntimeException {

	public IsvalidAgeException() {
		super();
	}

	public IsvalidAgeException(String message) {
		super(message);
	}
	
}
