package com.using.wrapping.exception.object;

class APIException extends Exception{

//	public APIException() {
//		super();
//	}
//	public APIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//	}

//	public APIException(String message, Throwable cause) {
//		super(message, cause);
//	}
//	public APIException(String message) {
//		super(message);
//	}
	public APIException(Throwable cause) {
		super(cause);
	}
}

public class WrappingException {

	public static void main(String[] args) throws APIException {
		m1(10,0);
		
	}

	private static void m1(int a, int b) throws APIException {
		int res = 0;
		try {
			res = a/b;
		}
		catch(ArithmeticException e) {
			throw new APIException(e);
		}
		System.out.println(res);
	}
	
}
