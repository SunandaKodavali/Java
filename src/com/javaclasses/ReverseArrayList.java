package com.javaclasses;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseArrayList {

	public static void main(String args[]) {
		
		LinkedList<String> list = new LinkedList<String>();
		  
        // Use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
  
        // Displaying the linkedlist
        System.out.println("LinkedList:" + list);
          
        // Setting the ListIterator at a specified position
        ListIterator<String> list_Iter = list.listIterator();
  
        // Iterating through the created list from the position
        System.out.println("The list is as follows:");
        while(list_Iter.hasNext()){
           System.out.println(list_Iter.next());
        }
		
	}
}
