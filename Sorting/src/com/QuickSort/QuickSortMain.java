package com.QuickSort;

import java.util.Scanner;

public class QuickSortMain {

    private int arr[];
    private int size;
    Scanner sc = new Scanner(System.in);

    public QuickSortMain(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void setArray(int size) {
        this.size = size;
        arr = new int[this.size];
    }

    public void accept() {
        System.out.println("Enter " + size + " random values:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }

    public void display() {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }

    int split(int low, int upper) {
        int pivot = arr[low];
        int i = low + 1;
        int j = upper;

        while (true) {
            while (i <= upper && arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < j) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                break;
            }
        }

        // place pivot at its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    void quickSort(int low, int upper) {
        if (low < upper) {
            int pivot = split(low, upper);
            quickSort(low, pivot - 1);
            quickSort(pivot + 1, upper);
        }
    }

    public static void main(String[] args) {
        QuickSortMain q = new QuickSortMain(5);

        q.accept();

        System.out.println("\nBefore sorting:");
        q.display();

        q.quickSort(0, q.arr.length - 1);

        System.out.println("\nAfter sorting:");
        q.display();
    }
}
