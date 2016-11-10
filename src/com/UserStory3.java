package com;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.gedcom4j.exception.GedcomParserException;
import org.gedcom4j.model.Family;
import org.gedcom4j.model.Gedcom;
import org.gedcom4j.model.Individual;
import org.gedcom4j.query.Finder;
import org.gedcom4j.relationship.AncestryCalculator;
import org.gedcom4j.relationship.Relationship;
import org.gedcom4j.relationship.RelationshipCalculator;

public class UserStory3 {
	public Gedfileconvert gc;
	public UserStory3(String filepath) throws IOException, GedcomParserException{
		gc = new Gedfileconvert(filepath);
	}
	
	public void printRelationship(String firstname,String lastname){
		Gedcom g = gc.getGp().getGedcom();
		 RelationshipCalculator rc = new RelationshipCalculator();
		 Finder f = new Finder(g);
	        List<Individual> results = f.findByName(lastname,
	        		firstname);
	        Individual grandpaHarrah = results.get(0);
	 
	        // Go through every person in the file...
	        for (Individual i : g.getIndividuals().values()) {
	            // ...calculate their relationship(s) to the starting person
	            // in simplest form available...
	            rc.calculateRelationships(grandpaHarrah, i, true);
	 
	            // .. and print them to stdout
	            System.out.println(i.getFormattedName());
	            for (Relationship r : rc.getRelationshipsFound()) {
	                System.out.println("   " + r);
	            }
	        }
	}
	
	public void CouplesWithCommonAncestor(){
		Gedcom g = gc.getGp().getGedcom();
		AncestryCalculator ac = new AncestryCalculator();
		for (Family f : g.getFamilies().values()) {
            // Only process families where we know both the husband and
            // the wife
            if (f.getHusband() != null && f.getWife() != null) {
                // Get the nearest common ancestor(s), if any, between
                // the husband and wife
                Set<Individual> common = ac.getLowestCommonAncestors(f
                        .getHusband().getIndividual(), f.getWife().getIndividual());
 
                if (!common.isEmpty()) {
                    // We have a couple with common ancestors. Show
                    // them.
                    System.out.println(f.getHusband().getIndividual().getFormattedName()
                            + " and " + f.getWife().getIndividual().getFormattedName()
                            + " have " + common.size()
                            + " common ancestor(s):");
                    int commonAncNumber = 0;
                    for (Individual i : common) {
                        commonAncNumber++;
                        System.out.println("\t" + commonAncNumber + ") "
                                + i);
                    }
 
                    System.out.println();
                }
                else
                {
                	System.out.println("There are no couples with common ancestor in  family :"+f.toString());
                }
            }
        }
		 
	}
	
}
