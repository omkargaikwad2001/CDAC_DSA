package com.DoublyLL;

public class DoublyLL {
	
	private Node head;
	
	public DoublyLL() {
		head = null;
	}
	
	//createnode
	public Node createNode(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		newNode.setPrev(null);
		return newNode;
	}
	
	//display
	
	public void display() {
		
		if(head == null) {
			System.out.println("LL is empty...");
			return;
		}
		
		Node temp = head;
		
		System.out.print("null<->");
		while(temp!=null) {
			System.out.print(temp.getData()+"<->");
			temp = temp.getNext();
		}
		System.out.println("null");
		
	}
	
	
	//add at start
	public void addAtStart(int data) {
		
		Node newNode = createNode(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
		}
		
	}
	
	//add at end
	public void addAtEnd(int data) {

		Node newNode = createNode(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			Node temp = head;
			
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			
			temp.setNext(newNode);
			newNode.setPrev(temp);
		}
		
	}
	
	//add at mid by data
	public void addByValue(int data,int val) {

		Node newNode = createNode(data);
		
		if(head == null) {
			head = newNode;
		}
		else{
			
			Node temp = head;
			
			while(temp!=null && temp.getData()!=val) {
				temp=temp.getNext();
			}
			
			if(temp==null) {				
				System.out.println(val+" not in LL");
				return;
			}
			
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);

			if(temp.getNext()!=null) {				
				temp.getNext().setPrev(newNode);
			}
			
			temp.setNext(newNode);
			
		}
	}
	
	//count
	
	public int countLength() {
		
		Node temp = head;
		
		int count = 0;
		
		while(temp!=null) {
			temp = temp.getNext();
			count++;
		}
		
		return count;
	}
	
	//add by position
	public void addByPosition(int data,int posi) {
		
		Node newNode = createNode(data);
		int len = countLength();
		
		if(head == null) {
			head = newNode;
		}
		else if(head.getPrev()==null && posi == 1) {
			addAtStart(data);
		}
		else if(posi>len) {
			addAtEnd(data);
		}
		else if(posi>1 && posi<=len){
			
			Node temp = head;
			
			for(int i=1;i<posi-1;i++) {
				temp = temp.getNext();
			}
			
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);

			if(temp.getNext()!=null) {				
				temp.getNext().setPrev(newNode);
			}
			temp.setNext(newNode);
			
		}
		
	}
	
	//delete at start
	public void deleteAtStart() {
		
		if(head == null) {
			System.out.println("LL is empty...");
		}
		else if(head.getNext()==null){
			head = null;
		}
		else {
			
			head = head.getNext();
			head.getPrev().setNext(null);
			head.setPrev(null);
			
		}
		
	}
	
	//delete at end
	public void deleteAtEnd() {
	    if (head == null) {
	        System.out.println("LL is empty...");
	        return;
	    }
	    if (head.getNext() == null) { // only one node
	        head = null;
	        return;
	    }

	    Node temp = head;
	    // move temp to second-last node
	    while (temp.getNext().getNext() != null) {
	        temp = temp.getNext();
	    }

	    Node last = temp.getNext(); // the last node
	    temp.setNext(null);         // unlink last from list
	    last.setPrev(null);         // fully detach last (optional but clean)
	}

	
	//delete at mid by data
	public void deleteByData(int data) {
		
		int len = countLength();
		
		if(head == null) {
			System.out.println("LL is empty...");
		}
		else{
			
			Node temp = head;
			
			while(temp.getNext()!=null && temp.getData()!=data) {
				temp = temp.getNext();
			}
			
			if(temp.getData()==data) {
//				System.out.println(temp.getData());
				
				if(temp.getPrev()==null) {
					
					head = head.getNext();
					head.getPrev().setNext(null);
					
				}
				
				else if(temp.getNext()==null) {
					
					temp.getPrev().setNext(null);
					temp.setPrev(null);
					
				}
				
				else {
					
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
					
					temp.setNext(null);
					temp.setPrev(null);
				}
				
				
			}
			else {				
				System.out.println("Data not found");
			}
			
		}
		
	}
	
	
	//print rev
	public void printRev() {
		
		if(head == null) {
			System.out.println("LL is empty...");
		}
		else {
			
			Node temp = head;
			
			while(temp.getNext()!=null) {
//				System.out.println(temp.getData());
				temp=temp.getNext();
			}
			
			System.out.println("Reverse LL");
			System.out.print("null<->");
			while(temp!=null) {
				System.out.print(temp.getData()+"<->");
				temp= temp.getPrev();
			}
			System.out.println("null");
			
		}
		
	}
	
}
