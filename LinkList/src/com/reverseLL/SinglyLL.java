package com.reverseLL;

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
    
    public void reverseLL() {
    		
    		Node oldhead = head;
    		head = null;
    		
    		while(oldhead!=null) {
    			Node temp = oldhead;
    			oldhead = oldhead.getNext();
    			
    			temp.setNext(head);
    			head = temp;
    		}
    	
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
