package com;

import java.util.Scanner;

public class LargestAmoung3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		int n1=s.nextInt(), n2=s.nextInt(), n3=s.nextInt();

		if (n1>n2 && n1>n3) {
			System.out.println(n1 + " is greater ");
		} else if (n2>n1 && n2>n3) {
			System.out.println(n2 + " is greater ");
		} else {
			System.out.println(n3 + " is greater ");

		}
	}

}
