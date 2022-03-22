package com.sarv.creational.abstractfactory;

public class MacFactory extends GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new MacCheckbox();
	}

}
