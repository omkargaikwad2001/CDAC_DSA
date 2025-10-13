package com.insertionSort;

import java.util.Scanner;

public class InsertionSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion Sort Logic
        int i,j,small;
        for (i = 1; i < n; i++) {
            
        		small = arr[i];
            
        		for(j = i-1; j>-1 && arr[j]>small; j--) {
        			arr[j+1] = arr[j];
        		}
        		
        		arr[j+1] = small;
            
        }

        System.out.println("\nSorted Array (Ascending Order):");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}
