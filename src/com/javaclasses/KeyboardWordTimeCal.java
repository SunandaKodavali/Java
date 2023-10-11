package com.javaclasses;

import java.util.HashMap;
import java.util.Map;

public class KeyboardWordTimeCal {

	public static void main(String[] args) {
		
		
	    String keyboard= "acdbefghijlkmnopqrtsuwvxyz";
	    String word = "dog";
	    
	    if(keyboard == null || keyboard.length()<26 || word == null || word.isEmpty()) {
	    	//return 0
	    }
	    
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
		
	    for(int i=0;i<keyboard.length();i++) {
	    	
	    	map.put(keyboard.charAt(i), i);
	    }
	    
	    
	    int sum=0, prev =0;
	    
	    for(int j=0;j<word.length();j++) {
	    	
	    	int next=map.get(word.charAt(j));
	    	int dis=Math.abs(next-prev);
	    	sum+=dis;
	    	prev=next;
	    }
	    System.out.println(sum);

	}

}
