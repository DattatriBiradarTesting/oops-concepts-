package com.SeleniumwebdriverSession;

public class InstanceVariales {
	String empNameOne = "vinayak";
	int empIdOne = 12345;
	float empSalaryOne = 123.45f;
	int empPhoneNum = 12345678;
	String empAddresOne = "hyd";
	float empOneShare;

	public static void main(String[] args) {
		InstanceVariales varible = new InstanceVariales();
		System.out.println("Employee name is :: " + varible.empAddresOne);
		System.out.println("Employee Id is :: " + varible.empIdOne);
		System.out.println("Employee Salary is :: " + varible.empSalaryOne);
		System.out.println("Employee Num is :: " + varible.empPhoneNum);
		System.out.println("Employee Addres is :: " + varible.empAddresOne);
		System.out.println("Employee Share is :: " + varible.empOneShare);

	}

}
