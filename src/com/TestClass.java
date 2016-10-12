package com;

import java.io.FileNotFoundException;

public class TestClass {
	public static void main(String args[]) throws FileNotFoundException{
		CountFandM fm = new CountFandM();
		String filepath="Myfamily.ged";
		int nof = fm.getFemaleN(filepath);
		int nom = fm.getMaleN(filepath);
		System.out.println("The number of female in the family is "+nof );
		System.out.println("The number of male in the family is "+ nom );
		UserStory us = new UserStory();
		int noc = us.NumberOfChildren(filepath);
		int nomarry = us.NumberOfMarried(filepath);
		System.out.println("The number of children in the family is "+ noc );
		System.out.println("The number of married people in the family is "+ nomarry );
	}
}
