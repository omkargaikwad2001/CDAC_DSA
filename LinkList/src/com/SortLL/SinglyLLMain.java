package com.SortLL;

public class SinglyLLMain {

    public static void main(String[] args) {

        SinglyLL ll = new SinglyLL();

        // take 5 inputs
        ll.addAtStart();
        ll.addAtStart();
        ll.addAtStart();
        ll.addAtStart();
        ll.addAtStart();

        System.out.println("\nBefore Sorting:");
        ll.display();

        ll.selectionSortLL();

        System.out.println("\nAfter Sorting:");
        ll.display();
    }
}
