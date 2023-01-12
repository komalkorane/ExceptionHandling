package com.using.try_catch_finally;

public class Scenerio3 {

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
			
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outer catch");
		}
	

}
}
/// output--->
 //            default exception handling