package com.sarv.structural.adapter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLToJSONAdapter implements Reporter {
	AnalyticsLib library = new AnalyticsLib();
	
	@Override
	public void display(Document doc) {
		JSONObject json = adapt(doc);
		library.displayAnalytics(json);
	}
	
	private JSONObject adapt(Document doc) {
		JSONObject rootobj = new JSONObject();
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName("instrument");
		JSONArray jsonArr = new JSONArray();
		for(int itr = 0; itr < nodeList.getLength(); itr++) {
			Node node = nodeList.item(itr);
			Element eElement;
			JSONObject obj;
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				eElement = (Element)node;
				obj = new JSONObject();
				obj.put("adv", eElement.getElementsByTagName("adv").item(0).getTextContent());
				obj.put("qty", eElement.getElementsByTagName("qty").item(0).getTextContent());
				obj.put("ric", eElement.getElementsByTagName("ric").item(0).getTextContent());
				jsonArr.add(obj);
			}
		}
		rootobj.put("instruments", jsonArr);
		return rootobj;
		
	}

}
