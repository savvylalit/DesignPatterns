package com.sarv.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyServer implements Server {

	private RealServer realServer = new RealServer(); 
	static List<String> blockedUrls;
	
	static {
		blockedUrls = new ArrayList();
		blockedUrls.add("http://url1");
		blockedUrls.add("http://url2");
		blockedUrls.add("http://url3");
	}
	
	@Override
	public void visit(String url) {
		if(blockedUrls.contains(url)) {
			System.out.println("Access to "+url+" is prohibited");
		}else {
			realServer.visit(url);
		}
	}

}
