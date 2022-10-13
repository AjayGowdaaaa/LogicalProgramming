package com;

public class Functions {
	
	
	public static void isPalindrome(int num)
	{
		int n=0, rem=0, res=0;
		n=num;
		while (n!=0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		if (num!=res) {
			System.out.println("Its not  a palindrome");
		} else {
			System.out.println("Its a Plaindrome");
		}
	}
	
	public static void reverseNumber(int n)
	{
		int rem=0, res=0;
		while (n!=0) {
			rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		System.out.println(res);
	}
	
	public static void sumOfDigits(int num) {
		int rem=0, sum=0;
		while (num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
	
	public static void neonNumber(int n) {
		int num=0;
		for (int i = n; i <=n; i++) {
			num= n*i;	
		}
		//System.out.println(num);
		int rem=0, sum=0;
		while (num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		//System.out.println(sum);
		if (sum==n) {
			System.out.println("Its a Neon Number");
		} else {
			System.out.println("Its NOT a Neon Number");

		}
		
	}
	
	
	public static void main(String[] args) {
		// isPalindrome(252);
	//	reverseNumber(123456);
		sumOfDigits(12345);
		//neonNumber(29);
	}
}
