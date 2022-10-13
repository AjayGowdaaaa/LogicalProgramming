package com;

public class fibono {
	public static void main(String[] args) {
		//int n1 = 0, n2 = 1 , n3 =1;
//		for(int i=0; n3<=100;i++)
//		{
//			n3= n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//		}
		
		int n1=0, n2=1, n3=1;
		for(int i =0; n3<10;i++) {
			n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

}
