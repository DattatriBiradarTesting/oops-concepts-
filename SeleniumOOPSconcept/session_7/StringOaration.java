package com.oops.session_7;

public class StringOaration {

	public static void main(String[] args) {

		String s = "Hello Dear";
//CharAt method
		System.out.println(s.charAt(6));
		System.out.println("_____");

		// length()
		System.out.println(s.length());
		System.out.println("_____");

		// toLowerCase
		System.out.println(s.toLowerCase());
		System.out.println("_____");

		// toUpperCase
		System.out.println(s.toUpperCase());
		System.out.println("_____");

		// replace method()
		System.out.println(s.replace("p", "r"));
		System.out.println("_____");

		// replace method()
		System.out.println(s.replace("Dear", "Selenium"));
		System.out.println("_____");

		// indexOf()
		System.out.println(s.indexOf('r'));

	}

}
