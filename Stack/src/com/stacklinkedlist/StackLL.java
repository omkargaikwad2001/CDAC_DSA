package com.stacklinkedlist;

public class StackLL {
	
	
	private Node top;
	
	public StackLL() {
		top = null;
	}

	public Node gettop() {
		return top;
	}

	public void settop(Node top) {
		this.top = top;
	}
	
	//createNode()
	public Node createNode(int val) {
		
		Node newNode = new Node();
		
		newNode.setData(val);
		newNode.setNext(null);
		
		return newNode;
	}

	public void push(int val) {
		
		Node newNode = createNode(val);
		
		if(top == null) {
			top = newNode;
		}
		else {
			newNode.setNext(top);
			top = newNode;
		}
		
	}
	
	//pop()
	
	public int pop() {
		if(top == null) {
			System.out.println("Stack is empty...");
			return 0;
		}
		
		int val = top.getData();
		top = top.getNext();
		
		return val;
	}
	
	//display()
	
	public void display() {
		
		if(top == null) {
			System.out.println("Stack is Emplty...");
			return;
		}
		
		Node temp = top; 
		
		while(temp!=null) {
			System.out.println("\t"+temp.getData());
			temp = temp.getNext();
		}
		
	}

}
