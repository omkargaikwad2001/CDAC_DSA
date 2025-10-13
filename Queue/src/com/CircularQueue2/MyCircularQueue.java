package com.CircularQueue2;

public class MyCircularQueue {
	
	private int cap;
	private int currSize;
	private int front;
	private int rear;
	private int[] arr;
	
	public MyCircularQueue(int size) {
		
		cap=size;
		currSize=0;
		front=0;
		rear = -1;
		arr = new int[size];
	}
	
	public void push(int data) {
		
		if(currSize==cap) {
			System.out.println("Queue is full....");
			return;
		}
		
		rear = (rear+1)%cap;
		arr[rear]=data;
		currSize++;
		
	}
	
	public void pop() {
		
		if(currSize==0) {
			System.out.println("Queue is empty...");
			return;
		}
		
		front = (front+1)%cap;
		currSize--;
		
	}
	
	public int front() {
		
		if(currSize==0) {
			System.out.println("Queue is empty...");
			return 0;
		}
		
		return arr[front];
		
	}
	
	public void display() {
	    if (currSize == 0) {
	        System.out.println("Queue is empty...");
	        return;
	    }

	    System.out.print("Queue elements: ");
	    for (int i = 0; i < currSize; i++) {
	        int index = (front + i) % cap;
	        System.out.print(arr[index] + " ");
	    }
	    System.out.println();
	}

	
}
