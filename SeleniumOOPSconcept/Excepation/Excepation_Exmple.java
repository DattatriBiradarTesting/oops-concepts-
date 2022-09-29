package com.Excepation;

public class Excepation_Exmple {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progres");
		int a = 100;
try {
		System.out.println(a / 0);
}catch(ArithmeticException e) {
	System.out.println(e);
}
		String s = null;
		try {
		System.out.println(s.length());
		}catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f);
		}
		String b = "abc";
		// int c=Integer.parseInt(b);

		int arr[] = new int[5];
		arr[100] = 100;
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
