package com.sarv.structural.adapter;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class AdapterClient {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"\\src\\com\\sarv\\structural\\adapter";
		File file = new File(path+"\\stock.xml");
		Document doc = readXmlData(file);
		displayPlainXmlReport(doc);
		System.out.println();
		displayAnalyticalJSONReport(doc);

	}

	private static void displayAnalyticalJSONReport(Document doc) {
		Reporter reporter = new XMLToJSONAdapter();
		reporter.display(doc);		
	}

	private static void displayPlainXmlReport(Document doc) {
		Reporter reporter = new XMLReporter();
		reporter.display(doc);
	}

	private static Document readXmlData(File file) {
		Document doc = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			doc = db.parse(file);
		}catch(SAXException | IOException e) {
			e.printStackTrace();
		}catch(ParserConfigurationException e) {
			e.printStackTrace();
		}
		return doc;
	}

}
