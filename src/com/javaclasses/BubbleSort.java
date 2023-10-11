package com.javaclasses;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {6, 2, 5, 3, 1};
		
		int n=arr.length-1;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
