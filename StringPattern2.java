package String;

import java.util.Iterator;
import java.util.Scanner;

public class StringPattern2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		System.out.println("enter a pattern");
		String p = scan.nextLine();
		int c=0;
		for (int i = 0; i < args.length; i++) {
			String s1="";
			for (int j = 0; j <i+s.length(); j++) {
				s1+=s.charAt(j);
			}
			if(s1.equals(p)) {c++;}
			
			
		}
		System.out.println(c);
	}
}
