package com.trainingg.utilDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		  LinkedList<String> list=new LinkedList<>();
		  System.out.println(list.size());
		  list.add("Priya");
		  list.add("Sri");
		  list.set(1,"Mona");
		  list.add(2,"Joe");
		  list.addFirst("Kathy");
		  list.addLast("Lenin");
		  System.out.println(list);
		  System.out.println(list.size());
		  
		  Iterator<String> iterator=list.iterator();
		  while(iterator.hasNext()) {
			  String name=iterator.next();
			  System.out.println("name "+name);
			  System.out.println();
		  }
		  for(String name:list) {
			  System.out.println("name "+name);
		  }
		  System.out.println();
		  ListIterator<String> listit=list.listIterator(list.size());
		  while(listit.hasPrevious()) {
			  String username=listit.previous();
			  System.out.println("uername "+username);
		  }
	}
 
   
}
