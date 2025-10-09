package com.stackLLChar;

public class StackCharLL {
	
	private Node top;
	
	public StackCharLL() {
		top = null;
	}

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}
	
	public Node createNode(char ch) {
		
		Node newNode = new Node();
		newNode.setData(ch);
		newNode.setNext(null);
		
		return newNode;
		
	}
	
	public void push(char ch) {
		
		Node newNode = createNode(ch);
		if(top == null) {
			top = newNode;
		}
		else {
			newNode.setNext(top);
			top = newNode;	
		}
		
	}
	
	
	public void display() {
		
		if(top==null) {
			System.out.println("Stack is empty...");
		}
		
		Node temp = top;
		
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		
	}

}
