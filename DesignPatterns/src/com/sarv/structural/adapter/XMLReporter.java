package com.sarv.structural.adapter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReporter implements Reporter {

	@Override
	public void display(Document doc) {
		doc.getDocumentElement().normalize();
		System.out.println("-----------Plain Text XML Report-----------");
		System.out.println("Root element: "+ doc.getDocumentElement().getNodeName());
		NodeList nodeList = doc.getElementsByTagName("instrument");
		for(int itr = 0; itr < nodeList.getLength(); itr++) {
			Node node = nodeList.item(itr);
			System.out.println("\nNode Name : "+node.getNodeName());
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) node;
				System.out.println("Ric : "+eElement.getElementsByTagName("ric").item(0).getTextContent());
				System.out.println("Quantity : "+eElement.getElementsByTagName("qty").item(0).getTextContent());
				System.out.println("Adv : "+eElement.getElementsByTagName("adv").item(0).getTextContent());
			}
		}
		System.out.println("-----------------------------------------");
	}

}
