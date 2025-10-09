package com.validparentheses;

public class MyStack {
	
	private int size;
	private int top;
	private char arr[];
	
	public MyStack(int size) {
		this.size=size;
		this.top=-1;
		arr = new char[size];
		
	}
	
	//isEmpty()
	public boolean isEmpty() {
		
		if(top==-1) {
			return true;
		}
		return false;
		
	}
	
	//isFull()
	public boolean isFull() {
		
		if(top==size-1) {
			return true;
		}
		return false;
		
	}
	
	//push()
	public void push(char ch) {
		
		if(!isFull()) {
			top++;
			arr[top]=ch;
		}
		else {
			System.out.println("Stack is full...");
		}
		
		
	}
	
	//pop()
	
	public char pop() {
		
		char val='\0';
		if(!isEmpty()) {
			val = arr[top];
			top--;
			return val;
		}
		else {
			System.out.println("Stack is empty...");
		}
		return val;
	}
	
	
	//display()
	public void display() {
		
		if(top==-1) {
			System.out.println("Stack is empty...");
			return;
		}
		
		for (int i = top; i >= 0; i--) {
		    System.out.println(arr[i]);
		}

	}
}
