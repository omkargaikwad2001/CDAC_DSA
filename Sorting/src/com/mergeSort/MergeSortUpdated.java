package com.mergeSort;

public class MergeSortUpdated {

	public static void Merge(int arr[],int low,int mid,int high) {
		
		int temp[] = new int[high-low+1];
		
		int left = low;
		int right = mid+1;
		int k=0;
		while(left<=mid && right<=high) {
				
			if(arr[left]<=arr[right]) {
				temp[k++] = arr[left++];
			}
			else {
				temp[k++] = arr[right++];
			}
			
		}
		
		while(left<=mid) {
			temp[k++] = arr[left++];
		}
		
		while(right<=high) {
			temp[k++] = arr[right++];
		}
		
		for (int i = 0; i < temp.length; i++) {
		    arr[low + i] = temp[i];
		}

		
	}
	
	public static void MergeSort(int arr[], int low,int high) {
		if(low>=high) return ;
		int mid = (low+high)/2;
		MergeSort(arr, low, mid);
		MergeSort(arr, mid+1, high);
		Merge(arr,low,mid,high);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,1,2,4,1,5,2,6,4};
		System.out.println("Before sort...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		MergeSort(arr, 0, arr.length-1);
		
		System.out.println("After sort...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
