package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sprint2 {
	public int NumDivorce(String filepath) throws FileNotFoundException{
		int count=0;
		File file = new File(filepath);
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            String tagName = lineArr[1];
            if(tagName.equals("DIV"))
            {
            	count++;
            }
        }
		input.close();
		return count;
	}
	public int NumDeath(String filepath)throws FileNotFoundException{
		int count=0;
		File file = new File(filepath);
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            String tagName = lineArr[1];
            if(tagName.equals("DEAT"))
            {
            	count++;
            }
        }
		input.close();
		return count;
	}
}
