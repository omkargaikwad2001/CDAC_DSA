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
	
	public void degreeOfNode(Node temp) {
		
		if(temp==null) {
			return;
		}
		
		int degree = 0;
		
		if(temp.getLeft()!=null) degree++;
		if(temp.getRight()!=null) degree++;
		
		System.out.println("Node "+temp.getData()+" degree count = "+degree);
				
		degreeOfNode(temp.getLeft());
		degreeOfNode(temp.getRight());
	}
	
	public void deleteNode(int value)
	{
	    Node temp=root;
	    Node tag=root;
	    
	   if(temp==null)
	   {
		   System.out.println("NULL tree exists...");
	   }
	   else
	   {
		   //search value in tree
		   while(temp!=null)
		   {
			   if(temp.getData()==value)
			   {
				   //node found
				   break;
			   }
			   else if(value < temp.getData()) 
			   {
				   //search for value on LHS of tree
				   tag = temp;
				   temp = temp.getLeft();
			   }
			   else if(value > temp.getData())
			   {
				   //search for value on RHS of tree
				   tag = temp;
				   temp = temp.getRight();
			   }
		   }//while search
		   if(temp==null)
		   {
			   System.out.println("\tNODE NOT FOUND....!!!!");
			   return;
		   }
		   else
		   {
			   //Type 1: leaf node
			   if(temp.getLeft()==null && temp.getRight()==null)
			   {
				   if(tag.getLeft()==temp) //temp is left child of parent
					   tag.setLeft(null);
				   else if(tag.getRight()==temp) //temp is right child of parent
					   tag.setRight(null);
			   }
			   //Type 2: Node have LHS child/sub-tree and no RHS
			   else if(temp.getLeft()!=null && temp.getRight()==null)
			   {
				   if(tag.getLeft()==temp)//temp is left child of parent
					   tag.setLeft(temp.getLeft());
				   else if(tag.getRight()==temp)//temp is right child of parent
					   tag.setRight(temp.getLeft());
			   }
			   //Type 3: Node have RHS child/sub-tree and no LHS
			   else if(temp.getLeft()==null && temp.getRight()!=null)
			   {
				   if(tag.getLeft()==temp)//temp is left child of parent
					   tag.setLeft(temp.getRight());
				   else if(tag.getRight()==temp) //temp is right child of parent
					   tag.setRight(temp.getRight());
			   }
			   //Type 4: Node is parent node for both LHS & RHS child/sub-tree
//			   else if(temp.getLeft()!=null && temp.getRight()!=null)
//			   {
//				   //Step 1:
//				   //connect tag with temp's RHS
//				   if(tag.getLeft()==temp) //temp is left child of parent
//				   {
//					   tag.setLeft(temp.getRight());
//					   //Step 2:
//					   //shift tag to LHS of tag after connecting subtree
//					   tag = tag.getLeft();
//				   }
//				   else if(tag.getRight()==temp)//temp is right child of parent
//				   {
//					   tag.setRight(temp.getRight());
//					   //Step 2:
//					   //shift tag to RHS of tag after connecting subtree
//					   tag = tag.getRight();
//				   }
//				   
//				  
//				   //traverse tag to left-most node of its LHS subtree
//				   while(tag.getLeft()!=null)
//				   {
//					   tag = tag.getLeft();
//				   }
//				   
//				   //Step 3::
//				   //connect tag's LHS with LHS of temp
//				   tag.setLeft(temp.getLeft());				   
//			   }
			   else if (temp.getLeft() != null && temp.getRight() != null) {
				    // Find inorder successor (smallest in right subtree)
				    Node succParent = temp;
				    Node succ = temp.getRight();
				    while (succ.getLeft() != null) {
				        succParent = succ;
				        succ = succ.getLeft();
				    }

				    // Copy successor’s data to current node
				    temp.setData(succ.getData());

				    // Delete the successor node (it has at most one child)
				    if (succParent.getLeft() == succ)
				        succParent.setLeft(succ.getRight());
				    else
				        succParent.setRight(succ.getRight());
				}

			   
			   //d-link temp from its LHS and RHS
			   temp.setLeft(null);
			   temp.setRight(null);
			   
			   System.out.println("\tNode deleted...!!!\n");
		   }//node is found
		   
	   }//else !null tree
		
	}//delete()

	
}
