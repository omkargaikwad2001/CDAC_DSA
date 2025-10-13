package com.linearSearch;

import java.util.Scanner;

public class LinearSearchMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 Strings:");
        String arr[] = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i + 1) + " string: ");
            arr[i] = sc.nextLine();
        }

        System.out.print("Enter element to search: ");
        String key = sc.nextLine();

        boolean isFound = false;
        int index = -1;

        for (int i = 0; i < 10; i++) {
            if (arr[i].equals(key)) { 
                isFound = true;
                index = i;
                break;
            }
        }

        if (isFound) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println(key + " not found in the array.");
        }

        sc.close();
    }
}
