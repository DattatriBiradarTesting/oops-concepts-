package com.SeleniumwebdriverSession;

public class NestedIFStaement {
	public static void main(String[] args) {

		int age = 16;
		int weight = 55;

		if (age >= 18) {
			if (weight > 50) {
				System.out.println("you are eligibele to donate blood");
			} else {
				System.out.println("you are not elegible to donate blood");

			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}
}
