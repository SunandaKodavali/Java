package com.javaclasses;

import java.util.Arrays;

public class ArrayAddition {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * //Scanner s = new Scanner(System.in); System.out.println(ArrayAddition()); }
	 */

	private static boolean ArrayAddition() {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {5,7,16,1,2};
		boolean result=false;
		Arrays.sort(arr);
		int lastElement = arr[arr.length-1];   //16
		int sum=0;   //arr  1,2,5,7
		
		for(int i=0;i<arr.length-1;i++) {
			sum=sum+arr[i];  //i 1
			System.out.println("Sum inside i loop::::::"+sum);
			
			for(int j=0;j<arr.length-1;j++) {
				
				System.out.println("i value "+i+"and j value"+j);
				if(i!=j) {
					sum=sum+arr[j];
					System.out.println("sum inside i!=j "+sum);
					if(sum==lastElement) {
						System.out.println("j loop true");
					return true;
					}
				}
			}
			for(int k=0;k<arr.length-1;k++) {
				
				System.out.println("i value "+i+"and k value"+k);
				if(i!=k) {
					sum=sum-arr[k];
					System.out.println("sum inside i!=k "+sum);
					if(sum==lastElement) {
						System.out.println("k loop true");
						return true;
					}
				}
			}
			sum=0;
		}
		System.out.println("returns method end false");
		return false;
	}

}
