package com.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node root = null;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(7);
		array.add(9);
		array.add(8);
		array.add(4);
		
		root = add(root, array);
		print(root);
		root = reverse(root);
		print(root);
	 }
	
	private static Node add(Node node, ArrayList<Integer> list){
		Node current = node;
		Node head = node;
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext()){
			if(head==null){
				head = new Node();
				head.data = it.next();
				head.next=null;
				node = head;
			}
			else{
				current = new Node();
				current.data = it.next();
				current.next = null;
				node.next = current;
				node = node.next;
			}
		}
		return head;
	}
	
    private static void print(Node node) {
		if(node!=null){
			while(node.next!=null){
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println(node.data);
		}
		else{
			System.out.println("No elements in the linkedList.");
		}
	}
    
    private static Node reverse(Node root){
    	Node reverseHead = null;
    	Node current, next;
    	current = root; //3
    	while(current!=null){
    		next = current.next; //7, 9
    		current.next = reverseHead; //null - before, 3
    		reverseHead = current; //before at current, 7
    		current = next; // current is at next, 9
    	}
    	return reverseHead;
    }

}
