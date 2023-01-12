package com.using.try_catch_finally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Scenerio4 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File f = new File("C:\\Users\\Komal\\eclipse-workspace\\ExceptionHandling\\src\\com\\using\\try_catch_finally\\a.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
		 
	    System.out.println(f.exists());
	    System.out.println(f.getName());
//	    System.out.println(f.lastModified());
	    
	 
	  
	    String data = br.readLine();
	    String []words = data.split(" ");
	    System.out.println("data from file is : "+data);
	    System.out.println("Words : "+Arrays.toString(words));
	    br.close();
	    fr.close();
	    
		}
		catch(FileNotFoundException e) {
			System.out.println("can not find file!!!!!");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("can not read file!!!!!");
		}
		catch(Exception e) {
			System.out.println(" find exception!!!!!");
			e.printStackTrace();
		}
//		finally {
//			try {
//				br.close();
//				fr.close();
//			}
//			catch(IOException e) {
//				System.out.println("can not read file!!!!!");
//			}
//			catch(Exception e) {
//				System.out.println(" find exception!!!!!");
//				e.printStackTrace();
//			}
//			System.out.println("end @!!");
//		}
	}

}
