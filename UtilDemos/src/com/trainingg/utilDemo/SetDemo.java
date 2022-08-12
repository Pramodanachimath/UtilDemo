package com.trainingg.utilDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		 Set<String> hashSet=new HashSet<>();
		 System.out.println("Size "+hashSet.size());
		 hashSet.add("Priya");
		 hashSet.add("Sri");
		 hashSet.add("Priya");
		 hashSet.add("Joe");
		 hashSet.add(null);
		 hashSet.add("Kelly");
		 System.out.println(hashSet);
		 System.out.println("Size "+hashSet.size());
		 System.out.println();
		 
		hashSet=new LinkedHashSet<>();
		 System.out.println("Size "+hashSet.size());
		 hashSet.add("Priya");
		 hashSet.add("Sri");
		 hashSet.add("Priya");
		 hashSet.add("Joe");
		 hashSet.add(null);
		 hashSet.add("Kelly");
		 System.out.println(hashSet);
		 System.out.println("Size "+hashSet.size());
		 System.out.println();
		
		      
		 hashSet=new TreeSet<>();
		 System.out.println("Size "+hashSet.size());
			 hashSet.add("Priya");
			 hashSet.add("Sri");
			 hashSet.add("Priya");
			 hashSet.add("10");
			 hashSet.add("Joe");
			 hashSet.add("priya");
			// hashSet.add(null);
			 hashSet.add("Kelly");
			 System.out.println(hashSet);
			 System.out.println("Size "+hashSet.size());
			 System.out.println();
		
	}

}
