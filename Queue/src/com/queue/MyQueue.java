package com.queue;

public class MyQueue {
	
	private int size;
	private int rear;
	private int front;
	private int arr[];
	
	public MyQueue() {
		
	}
	
	public MyQueue(int size) {
		this.size=size;
		this.rear=-1;
		this.front=-1;
		this.arr = new int[size];
	}
	
	public void initialize(int size) {
		this.size=size;
		this.rear=-1;
		this.front=-1;
		this.arr = new int[size];
	}
	
	//isFull
	public boolean isFull() {
		if(rear == size-1) {
			return true;
		}
		return false;
	}
	
	//isEmpty
	public boolean isEmpty() {
		if(rear==front) {
			return true;
		}
		return false;
	}
	
	//enQueue
	public void enQueue(int val) {
			
		if(!isFull()) {
			rear++;
			arr[rear]=val;
			System.out.println("Data inserted...");
		}
		else {
			System.out.println("Queue is Full...");
		}
		
	}
	
	//deQueue
	public int deQueue() {
		int val = -9999;
		if(!isEmpty()) {
			front++;
			val = arr[front];
			return val;
		}
		else {
			System.out.println("Queue is empty...");
		}
		
		return -1;
	}
	
	//display
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			return;
		}
		for(int i=front+1;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
