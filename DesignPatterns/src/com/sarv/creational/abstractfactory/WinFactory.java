package com.sarv.creational.abstractfactory;

public class WinFactory extends GUIFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new WinCheckbox();
	}

}
