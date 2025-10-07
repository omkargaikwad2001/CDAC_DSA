package com.singlyLLChar;

import java.util.Scanner;

public class MyCharLL {
	
	private MyNode head;
	
	Scanner sc = new Scanner(System.in);
	
	public MyCharLL() {
		
		this.head=null;
		
	}
	
	public MyNode getHead(){
		return head;
	}
	
	public void setHead(MyNode head){
		this.head=head;
	}
	
	//createNode()
	public MyNode creatNode() {
		
		MyNode newNode = new MyNode();
		
		System.out.println("Enter char : ");
		char val = sc.next().charAt(0);
		
		newNode.setData(val);
		newNode.setNext(null);
		
		return newNode;
		
	}
	
	//addAtStart()
	public void addAtStart() {
		
		MyNode newNode = creatNode();
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			newNode.setNext(head);
			head = newNode;
			
		}
		
	}
	
	//addAtEnd()
	public void addAtEnd() {
		
		MyNode newNode = creatNode();
		MyNode temp = head;
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			
			temp.setNext(newNode);
			
		}
		
	}
	
	public void addAtEndAuto(char ch) {
		
		MyNode newNode = new MyNode();
		newNode.setData(ch);
		newNode.setNext(null);
		
		if(head == null) {
			head = newNode;
		}
		else {
			
			MyNode temp = head;
			
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newNode);
			
		}
		
	}
	
	//display()
	public void display() {
		
		MyNode temp = head;
		
		if(head == null) {
			System.out.println("Linked List is empty...");
		}
		else {
			
			while(temp!=null) {
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.println("null");
			
		}
		
	}
	
	
}
