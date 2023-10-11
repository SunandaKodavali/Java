package com.javaclasses;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Bored";
		String str2="Robed";
		
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1.length == ch2.length) {
			boolean result=Arrays.equals(ch1, ch2);
			if(result) {
				System.out.println("Anagrams");
			}
		}
	}

}
