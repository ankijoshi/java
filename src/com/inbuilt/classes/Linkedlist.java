package com.inbuilt.classes;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<Object>();  //argument/generic added
		
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(ll);
		
		System.out.println(ll);
		
		ll.addFirst(88);
		ll.removeLast();
		
		System.out.println(ll.get(0));
		System.out.println(ll);
		
		
		
		

	}

}
