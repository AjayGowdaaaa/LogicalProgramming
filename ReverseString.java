package com;

public class ReverseString {

	public static void main(String[] args) {
		String s = "aja";
		String s2= "";


		//TO Reverse A aString
		for (int i =s.length()-1; i>=0; i--){
			s2=s2+s.charAt(i);
		}
		System.out.println("Reversing a String = "+s2);
		if (s.equals(s2)) {
			System.out.println("Its a Palindrone");
		} else {
			System.out.println("its not a palintrone");
		}

	}
	
}
