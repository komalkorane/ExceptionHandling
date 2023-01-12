package com.custom.exception;

public class CustomException extends Exception{

	 String message;
	   CustomException(String message) {
	      message = message;
	   }
	   public String toString() {
	      return ("Custom Exception Occurred : " + message);
	   }
	
}
