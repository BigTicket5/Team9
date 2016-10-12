/* Team */

package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserStory {
	
	public int NumberOfChildren(String filepath) throws FileNotFoundException{
		int count=0;
		File file = new File(filepath);
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            String tagName = lineArr[1];
            if(tagName.equals("CHIL")) count++;
        }
		input.close();
		return count;
	}
	public int NumberOfMarried(String filepath) throws FileNotFoundException{
		int count=0;
		File file = new File(filepath);
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] lineArr = line.split(" ");
            String tagName = lineArr[1];
            if(tagName.equals("_MARNM")) count++;
        }
		input.close();
		return count;
	}

}

