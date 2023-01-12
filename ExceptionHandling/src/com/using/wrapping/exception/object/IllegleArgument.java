package com.using.wrapping.exception.object;

import java.util.ConcurrentModificationException;

public class IllegleArgument {
	public static void main(String[] args) {
		m1();
	}

	public static boolean m1() {

		String name = null;
		try {
			
			return name.equals("komal");
		}
		catch(Exception e) {
//			throw new IllegalArgumentException(e);
			throw new ConcurrentModificationException(e);
		}
		
		
		
	}

} 