package com.mahi.hackerearth.ds;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	private Node root;
	
	public void add(int data) {
		root = insert(root, data);
	}
	
	public void display() {
		System.out.print("InOrder = ");
		inOrder(root);
		
		System.out.println();
		System.out.print("PreOrder = ");
		preOrder(root);
		
		System.out.println();
		System.out.print("PostOrder = ");
		postOrder(root);
		
		System.out.println();
		System.out.print("LevelOrder = ");
		levelOrder(root);
	}
	
	private void inOrder(Node node) {
		if(node == null)
			return;
		
		inOrder(node.getLeft());
		
		System.out.print(node.getValue()+" ");
		
		inOrder(node.getRight());
	}
	
	private void preOrder(Node node) {
		if(node == null)
			return;
		
		System.out.print(node.getValue()+" ");
		
		preOrder(node.getLeft());
		
		preOrder(node.getRight());
	}
	
	private void postOrder(Node node) {
		if(node == null)
			return;
		
		postOrder(node.getLeft());
		
		postOrder(node.getRight());
		
		System.out.print(node.getValue()+" ");
	}
	
	private void levelOrder(Node node){
		Queue<Node> queue = new LinkedList<Node>();
		if(node == null)
			return;
		
		queue.add(node);
		while (!queue.isEmpty()) {
			/*int nodesCount = queue.size();
			while(nodesCount > 0){*/
				Node n = queue.remove();
				System.out.print(n.getValue() + " ");
				if(n.getLeft() != null)
					queue.add(n.getLeft());
				if(n.getRight() != null)
					queue.add(n.getRight());
				
			/*	nodesCount--;
			}*/
		}
	}
	
	private Node insert(Node node, int data) {
		
		if(node == null){
			node = new Node();
			node.setValue(data);
			return node;
		}
		
		if(data >= node.getValue())
			node.setRight(insert(node.getRight(), data));
		else if(data < node.getValue())
			node.setLeft(insert(node.getLeft(), data));
		
		return node;
	}
	
	class Node {
		private int value;
		private Node left;
		private Node right;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

	}
}
