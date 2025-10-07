package com.singlyLLChar;

public class MyNode {
	
	private char data;
	private MyNode next;
	
	public MyNode() {
		this.data=' ';
		this.next=null;
	}
	
	public char getData(){
		return data;
	}
	
	public void setData(char data){
		this.data=data;
	}
	
	public MyNode getNext(){
		return next;
	}
	
	public void setNext(MyNode next){
		this.next=next;
	}

}
