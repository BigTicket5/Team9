package com;

import java.io.IOException;

import org.gedcom4j.exception.GedcomParserException;
import org.gedcom4j.model.Family;
import org.gedcom4j.model.Gedcom;
import org.gedcom4j.model.Submitter;
import org.gedcom4j.parser.GedcomParser;

public class Gedfileconvert {
	
	private GedcomParser gp;
	public Gedfileconvert(String filepath) throws IOException, GedcomParserException{
		gp = new GedcomParser();
		gp.load(filepath);
	}
	
	public static void main(String args[]) throws IOException, GedcomParserException{
		Gedfileconvert gfc = new  Gedfileconvert("Myfamily.ged");
		Gedcom g = gfc.gp.getGedcom();
		@SuppressWarnings("unused")
		Submitter submitter = null;
		if (!g.getSubmitters().isEmpty()) {
		    submitter = g.getSubmitters().values().iterator().next();
		}
		for (Family f : g.getFamilies().values()) {
		    if (f.getHusband() != null && f.getWife() != null) {
		        System.out.println(f.getHusband().getIndividual().getNames().get(0).getBasic()
		                + " married " + f.getWife().getIndividual().getNames().get(0).getBasic());
		    }
		}
	}

}