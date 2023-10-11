package com.javaclasses;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(20);
		/*
		 * Set<Integer> set = new LinkedHashSet<Integer>(); set.addAll(list);
		 * list.clear(); list.addAll(set);
		 */
		
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList.toString());
		
	}
}
