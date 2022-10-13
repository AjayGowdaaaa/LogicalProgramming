package com;

import java.util.Scanner;

public class PatternD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a number");
			int n =  s.nextInt();
			
			//Type 
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if (i<j) {
						System.out.print(" * ");
					} else {
						System.out.print("   ");
					}
				}
				System.out.println();
			}
		}
	}

}
