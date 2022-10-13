package com;

public class LargestAmong3 {
	public static void main(String[] args) {
		int a=23;
		int b = 123;
		int c=234;

//		if (a>b && a>c) {
//			System.out.println("A is greater");			
//		}
//		else if (b>a && b>c) {
//			System.out.println("B is greater");
//		}
//		else {
//			System.out.println("C is greater");
//		}
		
		if (a>b) {
			if (a>c) {
				System.out.println("A is Greater");
			}
			else {
				System.out.println("C is Greater");
			}
		} else {
			System.out.println("C is Greater");

		}
		
	}
}
