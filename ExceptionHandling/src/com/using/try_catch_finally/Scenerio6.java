package com.using.try_catch_finally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Scenerio6 {

	public static void main(String[] args) {
		try {
		File f = new File("C:\\Users\\Komal\\eclipse-workspace\\ExceptionHandling\\src\\com\\using\\try_catch_finally\\a.txt"); 
//	    System.out.println(f.exists());
//	    System.out.println(f.getName());
//	    System.out.println(f.lastModified());
	    
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
	    String data = br.readLine();
	    String []words = data.split(" ");
	    System.out.println("data from file is : "+data);
	    System.out.println("Words : "+Arrays.toString(words));
	    br.close();
	    fr.close();
	    
		}
		catch(FileNotFoundException e) {
			System.out.println("can not find file!!!!!");
		}
		catch(IOException e) {
			System.out.println("can not read file!!!!!");
		}
		catch(Exception e) {
			System.out.println(" find exception!!!!!");
		}
	}

}
