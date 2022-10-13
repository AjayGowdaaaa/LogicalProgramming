package com;

public class RepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n= "ajaykumar";
		int count=0;
		int fcount=0;

		for (int i = 0; i <n.length(); i++) {
			for (int j = 0; j < n.length(); j++) {
				System.out.print(n.charAt(i) + "" + n.charAt(j)+ " ");
			}
			System.out.println();
		}
		//Type code here
		
		for (int i = 0; i <n.length(); i++) {
			for (int j = 0; j < n.length(); j++) {
				if (n.charAt(i)==n.charAt(j)) {
					count++;
				}
				
			}
			if (count>fcount) {
				fcount=count;
				
			}
			fcount=count;	
		}
		System.out.println("\n"+count);

	}

}
