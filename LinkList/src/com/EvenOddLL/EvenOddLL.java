package com.EvenOddLL;

public class EvenOddLL {
	
	private Node head;
	
	public EvenOddLL() {
		head = null;
	}
	
	//createnode()
	public Node createNode(int val) {
		Node newNode = new Node();
		
		newNode.setData(val);
		newNode.setNext(null);
		
		return newNode;
	}
	
	//add()
	public void add(int val) {
		
		Node newNode = createNode(val);
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			Node temp = head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newNode);
		}
		
	}
	
	public EvenOddLL createEvenLL() {
		
		EvenOddLL evenll = new EvenOddLL();
		
		Node temp = head;
		
		while(temp!=null) {
			if(temp.getData()%2==0) {
				evenll.add(temp.getData());
			}
			temp = temp.getNext();
		}
		
		return evenll;
			
	}
	
	public EvenOddLL createOddLL() {
		
		EvenOddLL oddll = new EvenOddLL();
		
		Node temp = head;
		
		while(temp!=null) {
			
			if((temp.getData()%2)!=0) {
				oddll.add(temp.getData());
			}
			temp = temp.getNext();
		}
		
		return oddll;
	}
	
	//display()
	public void display() {
		
		if(head == null) {
			System.out.println("LL is empty...");
			return;
		}
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.getData()+"->");
			temp = temp.getNext();
		}
		System.out.println("null");
		
	}
	
}
