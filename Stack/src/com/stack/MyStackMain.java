package com.stack;

import java.util.Scanner;

public class MyStackMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of stack:");
        int size = sc.nextInt();
        MyStack s = new MyStack(size);

        int choice;
        do {
            System.out.println("\n---------------- Menu ----------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    System.out.println("Data added...");
                    break;

                case 2:
                    int val2 = s.pop();
                    if (val2 != -9999)
                        System.out.println("Popped value: " + val2);
                    break;

                case 3:
                    s.display();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice...");
            }

        } while (choice != 0);

        System.out.println("Program closed...");
        sc.close();
    }
}
