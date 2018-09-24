package com.hackerearth.playment;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.DefaultStyledDocument;

public class Test {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("Linux Path Traversal"); 
		JTextPane pane = new JTextPane();
		pane.setEditable(true);
		DefaultStyledDocument document = (DefaultStyledDocument) pane.getDocument();
		document.insertString(document.getEndPosition().getOffset(), "Hello you can't edit this!", null);
		frame.add(pane);
	}
}
