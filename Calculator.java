package com;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter\n1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		int choice;
		choice= scan.nextInt();
		System.out.println("Enter 2 Digits");
		int a = scan.nextInt();
		int b= scan.nextInt();

		switch (choice) {
		case 1 :
			System.out.println(a + "+" + b + "="+ (a+b));
			break;
			
		case 2 :
			System.out.println(a + "-" + b + "="+ (a-b));
			break;
		case 3 :
			System.out.println(a + "*" + b + "="+ (a*b));
			break;
		case 4 :
			System.out.println(a + "/" + b + "="+ (a/b));
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
