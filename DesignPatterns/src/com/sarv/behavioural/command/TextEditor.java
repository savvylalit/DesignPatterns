package com.sarv.behavioural.command;

public class TextEditor {
	String selection;

	public TextEditor(String selection) {
		super();
		this.selection = selection;
	}

	public String getSelection() {
		return selection;
	}
	
	public void replaceSelection(String text) {
		this.selection = text;
	}
	
	public void deleteSelection() {
		this.selection = null;
	}
}
