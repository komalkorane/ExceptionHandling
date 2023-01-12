package com.using.try_with_resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Scenerio1 {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader(new File("C:\\Users\\Komal\\eclipse-workspace\\ExceptionHandling\\src\\com\\using\\try_catch_finallys\\a.txt"));
//		try(FileReader fr = new FileReader(new File(""));		
				BufferedReader br = new BufferedReader(fr);
				)
		{
			String data = br.readLine();
			System.out.println(data);
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found!!!!");
		}
		catch(IOException e) {
			System.out.println("IO exception");
		}
		catch(Exception e) {
			System.out.println(" exception");
		}
	}

}
