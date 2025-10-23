package com.binarySearch;

public class BinarySearch {

    public static boolean binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int iteration = 0;
        while (low <= high) {
        		
        		iteration++;
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
            		System.out.println("Total iteration = "+iteration);
                return true;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    	int arr[] = {5, 9, 12, 17, 21, 25, 28, 33, 39, 44, 46, 52, 56, 58, 60, 65, 70, 75, 82, 90};

        boolean ans = binarySearch(arr, 21);

        if (ans) {
            System.out.println("Key found...");
        } else {
            System.out.println("Key not found...");
        }
    }
}
