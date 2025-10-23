package com.hash;

import java.util.Arrays;
import java.util.Scanner;

public class Hashing {

    private int size;
    private int[] hashTable;
    private final int EMPTY = -1; // empty cell marker
    Scanner sc = new Scanner(System.in);

    public Hashing() {
        System.out.print("\nEnter size of hash table: ");
        size = sc.nextInt();
        hashTable = new int[size];
        Arrays.fill(hashTable, EMPTY); // all -1 initially
    }

    // Hash function
    public int hashKey(int value) {
        return value % size;
    }

    // Add value (with linear probing)
    public void add(int value) {
        int key = hashKey(value);

        if (hashTable[key] == EMPTY) {
            hashTable[key] = value;
            System.out.println("\n\tValue inserted successfully!");
            return;
        }

        // Linear probing
        int i = (key + 1) % size;
        while (i != key && hashTable[i] != EMPTY) {
            i = (i + 1) % size;
        }

        if (i == key) {
            System.out.println("\n\tHash table is full!");
        } else {
            hashTable[i] = value;
            System.out.println("\n\tValue inserted successfully!");
        }
    }

    // Search for a value
    public int search(int value) {
        int key = hashKey(value);

        if (hashTable[key] == value) {
            return key;
        }

        int i = (key + 1) % size;
        while (i != key && hashTable[i] != EMPTY && hashTable[i] != value) {
            i = (i + 1) % size;
        }

        if (hashTable[i] == value) {
            return i;
        } else {
            return -1;
        }
    }

    // Delete a value (replace with -1)
    public void delete(int value) {
        int pos = search(value);

        if (pos == -1) {
            System.out.println("\n\tValue not found — cannot delete!");
        } else {
            hashTable[pos] = EMPTY;
            System.out.println("\n\tValue deleted successfully!");
        }
    }

    // Display hash table
    public void display() {
        System.out.println("\nHash Table contents:");
        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "] → " + hashTable[i]);
        }
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashing h = new Hashing();
        int choice;

        do {
            System.out.println("\n--- HASH TABLE MENU ---");
            System.out.println("1. Add value");
            System.out.println("2. Delete value");
            System.out.println("3. Search value");
            System.out.println("4. Display hash table");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int valAdd = sc.nextInt();
                    h.add(valAdd);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int valDel = sc.nextInt();
                    h.delete(valDel);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int valSearch = sc.nextInt();
                    int pos = h.search(valSearch);
                    if (pos == -1)
                        System.out.println("\n\tValue not found!");
                    else
                        System.out.println("\n\tValue found at position: " + pos);
                    break;
                case 4:
                    h.display();
                    break;
                case 5:
                    System.out.println("\nExiting program...");
                    break;
                default:
                    System.out.println("\nInvalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
