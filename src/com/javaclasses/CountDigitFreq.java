package com.javaclasses;

public class CountDigitFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=-1232334;
		int D=3;
		
		if(n == 0 && D == 0) 
			System.out.println("1"); //number 0 has 1 frequency of 0

		//if a negative number is entered
		if(n < 0) 
			n = -n;

		int counter = 0;
		while(n != 0) {
			int digit = n % 10; //calculate the digit
			if(digit == D) counter++; 
			n = n/10;
		}

		System.out.println("Counter:::"+counter); 
	}

}
