package com.javaclasses;

import java.util.Vector;
// import java.lang.Integer;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		System.out.println("Max Value and Min Value:::::::"+maxValue+"  ,  "+minValue);
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(20);
		v.add(30);
		v.add(5);
		v.add(15);
		
		for(Integer i:v) {
			
			System.out.println("i Value:::::::"+i);			
			if(i>maxValue) {
				System.out.println("max loop;;;;;;;;;;");
				maxValue=i;
			}
			if(i<minValue) {
				minValue=i;
			}
		}
		
		System.out.println("Max Value and Min Value:::::::"+maxValue+"  ,  "+minValue);
	}

}
