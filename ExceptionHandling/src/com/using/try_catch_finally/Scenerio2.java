package com.using.try_catch_finally;

public class Scenerio2 {

	public static void main(String[] args) {

		int res=0;
		int nums[] = {10,20,30};
		try {
			res = 10/0;
			try {
				res = nums[3];
			}
			catch(ArithmeticException e) {
				System.out.println("inner catch");
			}
			finally {
				System.out.println("inner finally");
			}
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outer catch");
		}
		finally {
			System.out.println("outer finally");
		}

}
}
/// output---> outer finally
 //            default exception handling