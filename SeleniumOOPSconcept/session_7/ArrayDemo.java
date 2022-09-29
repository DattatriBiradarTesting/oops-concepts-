package com.oops.session_7;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("vinayak");
		list.add("biradar");
		list.add("selenium");
		list.add("java");

		System.out.println(list.size());
		System.out.println("before removing elements:: " + list);
		System.out.println("-----------------------------------");
		list.remove(1);
		System.out.println(list.size());
		System.out.println("After removing elemetes:: " + list.size());

		list.add(0, "core java");
		System.out.println(list.size());
		System.out.println("After adding elemetes:: "+list);
		
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("--------------------");
		for(Object d:list) {
			System.out.println(d);
		}
	}

}
