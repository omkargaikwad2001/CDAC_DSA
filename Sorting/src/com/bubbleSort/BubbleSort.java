package com.bubbleSort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to sort?");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" element of array");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before swapping");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int totalNoOfSwapping=0;
		int numberOfPasses=0;
		
		for(int i=0;i<n;i++) {
				
			for(int j=0;j<n-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					totalNoOfSwapping++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			numberOfPasses++;
			System.out.println("\nAfter "+(i+1)+" pass");
			for(int k=0;k<n;k++) {
				System.out.print(arr[k]+" ");
			}
		}
		
		System.out.println("\nAfter swapping");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("Total number of swapping = "+totalNoOfSwapping);
		System.out.println("Total number of passes = "+numberOfPasses);
		sc.close();

	}

}
