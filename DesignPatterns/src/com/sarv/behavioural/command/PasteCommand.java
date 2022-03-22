package com.sarv.behavioural.command;

public class PasteCommand implements Command {

	TextEditor textEditor;
	ClipBoard clipBoard;
	
	public PasteCommand(TextEditor textEditor, ClipBoard clipBoard) {
		this.textEditor = textEditor;
		this.clipBoard = clipBoard;
	}

	@Override
	public void execute() {
		String newText = clipBoard.getText();
		textEditor.replaceSelection(newText);
		clipBoard.setText(null);
		System.out.println("Paste command :: ");
		System.out.println("--TextEditor Selection - " + textEditor.getSelection());
		System.out.println("--Text as ClipBoard - " + clipBoard.getText());


	}

}
