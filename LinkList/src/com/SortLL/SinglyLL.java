package com.SortLL;

import java.util.Scanner;

public class SinglyLL {

    private Node head;
    Scanner sc = new Scanner(System.in);

    public SinglyLL() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node newNode) {
        this.head = newNode;
    }

    public Node createNode() {
        Node newNode = new Node();
        System.out.print("Enter value of node: ");
        int data = sc.nextInt();
        newNode.setData(data);
        newNode.setNext(null);
        return newNode;
    }

    public void addAtStart() {
        Node newNode = createNode();
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    // ✅ Simple Selection Sort (compare and swap data directly)
    public void selectionSortLL() {
        if (head == null || head.getNext() == null) {
            System.out.println("List too short to sort.");
            return;
        }

        Node i, j;
        for (i = head; i != null; i = i.getNext()) {
            for (j = i.getNext(); j != null; j = j.getNext()) {
                if (i.getData() > j.getData()) {
                    // swap data
                    int temp = i.getData();
                    i.setData(j.getData());
                    j.setData(temp);
                }
            }
        }

        System.out.println("Linked List sorted successfully!");
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty...");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
}
