package com.oops_1;

public class Students {

	// instance variables
	String name;
	int rollno;
	// method to insert record

	void inserRecord(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	// method
	void displayInfromation() {
		System.out.println("Name :: " + name);
		System.out.println("Rollno::" + rollno);
	}

/*	
		Students student = new Students();
		Students student1 = new Students();
		student.inserRecord("vinayak", 234);
	
		student1.inserRecord("dattatri", 30);
		student1.inserRecord("mali", 50);

		student.displayInfromation();
		System.out.println("-------------------");
		student1.displayInfromation();*/

		/*
		 * student.name = "vinayak"; student.rollno = 345;
		 * 
		 * student1.name = "biradar"; student1.rollno = 34567;
		 * 
		 * student.displayInfromation(); System.out.println("--------------");
		 * student1.displayInfromation();
		 */
	}

