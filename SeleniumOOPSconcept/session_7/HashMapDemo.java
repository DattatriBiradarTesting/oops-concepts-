package com.oops.session_7;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(001, "vinayak");
		mp.put(002, "Dattatri");
		mp.put(003, "Biradar");
		mp.put(004, "Selenium");
		mp.put(005, "automation");

		System.out.println(mp);

		mp.remove(001);
		System.out.println("After removing :: " + mp);

		for (Map.Entry m : mp.entrySet()) {
			System.out.println(m.getKey() +"     "+ m.getValue());
		}

	}
}
