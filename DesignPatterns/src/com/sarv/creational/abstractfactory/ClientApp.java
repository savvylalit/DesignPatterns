package com.sarv.creational.abstractfactory;

public class ClientApp {

	public static void main(String[] args) {
		GUIFactory guiFactory = GUIFactory.get(GUIConfig.WIN);
		Button b = guiFactory.createButton();
		b.render();
		CheckBox cb = guiFactory.createCheckbox();
		cb.render();
		
		guiFactory = GUIFactory.get(GUIConfig.MAC);
		b = guiFactory.createButton();
		b.render();
		cb = guiFactory.createCheckbox();
		cb.render();

	}

}
