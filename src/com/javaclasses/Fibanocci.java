package com.javaclasses;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=0;
		int b=1;
		int c=0;
	// Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();
		int n=5;
		if(n<-1) {
			System.out.println("Value should not be negative");
		}
		
		if(n==0) {
			System.out.println(a);
		}
		else if(n==1) {
			System.out.println(b);
		}
		else {
		for(int i=2;i<=n;i++) {
			
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		}
	}

}
