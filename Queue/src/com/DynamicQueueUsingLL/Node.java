package com.DynamicQueueUsingLL;

public class Node {
	
	private Node next;
	private int data;
	
	public Node(){
		
		next = null;
		data = 0;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	

}
