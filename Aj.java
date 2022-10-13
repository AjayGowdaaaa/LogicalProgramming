package com;

public class Aj {
	static int i=0,s=0,p=0,r =0;

	static int sample (int n) {
		while (n>0) {
			 r=n%10;
			p=8^i;
			s=s+p*r;
			i++;
			n=n/10;
		}
		return s;
	}

	public static void main(String[] args) {


		int a = sample(127);
		System.out.println(a);
	}

}
