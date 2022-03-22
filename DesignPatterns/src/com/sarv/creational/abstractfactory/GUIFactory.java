package com.sarv.creational.abstractfactory;

public abstract class GUIFactory {
	public static GUIFactory get(GUIConfig config) {
		switch (config) {
		case WIN:
			return new WinFactory();
		case MAC:
			return new MacFactory();
		default:
			System.out.println("Error!! Unknown config..");
			return null;
		}
	}
	public abstract Button createButton();
	public abstract CheckBox createCheckbox();
}
