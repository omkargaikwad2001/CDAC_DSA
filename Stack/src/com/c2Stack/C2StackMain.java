package com.c2Stack;

public class C2StackMain {

	public static void main(String[] args) {
		
		C2Stack stack = new C2Stack(10);

        // Push into stack1
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);

        // Push into stack2
        stack.push2(10);
        stack.push2(9);
        stack.push2(8);

        stack.display1();  // Stack1: 3 2 1
        stack.display2();  // Stack2: 8 9 10

        System.out.println("Pop Stack1: " + stack.pop1()); // 3
        System.out.println("Pop Stack2: " + stack.pop2()); // 8

        stack.display1();  // Stack1: 2 1
        stack.display2();  // Stack2: 9 10
    }
}