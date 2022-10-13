package com;

public class Distinct {

	public static void main(String[] args) {
		int flag=0;
		int arr[]= {1,2,1,3,2,4,5,6,7,1};
		for (int i = 0; i <= arr.length-1; i++) {

			for (int j = 0; j <= arr.length-1; j++) {
				 if (i!=j && arr[i]==arr[j]) {
					 flag=1;
				 }
			}
			if (flag==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
