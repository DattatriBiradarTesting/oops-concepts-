package com.Excepation;

public class ThrowKeyWord {

	public static void main(String[] args) {
		int age=20;
		if(age<18) {
			throw new ArithmeticException("Not vaild age to register") ;
				
		}else 
			{
				System.out.println("Vaild age");
			}
		
		}
	}

