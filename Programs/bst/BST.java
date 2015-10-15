package com.bst;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

public class BST {
	public static void main(String[] args) {
		Node root = null;
		insert(root, 7);
		insert(root, 4);
		insert(root, 9);
		insert(root, 5);
		insert(root, 3);
		insert(root, 8);
		insert(root, 10);
		insert(root, 2);
		insert(root, 6);
	}

	private static Node insert(Node root, int data) {
		if(root == null)
			root = new Node(8);
		
		if(data < root.data)
			root.left = insert(root.left, data);
		if(data > root.data)
			root.right = insert(root.right, data);
		
		return root;
	}
	
	
	
}
