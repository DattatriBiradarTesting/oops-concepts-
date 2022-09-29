package com.oops.session_7;

public class String_3 {

	public static void main(String[] args) {

		String ss = "WELCOME";

		// subString
		System.out.println(ss.substring(3, 6));
		System.out.println("------");

		// subStrig
		System.out.println(ss.substring(0, 3));
		System.out.println("------");

		String a = "DO YOU KNOW";
		System.out.println(a.substring(3, 6));
		System.out.println("------");

		// Ends With
		System.out.println(a.startsWith("ME", 5));
		System.out.println("------");
		
		System.out.println(a.endsWith("KNOW"));
		
	}

}
