package com.stack;

public class MyStack {

    private int top;
    private int size;
    private int arr[];

    // initialize
    public MyStack(int size) {
        this.top = -1;
        this.size = size;
        this.arr = new int[this.size];
    }

    // isEmpty()
    public boolean isEmpty() {
    	if(top==-1) {
    		return true;
    	}
    	return false;
    }

    // isFull()
    public boolean isFull() {
        if(top == size-1) {
        	return true;
        }
        return false;
    }

    // push
    public void push(int val) {
        if (!isFull()) {
            top++;
            arr[top] = val;
        } else {
            System.out.println("Stack is full...");
        }
    }

    // pop
    public int pop() {
        int val = -9999;
        if (!isEmpty()) {
            val = arr[top];
            top--;
        } else {
            System.out.println("Stack is empty...");
        }
        return val;
    }

    // display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            return;
        }

        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
