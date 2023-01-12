package com.using.try_with_resource;

 class Test11 implements AutoCloseable{

	
	public void hello() {
	System.out.println("inside hello!!!");

	}
	@Override
	public void close() throws Exception {
        System.out.println("inside Scenerio2 hello method!!!!");		
	}

}
public class Scenerio2{
	
	public static void main(String[] args) {
		try(Test11 s = new Test11();)
		{
			s.hello();
		}
		catch(Exception e) {
			System.out.println("Exception catched!!!!");
		}
		finally {
			System.out.println("finally executed!!!1");
		}
	}
}
