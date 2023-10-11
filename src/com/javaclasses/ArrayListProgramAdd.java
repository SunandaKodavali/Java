package com.javaclasses;

import java.util.ArrayList;

public class ArrayListProgramAdd {

	public static void main(String args[]) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>(2);
		arr.add(10);
		arr.add(20);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		//arr.forEach(a->{System.out.println(a);});
		
		//arr.add(1, 30);
		
	//	arr.forEach(a->{System.out.println(a);});
		
		//arr.remove(Integer.valueOf(20));
		
		// arr.set(1, 30);
		
	//	arr.forEach(a->{System.out.println(a);});
		System.out.println(arr.toString());
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int al:arr) {
			
			
			
			if(!(res.contains(al))) {
				res.add(al);
			}
			
			
		}
		System.out.println(res.toString());
	}
}
