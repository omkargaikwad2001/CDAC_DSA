package com.DynamicQueueUsingLL;

public class DyQueueLL {
	
	private Node front;
	private Node rear;
	
	public DyQueueLL(){
		front = null;
		rear = null;
	}
	
	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}
	
	//createNode()
	public Node createNode(int n) {
		
		Node newNode = new Node();
		
		newNode.setData(n);
		newNode.setNext(null);
		
		return newNode;
		
	}
	
	//enQueue()
	public void enqueue(int n) {
		
		Node newNode = createNode(n);
		if(front==null || rear == null) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.setNext(newNode);
			rear = newNode;
		}
		
	}
	
	//deQueue()
	public int deQueue() {
		
		int val =-1;
		if(front == null || rear == null) {
			System.out.println("Queue is empty...");
			return -1;
		}
		else {
			Node temp = front;
			val = temp.getData();
			front = front.getNext();
			temp.setNext(null);
			return val;
		}
		
	}
	
	
	//display()
	public void display() {
		
		if(front == null || rear == null) {
			System.out.println("Queue is empty...");
			return;
		}
		
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
		
	}
}
