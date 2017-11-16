package com.revature.xml.parsers;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX {
	/*
	 * SAX XML Parser in JAVA:
	 * SAX stands for Simple API for XML Parsing
	 * This is an event based XML parser and it parses
	 * the XML file step by step. It is much more suitable
	 * for larger XML files. SAX XML Parser fires an 
	 * event when it encounters an opening tag, element,
	 * or attribute, and parses accordingly
	 */
	static String filename = "src/com/revature/xml/people.xml";
	public static void main(String[] args) {
		try{
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sax = spf.newSAXParser();
			
			DefaultHandler handler = new DefaultHandler(){
				boolean fn = false;
				boolean ln = false;
				boolean age = false;
				
				public void startElement(String uri, String localname, String name, Attributes attributes){
					System.out.println("START ELEMENT: " + name);
					if(name.equalsIgnoreCase("FIRSTNAME")) fn = true;
					if(name.equalsIgnoreCase("LASTNAME")) ln = true;
					if(name.equalsIgnoreCase("AGE")) age = true;
				}
				
				public void endElement(String uri, String localname, String name) throws SAXException{
					System.out.println("END ELEMENT: " + name);
				}
				
				public void characters(char[] ch, int start, int length) throws SAXException{
					if(fn){ System.out.println("First name: " + new String(ch, start, length)); fn = false; }
					if(ln){ System.out.println("Last name: " + new String(ch, start, length)); ln = false; }
					if(age){ System.out.println("Age: " + new String(ch, start, length)); age = false; }
				}
			};
			
		sax.parse(filename, handler);

		}catch(ParserConfigurationException | SAXException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
