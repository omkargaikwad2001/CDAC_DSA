package com.mergeSort;

public class MergeSortMain {

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};

        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        // Copy remaining elements from arr1 (if any)
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        // Copy remaining elements from arr2 (if any)
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        // Display merged array
        System.out.print("Merged Array: ");
        for (int x = 0; x < arr3.length; x++) {
            System.out.print(arr3[x] + " ");
        }
    }
}
