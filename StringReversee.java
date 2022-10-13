package com;

public class StringReversee {

	public static void main(String[] args) {
		String name = "Ajay Kumar";
		String n2="";
		System.out.println("=============");
		for (int i = name.length()-1; i>=0; i--) {
			n2=n2+name.charAt(i);
		}
		System.out.println(n2);

	}

}
