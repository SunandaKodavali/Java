package com.javaclasses;

import java.util.Arrays;

public class QuickSort {
 
	public static void main(String[] args) {
		int[] arr = {5, 9, 2, 11, 14, 6, 3, 8};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void quicksort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(arr!=null && arr.length<=1) {
			return;
		}
		if(start<end) {
		int pi=partition(arr,start,end);
		quicksort(arr,start,pi-1);
		quicksort(arr,pi+1,end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int i=start;
		int pivot=arr[start];
		
		
		for(int j=start+1;j<=end;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,start,i);
		return i;
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}