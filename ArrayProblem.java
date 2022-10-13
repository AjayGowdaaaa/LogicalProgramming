package com;
import java.util.Arrays;

public class ArrayProblem {
	public static void main(String[] args) {
		int a []= {7,5,2,4,1,0,3,6,9};
		int res=0;
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]!=(a[i+1]+1)) {	
				res=a[i]+1;
			}	
		}
		System.out.println(res);
	}

}
