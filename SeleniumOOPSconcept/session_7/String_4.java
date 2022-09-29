package com.oops.session_7;

public class String_4 {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = " Home";
		System.out.println(s1.endsWith(s2));
		System.out.println("----------");
		System.out.println(s2.endsWith(s1));
		System.out.println("----------");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("----------");
		System.out.println(s1.concat("to welcome selenium with java"));
		System.out.println("----------");
		System.out.println("this is new style::" + s1 + s2);
	}

}
