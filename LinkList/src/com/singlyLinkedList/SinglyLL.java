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
	
	//find max
	public int getMax() {
		
		int max = -9999;
		
		Node temp = head;
		
		if(head == null) {
			System.out.println("Linked list is empty...");
		}
		else {
			while(temp!=null) {
				
				if(temp.getData()>max) {
					max = temp.getData();
				}
				
				temp = temp.getNext();
			}
		}
		return max;
	}
	
	//findOccurrence(int key) if not found return -1
	
	public int findOccurence(int key) {
		
		Node temp = head;
		
		int occ=0;
		
		if(head == null) {
			System.out.println("Linked list is empty...");
		}
		else {
			while(temp!=null) {
				
				if(temp.getData()==key) {
					occ++;
				}
				
				temp = temp.getNext();
			}
		}
		
		return occ;
	}
	
	//deleteDuplicate delete second occurence if exist
	public void deleteDuplicate() {

	    if (head == null) {
	        System.out.println("Linked list is empty...");
	        return;
	    }

	    Node current = head;

	    while (current != null) {
	        Node prev = current;
	        Node runner = current.getNext();

	        while (runner != null) {
	            if (runner.getData() == current.getData()) {
	                // Delete duplicate node
	                prev.setNext(runner.getNext());
	                runner = runner.getNext();
	            } else {
	                prev = runner;
	                runner = runner.getNext();
	            }
	        }

	        current = current.getNext();
	    }

	    System.out.println("All duplicate occurrences deleted, only first occurrences remain.");
	}
	
	// Sort linked list using Insertion Sort (rearrange nodes, not values)
	public void insertionSort() {

	    if (head == null || head.getNext() == null) {
	        System.out.println("Linked list is empty or has only one element...");
	        return;
	    }

	    Node sorted = null;   // new sorted linked list
	    Node current = head;  // current node from original list

	    while (current != null) {
	        Node next = current.getNext(); // store next before re-linking
	        sorted = sortedInsert(sorted, current); // insert current into sorted list
	        current = next;
	    }

	    head = sorted;
	    System.out.println("Linked list sorted using insertion sort...");
	}

	// Helper: inserts a node into the correct sorted position
	private Node sortedInsert(Node sorted, Node newNode) {
	    if (sorted == null || newNode.getData() < sorted.getData()) {
	        newNode.setNext(sorted);
	        sorted = newNode;
	    } else {
	        Node temp = sorted;
	        while (temp.getNext() != null && temp.getNext().getData() < newNode.getData()) {
	            temp = temp.getNext();
	        }
	        newNode.setNext(temp.getNext());
	        temp.setNext(newNode);
	    }
	    return sorted;
	}

	
}
