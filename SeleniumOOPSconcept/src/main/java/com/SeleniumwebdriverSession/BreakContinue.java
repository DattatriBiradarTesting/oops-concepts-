package com.SeleniumwebdriverSession;

public class BreakContinue {

	public static void main(String[] args) {
		for(int num=1;num<=10;num++) {
			if(num==5) {
			break;
				
			}
				System.out.println(num);
			}
			System.out.println("**************");
			
			for(int num=1; num<=10; num++) {
				if(num==5) {
					continue;
				}
					System.out.println(num);
				}
			}

			}
