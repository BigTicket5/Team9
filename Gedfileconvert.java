package com;

import java.io.IOException;

import org.gedcom4j.exception.GedcomParserException;
import org.gedcom4j.model.Family;
import org.gedcom4j.model.Gedcom;
import org.gedcom4j.model.Submitter;
import org.gedcom4j.model.enumerations.IndividualEventType;
import org.gedcom4j.parser.GedcomParser;

public class Gedfileconvert {
	
	private GedcomParser gp;
	public GedcomParser getGp() {
		return gp;
	}

	public void setGp(GedcomParser gp) {
		this.gp = gp;
	}

	public Gedfileconvert(String filepath) throws IOException, GedcomParserException{
		gp = new GedcomParser();
		gp.load(filepath);
	}
}