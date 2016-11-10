package com;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.gedcom4j.exception.GedcomParserException;

public class TestClass {
	public static void main(String args[]) throws IOException, GedcomParserException{
		CountFandM fm = new CountFandM();
		String filepath="Myfamily.ged";
//		int nof = fm.getFemaleN(filepath);
//		int nom = fm.getMaleN(filepath);
//		System.out.println("The number of female in the family is "+nof );
//		System.out.println("The number of male in the family is "+ nom );
//		UserStory us = new UserStory();
//		int noc = us.NumberOfChildren(filepath);
//		int nomarry = us.NumberOfMarried(filepath);
//		System.out.println("The number of children in the family is "+ noc );
//		System.out.println("The number of married people in the family is "+ nomarry );
//		Sprint2 sp= new Sprint2();
//		int nod = sp.NumDivorce(filepath);
//		System.out.println("The number of divorce in the family is "+ nod );
//		int nodeath = sp.NumDeath(filepath);
//		System.out.println("The number of death in the family is "+ nodeath );
//		
//		UserStory2 us2 = new UserStory2();
//		int now = us2.NumberOfWife(filepath);
//		
//		System.out.println("The number of wife in the family is " + now);
//		
//		String name = "Satyanarayana";
//		
//		int noname  = us2.NumofPeoplewithname(filepath, name);
//		System.out.println("The number of ppl with family name " + name + " is "+noname );
		
		Sprint3 sp3 = new Sprint3(filepath);
		sp3.PrintMarried();
		
		System.out.println("***************************************************************");
		
		System.out.println("The birthday of Somasundara Tumkur is "+ sp3.getbodByName("Somasundara", "Tumkur"));
		
		System.out.println("***************************************************************");
		
		System.out.println("Here is relationship between Somasundara Tumkur and all the people in the family ");
		UserStory3 us3 = new UserStory3(filepath);
		us3.printRelationship("Somasundara", "Tumkur");
		System.out.println("***************************************************************");
		us3.CouplesWithCommonAncestor();
	}
}
