package com;
import java.util.Scanner;

public class dfemo {
	public static void main(StringReversee[] args) {
		Scanner s= new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n=s.nextInt();
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(i+""+j);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		// Logic here
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (i+j>=n+1) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}

}
