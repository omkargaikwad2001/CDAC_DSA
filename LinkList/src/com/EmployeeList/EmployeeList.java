package com.EmployeeList;

import java.util.Scanner;

public class EmployeeList {
	
	Scanner sc = new Scanner(System.in);
	
	private Node head;
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node createNode(){
		
		Node newNode = new Node();
		
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter employee name");
		String name = sc.nextLine();
		
		System.out.println("Enter employee salary");
		float sal = sc.nextFloat();
		
		Employee e = new Employee(id,name,sal);
		
		newNode.setData(e);
		newNode.setNext(null);
		
		return newNode;
		
	}
	
	public void add() {
	    Node newNode = createNode();

	    // Case 1: Empty list or new node should be at head
	    if (head == null || newNode.getData().getEmpid() < head.getData().getEmpid()) {
	        newNode.setNext(head);
	        head = newNode;
	        return;
	    }

	    // Case 2: Traverse to find correct position
	    Node temp = head;
	    while (temp.getNext() != null && temp.getNext().getData().getEmpid() < newNode.getData().getEmpid()) {
	        temp = temp.getNext();
	    }

	    // Insert node after temp
	    newNode.setNext(temp.getNext());
	    temp.setNext(newNode);
	}

	
	public void display() {
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print("Id : "+temp.getData().getEmpid()+" Name : "+temp.getData().getName()+" Salary : "+temp.getData().getSal()+" -> ");
			temp=temp.getNext();
		}
		System.out.println("null");
		
	}

}
