package com.stacklinkedlist;

public class Node {
	
	private int Data;
	private Node next;
	
	public Node() {
		Data = 0;
		next = null;
	}

	public int getData() {
		return Data;
	}

	public void setData(int data) {
		Data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
