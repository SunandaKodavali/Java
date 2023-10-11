package com.javaclasses;

import java.util.Stack;

/*if it is left ( then you are pushing it to stack ..if it is ) you are not pushing..
  but you are checking last elemnt of stack ..if it is (  then you pop it to make () balance...
  another case:if first elemnt or after popping stack next element coming from for loop is ) ..
  you are adding it to count ..at the end in while loop you arecounting unbalanced by popping everything out.*/

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RemoveBrackets());
	}

		private static int RemoveBrackets() {
			String input="((()))(((";
			
			char open = '(';
		    int unbalancedCount = 0;
		    Stack<Character> characterStack = new Stack<>();
		    
		    System.out.println("Given Input String Length:"+input.length());
		    
		    for (int i=0;i<input.length();i++) {
		        char ch = input.charAt(i);
		        System.out.println("char at start of for loop:::::"+ch);
		        
		        if (ch == open) {
		        	System.out.println("i value::::::::::::::"+i);
		            characterStack.push(ch);
		            System.out.println("Character Stack Elements after Pushing if it is (:::::::::::::::::"+characterStack.toString());
		        } else {
		        	System.out.println("i value::::::::::::::"+i);
		            if (!characterStack.isEmpty()) {
		                char pop = characterStack.peek();
		                System.out.println("Peek result:::::::::::"+pop);
		                
		                if (pop == '(') {
		                    characterStack.pop();
		                    System.out.println("pop::::::::::::");
		                } 
		                
						/*
						 * else { unbalancedCount++;
						 * System.out.println("unbalancedCount::::::::::::"+unbalancedCount); }
						 */
		                
		                
		            } else {
		            	System.out.println("if first element is ):::");
		            	
		            	unbalancedCount++;
		            }
		        }
		        System.out.println("for loop:::::::::::::::::::::::::"+characterStack.toString());  
		    }
		    while (!characterStack.isEmpty()) {
		    	
		    	System.out.println("While for popping:::::::::::::::::::::::::"+characterStack.toString());
		        characterStack.pop();
		        unbalancedCount++;
		    }
		    return unbalancedCount;
		}
	
}



