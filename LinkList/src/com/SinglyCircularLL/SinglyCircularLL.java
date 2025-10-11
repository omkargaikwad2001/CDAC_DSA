package com.SinglyCircularLL;

public class SinglyCircularLL {
	
	private Node head;
	
	public SinglyCircularLL() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	//create node
	public Node createNewNode(int data) {
		
		Node newNode = new Node();
		newNode.setData(data);
		
		return newNode;
		
	}
	
	public void display() {
		
		if(head == null) {
			System.out.println("LL is empty...");
		}
		else {
			
			Node temp = head;
			
			do {
				System.out.print(temp.getData()+" ");
				temp = temp.getNext();
			}
			while(temp!=head);
			System.out.println();
			
		}
		
	}
	
	public void addAtLast(int data) {
		
		Node newNode = createNewNode(data);
		
		if(head == null) {
			head = newNode;
			newNode.setNext(head);
		}
		else {
			
			Node temp = head;
			
			while(temp.getNext()!=head) {
				temp=temp.getNext();
			}
			
			newNode.setNext(head);
			temp.setNext(newNode);
			
		}
		
	}
	
	public void addAtFirst(int data) {
		
		Node newNode = createNewNode(data);
		
		if(head == null) {
			head = newNode;
			newNode.setNext(newNode);
		}
		else {
			
			Node temp = head;
			
			while(temp.getNext()!=head) {
				temp=temp.getNext();
			}
			
			newNode.setNext(head);
			head = newNode;
			temp.setNext(head);
			
		}
		
	}
	
	public void addAtPosi(int data,int posi) {
		

		if(head == null || posi<=1) {
			addAtFirst(data);
			return;
		}
		
			Node temp = head;
			
			for(int i=1;i<posi-1;i++) {
				if(temp.getNext()==head) {
					System.out.println("Posi not found...");
					return;
				}
				temp = temp.getNext();
			}
			
			Node newNode = createNewNode(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		
	}
	
	public void deleteFirst() {
		
		if(head == null) {
			System.out.println("LL is empty...");
		}
		else if(head.getNext()==head) {
			head = null;
		}
		else {
			
			Node temp = head;
			
			while(temp.getNext()!=head) {
				temp = temp.getNext();
			}
			
			head = head.getNext();
			temp.setNext(head);
			
		}
		
	}
	
	public void deleteLast() {
		
		if(head == null) {
			System.out.println("LL is empty...");
		}
		else if(head.getNext()==head) {
			head = null;
		}
		else {
			
			Node temp = head;
			
			while(temp.getNext().getNext()!=head) {
				temp = temp.getNext();
			}
			
			temp.setNext(head);
			
		}
		
	}
	
	public void deleteAtPosi(int posi) {

	    if (head == null) {
	        System.out.println("LL is empty...");
	        return;
	    }

	    if (posi <= 0) {
	        System.out.println("Invalid position...");
	        return;
	    }

	    // delete first node
	    if (posi == 1) {
	        deleteFirst();
	        return;
	    }

	    Node temp = head;
	    Node prev = null;

	    for (int i = 1; i < posi; i++) {
	        prev = temp;
	        temp = temp.getNext();

	        // if we looped back to head, position is invalid
	        if (temp == head) {
	            System.out.println("Invalid position...");
	            return;
	        }
	    }

	    // delete node by skipping it
	    prev.setNext(temp.getNext());
	}

	

}
