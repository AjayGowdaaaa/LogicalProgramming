package com;

public class SwappingTwoNumber {

	public static void main(String[] args) {

		int a =10;
		int b=20;
		int temp=0;
		
//		temp = b;
//		b=a;
//		a=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println(a);
		System.out.println(b);

	}
}
