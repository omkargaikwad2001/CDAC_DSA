package com.BinarySearchTree;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	//create node
	public Node createNewNode(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		return newNode;
	}
	
	//get root
	public Node getRoot() {
		if(root!=null) {
			return root;
		}
		System.out.println("Tree is empty...");
		return null;
	}
	
	//add
	public void add(int data) {
		
		Node newNode = createNewNode(data);
		
		Node temp = root;
		
		if(root==null) {
			root = newNode;
		}
		else {
			
			while(true) {
				
				if(newNode.getData()<temp.getData()) {
					
					if(temp.getLeft()==null) {
						temp.setLeft(newNode);
						System.out.println("\tNode added to left of "+temp.getData());
						break;
					}
					else {
						temp = temp.getLeft();
						continue;
					}
					
				}else if(newNode.getData()>temp.getData()){
					
					if(temp.getRight()==null) {
						temp.setRight(newNode);
						System.out.println("\tNode added to right of "+temp.getData());
						break;
					}
					else {
						temp = temp.getRight();
						continue;
					}
					
				}
				else {
					
					System.out.println("Duplicate data not allowed...");
					
				}
				
			}
		}
	}
	
	//preorder
	public void pre_order(Node temp) {
		
		if(temp!=null) {
			System.out.print(temp.getData()+" ");
			pre_order(temp.getLeft());
			pre_order(temp.getRight());
		}
		
	}
	
	//inorder
	public void in_order(Node temp) {
		
		if(temp!=null) {
			pre_order(temp.getLeft());
			System.out.print(temp.getData()+" ");
			pre_order(temp.getRight());
		}
		
	}
	
	//postorder
	public void post_order(Node temp) {
		
		if(temp!=null) {
			pre_order(temp.getLeft());
			pre_order(temp.getRight());
			System.out.print(temp.getData()+" ");
		}
		
	}
	
}
