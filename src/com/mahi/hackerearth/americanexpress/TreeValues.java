package com.mahi.hackerearth.americanexpress;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TreeValues {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder output = new StringBuilder();
		Node root = null;
		TreeValues t = new TreeValues();
		for (int index = 0; index < N - 1; index++) {
			int[] edges = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			
			if(index == 0){
				root = t.new Node(edges[0]);
				Node child = t.new Node(edges[1]);
				
				List<Node> children = new ArrayList<TreeValues.Node>();
				children.add(child);
				root.setChildren(children);
			}else{
				Node parent  = t.new Node(edges[0]);
				Node child = t.new Node(edges[1]);
				
				addNode(root, parent, child);
			}
			
			//output.append(Arrays.toString(edges) + "\n");

		}
		
		System.out.println(output.toString());
	}
	
	public static void addNode(Node root, Node parent, Node child){
		boolean isSetDone = false;
		while(!isSetDone){
			List<Node> children = root.getChildren();
			Iterator<Node> cItr = children.iterator();
			while (cItr.hasNext()) {
				Node node = cItr.next();
				add(node, parent, child);
			}
		}
	}
	
	public static void add(Node root, Node parent, Node child) {
		if(root.getValue() == parent.getValue()){
			List<Node> cchildren = root.getChildren()!=null ? root.getChildren() : new ArrayList<Node>();
			cchildren.add(child);
			root.setChildren(cchildren);
		}
		else{
			List<Node> children = root.getChildren();
			if(children == null){
				children = new ArrayList<Node>();
				children.add(child);
			}else{
				for (Node node : children) {
					if(node.getValue() == parent.getValue()){
						List<Node> cchildren = root.getChildren();
						cchildren.add(child);
						root.setChildren(cchildren);
						break;
					}
					
					if(node.getChildren() != null)
						add(node, parent, child);
				}
			}
		}
	}

	class Node {
		
		public Node(int value) {
			this.value = value;
		}

		int value;
		List<Node> children;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public List<Node> getChildren() {
			return children;
		}

		public void setChildren(List<Node> children) {
			this.children = children;
		}

	}
}
