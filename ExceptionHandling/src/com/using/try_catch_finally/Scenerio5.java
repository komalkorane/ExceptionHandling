package com.using.try_catch_finally;

public class Scenerio5 {

	public static void main(String[] args) {

		System.out.println("main method started!!!!");
		int res=0;
		int nums[] = {10,20,30};
		try {
			res = 10/0;
		}
	    catch(ArithmeticException e) {
			System.out.println("inside ArithmeticException!!!!");
	    }
		finally {
			System.out.println("outer finally!!!!");
			try {
				Thread.sleep(0);
			}
			catch(InterruptedException e) {
				System.out.println("inside InterruptedException!!!!");
			}
		}
	    System.out.println("main method ended!!!!");

}
}
/// output---> main method started
 //            inside ArithmeticException
 //            outer finally
 //            main method ended