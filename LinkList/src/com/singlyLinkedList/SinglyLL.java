package com.singlyLinkedList;

import java.util.Scanner;

public class SinglyLL {
	
	private Node head;
	
	Scanner sc = new Scanner(System.in);
	
	public SinglyLL(){
		head= null;
	}
	
	public Node getHead(){
		return head;
	}
	
	public void setHead(Node newNode){
		this.head=newNode;
	}
	
	public Node createNode() {
		
		Node newNode = new Node();
		
		System.out.println("Enter value");
		int data = sc.nextInt();
		newNode.setData(data);
		newNode.setNext(null);
		
		return newNode;
	}
	

	public void addAtStart() {
		
		Node newNode = createNode();
		
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.setNext(head);
			head = newNode;
		}
		
	}
	
	public void addAtEnd() {
		
		Node newNode = createNode();
		Node temp = head;
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			
			temp.setNext(newNode);
			
		}
		
	}
	
	public void display() {
		
		Node temp = head;
		
		if(head == null) {
			System.out.println("Linked list is empty...");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.println("null");
		}
		
	}
	
}
