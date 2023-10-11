package com.javaclasses;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstring l=new LongestSubstring();
		System.out.println(l.lengthOfLongestSubstring("abcbc"));
	}
	public int lengthOfLongestSubstring(String str) {
	    
	      int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    
	    while (j < str.length()) {
	        if(!set.contains(str.charAt(j))) {
	        	set.add(str.charAt(j++));
	        	System.out.println("after add::::::::"+set.toString());
	        	max=Math.max(max, set.size());
	        }else {
	        	System.out.println("before remove:::::::"+set.toString());
	        	set.remove(str.charAt(i++));
	        	System.out.println("after remove:::::::"+set.toString());
	        }
	    }
	    
	    return max;
	    }
}
