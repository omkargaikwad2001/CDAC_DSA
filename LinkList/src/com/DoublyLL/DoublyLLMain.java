package com.DoublyLL;

import java.util.Scanner;

public class DoublyLLMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoublyLL dl = new DoublyLL();
        int choice, data, pos, val;

        do {
            System.out.println("\n====== Doubly Linked List Menu ======");
            System.out.println("1. Add at Start");
            System.out.println("2. Add at End");
            System.out.println("3. Add by Value");
            System.out.println("4. Add by Position");
            System.out.println("5. Delete at Start");
            System.out.println("6. Delete at End");
            System.out.println("7. Delete by Data");
            System.out.println("8. Display");
            System.out.println("9. Display Reverse");
            System.out.println("10. Count Nodes");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at start: ");
                    data = sc.nextInt();
                    dl.addAtStart(data);
                    break;

                case 2:
                    System.out.print("Enter data to insert at end: ");
                    data = sc.nextInt();
                    dl.addAtEnd(data);
                    break;

                case 3:
                    System.out.print("Enter new data: ");
                    data = sc.nextInt();
                    System.out.print("Enter value after which to insert: ");
                    val = sc.nextInt();
                    dl.addByValue(data, val);
                    break;

                case 4:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    dl.addByPosition(data, pos);
                    break;

                case 5:
                    dl.deleteAtStart();
                    break;

                case 6:
                    dl.deleteAtEnd();
                    break;

                case 7:
                    System.out.print("Enter data to delete: ");
                    data = sc.nextInt();
                    dl.deleteByData(data);
                    break;

                case 8:
                    dl.display();
                    break;

                case 9:
                    dl.printRev();
                    break;

                case 10:
                    System.out.println("Total nodes: " + dl.countLength());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again...");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}
