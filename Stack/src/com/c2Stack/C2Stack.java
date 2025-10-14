package com.c2Stack;

public class C2Stack {

    private int size;
    private int arr[];
    private int top1;  // top for stack1
    private int top2;  // top for stack2

    // Constructor
    public C2Stack(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;      // stack1 starts from left
        top2 = size;    // stack2 starts from right
    }

    // ===== Stack1 Methods =====

    public boolean isEmpty1() {
        return top1 == -1;
    }

    public boolean isFull1() {
        return top1 + 1 == top2;  // no space between stacks
    }

    public void push1(int data) {
        if (!isFull1()) {
            top1++;
            arr[top1] = data;
        } else {
            System.out.println("Stack1 is Full...");
        }
    }

    public int pop1() {
        if (isEmpty1()) {
            System.out.println("Stack1 is empty...");
            return Integer.MIN_VALUE;
        }
        return arr[top1--];
    }

    public void display1() {
        if (isEmpty1()) {
            System.out.println("Stack1 is empty...");
            return;
        }
        System.out.print("Stack1: ");
        for (int i = top1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ===== Stack2 Methods =====

    public boolean isEmpty2() {
        return top2 == size;
    }

    public boolean isFull2() {
        return top2 - 1 == top1;  // no space between stacks
    }

    public void push2(int data) {
        if (!isFull2()) {
            top2--;
            arr[top2] = data;
        } else {
            System.out.println("Stack2 is Full...");
        }
    }

    public int pop2() {
        if (isEmpty2()) {
            System.out.println("Stack2 is empty...");
            return Integer.MIN_VALUE;
        }
        return arr[top2++];
    }

    public void display2() {
        if (isEmpty2()) {
            System.out.println("Stack2 is empty...");
            return;
        }
        System.out.print("Stack2: ");
        for (int i = top2; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}