package com.dsa.surya.bst;

import java.util.Scanner;

public class LinkedList {
	private static Scanner scanner = new Scanner(System.in);
	Node head;
	
	public void createBst() {
		String choice;
		int value;
		do {
			System.out.println("Enter the value you want to enter");
			value = scanner.nextInt();
			insertNode(value);
			System.out.println("Do you want to insert more \"Node\" ?");
			choice = scanner.next();
		}while("y".equals(choice) || "Y".equals(choice));
	}
	
	public void insertNode(Integer value) {
		Node node = new Node();
		node.data = value;
		node.left = null;
		node.right = null; // OPTIONAL, as default value for the object is NULL.
		
		if(null == head) {
			head = node;
		} else {
			Node tempNode = head;
			while(null != tempNode) {
				if(node.data <= tempNode.data) {
					if(null == tempNode.left) {
						tempNode.left = node;
						break;
					}else {
						tempNode = tempNode.left;
					}
				} else {
					if(null == tempNode.right) {
						tempNode.right = node;
						break;
					}else {
						tempNode = tempNode.right;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(Node node) {
		if(null == node) {
			return;
		}
		
		inOrderTraversal(node.left);
		System.out.println(node.data);
		inOrderTraversal(node.right);
	}
	
}