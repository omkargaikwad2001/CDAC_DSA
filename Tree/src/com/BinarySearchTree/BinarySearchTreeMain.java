package com.BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        BinarySearchTree bt = new BinarySearchTree();
//        int choice, data;
//
//        do {
//            System.out.println("\n==== Binary Search Tree Menu ====");
//            System.out.println("1. Add Node");
//            System.out.println("2. Preorder Traversal");
//            System.out.println("3. Inorder Traversal");
//            System.out.println("4. Postorder Traversal");
//            System.out.println("5. Get degree of all nodes");
//            System.out.println("6. Delete node");
//            System.out.println("0. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter data to insert: ");
//                    data = sc.nextInt();
//                    bt.add(data);
//                    break;
//
//                case 2:
//                    System.out.print("Preorder Traversal: ");
//                    bt.pre_order(bt.getRoot());
//                    System.out.println();
//                    break;
//
//                case 3:
//                    System.out.print("Inorder Traversal: ");
//                    bt.in_order(bt.getRoot());
//                    System.out.println();
//                    break;
//
//                case 4:
//                    System.out.print("Postorder Traversal: ");
//                    bt.post_order(bt.getRoot());
//                    System.out.println();
//                    break;
//
//                case 5:
//                		bt.degreeOfNode(bt.getRoot());
//                		break;
//                		
//                case 6:
//                    System.out.print("Enter data to delete: ");
//                    data = sc.nextInt();
//                		bt.deleteNode(data);
//                		break;
//                    
//                case 0:
//                    System.out.println("Exiting program...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice! Please try again.");
//            }
//
//        } while (choice != 5);
//
//        sc.close();
    	
      BinarySearchTree bt = new BinarySearchTree();
      bt.add(50);
      bt.add(30);
      bt.add(70);
      bt.add(20);
      bt.add(40);
      bt.add(60);
      bt.add(80);
      
//      bt.pre_order(bt.getRoot());
      
//      bt.deleteNode(30);
      
//      bt.pre_order(bt.getRoot());
      bt.degreeOfNode(bt.getRoot());
    	
    }
}
