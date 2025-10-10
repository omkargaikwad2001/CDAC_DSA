package com.selectionSort;

import java.util.Scanner;

public class SlectionSort {
	
	public static void selectionSort(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			int small=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[small]) {
					small=j;
				}
			}
			
			if(i!=small) {
				int temp = arr[i];
				arr[i] = arr[small];
				arr[small]=temp;
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element of array ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting Data");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nAfter sorting data...");
		
		selectionSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
