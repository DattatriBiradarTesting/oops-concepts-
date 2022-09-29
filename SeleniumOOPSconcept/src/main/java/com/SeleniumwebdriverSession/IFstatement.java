package com.SeleniumwebdriverSession;

public class IFstatement {

	public static void main(String[] args) {

		int age = 16;
		if (age >= 18) {
			System.out.println(age + " is a major age");
		} else {
			System.out.println(age + " is a  minor age");
		}
// if else if ladder
		System.out.println("----------------------------------------");
		int marks = 50;
		if (marks == 35) {
			System.out.println(marks + " is a just pass ");
		} else if (marks > 35 && marks < 90) {
			System.out.println(marks + " is a good marks");
		} else if (marks >= 90) {
			System.out.println(marks + " is a merit marks");
		} else {
			System.out.println(marks + " is a fail marks ");
		}

	}
}