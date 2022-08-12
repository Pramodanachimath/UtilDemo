package com.trainingg.utilDemo;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
         
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list.size());
		list.add("Pam");
		list.add("Pramod");
		list.set(1, "Guru");
		list.add("Virat");
		list.add(2,"Sachin");
		Collections.sort(list);
		
		System.out.println(list);
		System.out.println(list.size());
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String name=it.next();
			System.out.println("name "+name);
			it.remove();
			
		}
		System.out.println(list);
//		for(String uname:list) {
//			System.out.println("uname "+uname);
//		}
//		System.out.println();
//		
//		ListIterator<String> listIt=list.listIterator(list.size());
//		while(listIt.hasPrevious()) {
//			String username=listIt.previous();
//			System.out.println(username);
//		}
	}

}
