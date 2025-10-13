package com.BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinarySearchTree bt = new BinarySearchTree();
        int choice, data;

        do {
            System.out.println("\n==== Binary Search Tree Menu ====");
            System.out.println("1. Add Node");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Inorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    bt.add(data);
                    break;

                case 2:
                    System.out.print("Preorder Traversal: ");
                    bt.pre_order(bt.getRoot());
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Inorder Traversal: ");
                    bt.in_order(bt.getRoot());
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Postorder Traversal: ");
                    bt.post_order(bt.getRoot());
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
