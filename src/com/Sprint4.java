package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Sprint4 {
	 
	public void ListFirstName(String filepath) throws FileNotFoundException{
		File file = new File(filepath);
		HashSet<String> hs = new HashSet<String>();
		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {

            String line = input.nextLine();

            String[] lineArr = line.split(" ");

            String tagName = lineArr[1];

            if(tagName.equals("GIVN")) hs.add(lineArr[2]); 
        }
		for(String x:hs)
		{
			System.out.print(x+" ");
		}
		input.close();
	}
	
	public void ListLastName(String filepath) throws FileNotFoundException{
		File file = new File(filepath);
		HashSet<String> hs = new HashSet<String>();
		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {

            String line = input.nextLine();

            String[] lineArr = line.split(" ");

            String tagName = lineArr[1];

            if(tagName.equals("SURN")) hs.add(lineArr[2]); 

        }
		for(String x:hs)
		{
			System.out.print(x+" ");
		}

		input.close();
	}
}
