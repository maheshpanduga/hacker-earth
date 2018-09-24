package com.hackerearth.playment;

import java.awt.FlowLayout;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LinuxPathTravesal {
	private final static PipedInputStream pin=new PipedInputStream(); 
	private final static PipedInputStream pin2=new PipedInputStream();
	
	public static void main(String s[]) throws Exception {  

		PipedOutputStream pout=new PipedOutputStream(pin);
		PipedOutputStream pout2=new PipedOutputStream(pin2);
		System.setOut(new PrintStream(pout,true)); 
		System.setErr(new PrintStream(pout2,true));
		
		System.out.println("Hello");
		
        JFrame frame = new JFrame("Linux Path Traversal");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("<Starting Your Application>");  
        label.setText("Hello");
        panel.add(label);  
        frame.add(panel);  
        frame.setSize(500, 500);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}
