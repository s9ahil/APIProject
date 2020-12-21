package org.testing.runner;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testing.TestScripts.DeleteRequestTC;
import org.testing.TestScripts.GetRequestTC;
import org.testing.TestScripts.GetRequestWithQueryparameter;
import org.testing.TestScripts.PostRequestTC;
import org.testing.TestScripts.PutRequestTC4;
import org.testing.utilities.XMLParsing;
import org.xml.sax.SAXException;

public class RunnerClass {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
	/*	 PostRequestTC post = new PostRequestTC();
		 post.tc1();
	     
		 GetRequestTC get= new GetRequestTC();
		 get.tc2(); 
		 
		 GetRequestWithQueryparameter query =new GetRequestWithQueryparameter();
		 query.tc3();
		 
		 PutRequestTC4 put =new PutRequestTC4();
		 put.tc4();
		 
		 DeleteRequestTC del =new DeleteRequestTC();
		 del.tc5(); */
		 
		XMLParsing x =new XMLParsing();
		x.XMLhandling("C:\\Users\\sahil\\eclipse-workspace\\XML\\responsedata.xml","title");
		
	}
}
 