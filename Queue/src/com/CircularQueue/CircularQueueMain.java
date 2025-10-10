package com.CircularQueue;

import java.util.Scanner;

public class CircularQueueMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option, size, value;
        CircularQueue q = new CircularQueue();

        do {
            System.out.println("---------- Menu ----------");
            System.out.println("1. InitQueue");
            System.out.println("2. EnQueue");
            System.out.println("3. DeQueue");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter size of queue: ");
                    size = sc.nextInt();
                    q.initQueue(size);
                    break;

                case 2:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    q.enQueue(value);
                    break;

                case 3:
                    value = q.deQueue();
                    if (value != -1)
                        System.out.println("\tDeQueued: " + value);
                    break;

                case 4:
                    System.out.println("--------------------");
                    q.display();
                    System.out.println("--------------------");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (true);
    }
}
