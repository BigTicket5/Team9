package com;



import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;




public class UserStory2 {

	

	public int NumberOfWife(String filepath) throws FileNotFoundException{

		int count=0;

		File file = new File(filepath);

		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {

            String line = input.nextLine();

            String[] lineArr = line.split(" ");

            String tagName = lineArr[1];

            if(tagName.equals("WIFE")) count++;

        }

		input.close();

		return count;

	}

	public int NumofPeoplewithname (String filepath, String surname) throws FileNotFoundException{

		int count=0;

		File file = new File(filepath);

		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {

            String line = input.nextLine();

            String[] lineArr = line.split(" ");

            String tagName = lineArr[1];

            if(tagName.equals("SURN"))
            {
            	if(lineArr[2].equals(surname)) count++;
            }

        }

		input.close();

		return count;

	}




}

