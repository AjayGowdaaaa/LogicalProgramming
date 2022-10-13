package com;
import java.util.Arrays;

public class SoftSuave {

	static int minLoss(int price[]) {
		int size = price.length*price.length;
		int loss []= new int [size];
		int count=0, result=0;
		for (int i = 0; i <=price.length-1; i++) {
			for (int j = 0; j <=price.length-1; j++) {
				loss[count]= price[i]-price[j];
				count++;
			}
		}
		Arrays.sort(loss);
		for (int i = 0; i < loss.length-1; i++) {
			if (loss[i]>0) {
				result=loss[i];
				break;
			}		
		}
		return	result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[]= {10,2,5,8,10,9};
		int res= minLoss(price);
		System.out.println(res);

	}

}
