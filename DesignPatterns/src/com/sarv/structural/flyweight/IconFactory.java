package com.sarv.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
	private static Map<String, ColorIcon> colorIconMap = new HashMap<>();
	
	public static ColorIcon getIcon(String color) {
		if(!colorIconMap.containsKey(color)) {
			ColorIcon icon = new ColorIcon(color);
			colorIconMap.put(color, icon);
		}
		return colorIconMap.get(color);
	}
}
