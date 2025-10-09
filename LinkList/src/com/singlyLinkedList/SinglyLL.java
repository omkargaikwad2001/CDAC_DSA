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
		
		System.out.println("Enter value of node ");
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
	
	public void addByValue() {
		
		System.out.println("Getting data for addByValue");
		Node newNode = createNode();
		
		System.out.println("Enter number to after add data : ");
		int num = sc.nextInt();
		
		if(head == null) {
			System.out.println("Linked List is empty...");
			return;
		}
		else{
			
			Node temp = head;
			
			while(temp.getData()!=num) {
				temp = temp.getNext();
				if(temp==null) {
					System.out.println("Number is not present...");
					return;
				}
			}
			
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			
		}	
	}
	
	public void deleteFromStart() {
		
		if(head == null) {
			System.err.println("Linked List is empty...");
			return;
		}
		
		Node temp = head;
		head = head.getNext();
		temp=null;
		System.out.println("Front deleted...");
		
	}
	
	public void deleteFromEnd() {
		
		Node temp = head;
		
		if(head == null) {
			System.out.println("Linked List is empty...");
			return;
		}
		
		while(temp.getNext().getNext()!=null) {
			temp = temp.getNext();
		}
		
		temp.setNext(null);
		System.out.println("End node removed...");
		
	}
	
	public void deleteByValue() {
		
		Node temp = head;
		Node tag = head;
		
		if(head == null) {
			System.out.println("Linked list is empty...");
			return;
		}
		
		System.out.println("Enter value to delete");
		int val = sc.nextInt();
		
		if(head.getData()==val) {
			head = null;
			return;
		}
		
		while(temp.getNext()!=null && temp.getData()!=val) {
			tag = temp;
			temp = temp.getNext();
		}	
		
		tag.setNext(temp.getNext());
		temp.setNext(null);
		
		System.out.println("Data deleted...");
		
	}
	
	public void update() {
		
		if(head == null) {
			System.out.println("Linked list is empty...");
			return;
		}
		
		System.out.println("Enter new data value");
		int newVal = sc.nextInt();
		
		System.out.println("Enter the value to replace with");
		int oldVal = sc.nextInt();
		
		Node temp = head;
		
		while(temp.getData()!=oldVal && temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setData(newVal);
		
		System.out.println("Data updated...");
	}
	
	public int getLength() {
		if(head == null) {
			System.out.println("Linked list is empty...");
			return 0;
		}
		Node temp = head;
		int count=0;
		while(temp!=null) {
			temp=temp.getNext();
			count++;
		}
//		System.out.println(count);
		return count;
	}
	
	public void addInPosi() {
		
		if(head == null) {
			System.out.println("Linked list is empty...");
			return;
		}
		
		System.out.println("Enter position to insert data");
		int posi = sc.nextInt();
		int len = getLength();
		
		if(posi>len) {
			System.out.println("Position not in LL...");
			return;
		}
//		Node newNode = new Node();
		
		//at start
		if(posi == 1) {
			addAtStart();
		}
		else if(posi == len) {
			addAtEnd();
		}
		else if(posi>1 && posi<len) {
			
			Node newNode = createNode();
			
			Node temp = head;
			
			for(int i=1;i<posi-1;i++) {
				temp=temp.getNext();
			}
			
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			
			System.out.println("New node added...");
			
		}
		
	}
	
	public void deleteInPosi() {
		
		if(head == null) {
			System.out.println("Linked list is empty...");
			return;
		}
		
		System.out.println("Enter position to Delete data");
		int posi = sc.nextInt();
		int len = getLength();
		
		if(posi>len) {
			System.out.println("Position not in LL...");
			return;
		}
		
		if(posi == 1) {
			deleteFromStart();
		}
		else if(posi == len) {
			deleteFromEnd();
		}
		else if(posi>1 && posi<len) {
			
			Node temp = head;
			Node tag = head;
			
			for(int i =1; i<posi;i++) {
				tag = temp;
				temp=temp.getNext();
			}
			
			tag.setNext(temp.getNext());
			temp.setNext(null);
			
			System.out.println("Node deleted...");
			
		}
		
	}
	
	public void reverse() {
		
		Node prev = head;
		Node curr = head.getNext();
		Node next = null;
		
		if(curr.getNext()!=null) {
			next = curr.getNext();
		}
		
		while(curr!=null) {
			
			curr.setNext(prev);
			prev = curr;
			curr=next;
			if(next!=null) {
				next=next.getNext();
			}
			
		}
		
		head.setNext(null);
		head = prev;
		
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
