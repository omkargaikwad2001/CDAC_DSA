package com.reverseLL;

public class SinglyLLMain {

    public static void main(String[] args) {

        SinglyLL ll = new SinglyLL();

        // take 5 inputs
        ll.addAtStart();
        ll.addAtStart();
        ll.addAtStart();
        ll.addAtStart();
        ll.addAtStart();
        
        System.out.println("Before reverse LL");
        ll.display();
        
        ll.reverseLL();
        
        System.out.println("After reverse LL");
        ll.display();
    }
}
