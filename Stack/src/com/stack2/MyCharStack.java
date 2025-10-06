package com.stack2;

public class MyCharStack {
	
	private int top;
	private int size;
	private char arr[];
	
	public MyCharStack(int size) {
		
		this.top = -1;
		this.size = size;
		this.arr = new char[size];
		
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		return false;
	}
	
	public void push(char val) {
		
		if(!isFull()) {
			top++;
			arr[top] = val;
		}
		else {
			System.out.println("Stack is full...");
		}

		
	}
	
	public char pop() {
		
		char ch = ' ';
		
		if(!isEmpty()) {
			ch = arr[top];
			top--;
		}
		else {
			System.out.println("Stack is empty...");
		}
		
		return ch;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty...");
			return;
		}
		
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
