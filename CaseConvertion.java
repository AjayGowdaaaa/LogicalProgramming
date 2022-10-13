package com;

public class CaseConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ajay kuamr";
	    String s2= "";
	    for (int i = 0; i <= s1.length()-1; i++) {
			char c = s1.charAt(i);
			c = (char) (c-32);
			s2= s2+c;
		}
	    System.out.println(s2);
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1.endsWith(s1));
		
	}

}
