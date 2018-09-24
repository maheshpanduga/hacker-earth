package com.mahi.hackerearth.ds;

public class AVLTree {

	private Node root;

	public void add(int data) {
		insert(root, data);
	}

	private void insert(Node node, int data) {
		if (node == null)
			node = new Node(data);

		if (data < node.data)
			insert(node.getLeft(), data);
		else if (data >= node.data)
			insert(node.getRight(), data);
	}
	
	private int getHeight(Node node){
		
		return 0;
	}

	class Node {
		private int data;

		public Node(int data) {
			this.data = data;
		}

		private Node left;
		private Node right;
		private int height = 1;

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

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
	}
}
