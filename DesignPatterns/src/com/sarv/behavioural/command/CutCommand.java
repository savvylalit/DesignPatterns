package com.sarv.behavioural.command;

public class CutCommand implements Command {

	TextEditor textEditor;
	ClipBoard clipBoard;
	
	public CutCommand(TextEditor textEditor, ClipBoard clipBoard) {
		this.textEditor = textEditor;
		this.clipBoard = clipBoard;
	}


	@Override
	public void execute() {
		String selection = textEditor.getSelection();
		clipBoard.setText(selection);
		textEditor.deleteSelection();
		System.out.println("Cut command :: ");
		System.out.println("--TextEditor Selection - " + textEditor.getSelection());
		System.out.println("--Text as ClipBoard - " + clipBoard.getText());

	}

}
