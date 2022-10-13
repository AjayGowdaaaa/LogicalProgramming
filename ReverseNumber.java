package com;

import java.util.Iterator;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=123456;
		int rem=0; int res=0;
		while (n!=0) {
			rem=n%10;
			res= (res*10)+ rem;
			n=n/10;	
		}
		System.out.println(res);
		
	}
}
