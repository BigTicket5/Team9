/* Note: Team9 */

package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFandM {
	
	public int getFemaleN(String filepath) throws FileNotFoundException{
		int count=0;
		File file = new File(filepath);
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            String tagName = lineArr[1];
            if(tagName.equals("SEX"))
            {
            	String gender = lineArr[2];
            	if(gender.equals("F")) count++;
            }
        }
		input.close();
		return count;
	}
	public int getMaleN(String filepath) throws FileNotFoundException{
		int count=0;
		File file = new File(filepath);
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            String tagName = lineArr[1];
            if(tagName.equals("SEX"))
            {
            	String gender = lineArr[2];
            	if(gender.equals("M")) count++;
            }
        }
		input.close();
		return count;
	}

}
