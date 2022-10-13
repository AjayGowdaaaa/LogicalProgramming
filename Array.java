package com;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = scan.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+ size +" values for Array");
		for (int i = 0; i <= arr.length-1; i++) {
			arr[i]= scan.nextInt();	
		}
		System.out.println("Number of elements in array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
