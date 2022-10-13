package com;

public class Swaping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=  10;
		int b=20;
		System.out.println("Before Swapping\na = "+a+" b = "+b);
		//Using Temporary Variable
//				Integer t=0;
//				t=a;
//				a=b;
//				b=t;

		//without using Temporary Variable
//				a=a+b;
//				b=a-b;
//				a=a-b;

		//using Nor Operator
//				a=a^b;
//				b=a^b;
//				a=a^b;
		//Single Line Expression
		b=a+b-(a=b);




		System.out.println("Before Swapping\na = "+a+" b = "+b);

	}

}
