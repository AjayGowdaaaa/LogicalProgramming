package com;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a year");
			int year = scan.nextInt();

			if (year % 4 ==0) {
				if (year % 100==0) {
					if (year%400==0) {
						System.out.println("Its Leap Year");
					} else {
						System.out.println("Not a Leap Year");
					}

				} else {
					System.out.println("Leap Year");
				}
			} else {
				System.out.println(" Not a Leap Year");
			}
		}

	}

}
