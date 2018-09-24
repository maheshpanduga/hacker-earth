package com.mahi.hackerearth.ds;

import java.io.PrintStream;

public class BinaryTreeTest {
	public static void main(String[] args) throws Exception {
		PrintStream fileStream = new PrintStream("D:/tmp/output.txt");
		System.setOut(fileStream);
		BinaryTree binaryTree = new BinaryTree();
	    
	    /*for (int i = 1; i <= 5; i++) {
	    	int data = i;
	    	binaryTree.add(data);
		}*/
		binaryTree.add(10);
		binaryTree.add(5);
		binaryTree.add(19);
		binaryTree.add(1);
		binaryTree.add(6);
		binaryTree.add(17);
		
		binaryTree.display();
	}
}
