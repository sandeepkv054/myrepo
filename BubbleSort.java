package com.practice.sort;

public class BubbleSort {
	
	public static void bubbleSort(int arr[],int n) {
		
		if(arr ==null)
			return;
		
		for(int lastUnSortedIndex=n-1;lastUnSortedIndex >0 ;lastUnSortedIndex--) {
			
			for(int j=0 ;j<lastUnSortedIndex;j++) {
				if(arr[j] > arr[j+1]) {
					swapValues(arr, j, j+1);
				}
			}
		}
		
	}
	
	public static void swapValues(int arr[],int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		int arr[] = {4000,1341,1291,1222,1129,1120};
		bubbleSort(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
