package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrone {
	public static void main(String[] args) {
//		int n1 = 12345;
//		int n2= n1;
//		int rem=0, res=0;
//		while (n2!=0) {
//			rem= n2%10;
//			n2= n2/10;
//			res=(res*10)+rem;
//		}
//		System.out.println(res);
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a Number to check its palindrome or not");
			try {
				int a= s.nextInt();
				int b= a;
				int res=0;int rem=0;
				
				while(b!=0)
				{
					rem=b%10;
					b=b/10;
					res=(res*10)+rem;
					
				}
				if (res==a) {
					System.out.println("Its Plaindrome");
				} else {
					System.out.println("Its Not A Palindrome");
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Enter an Integer number");
				break;
			}
			
			
			
		}
		
		
	}

}
