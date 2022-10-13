package com;

import java.util.Arrays;

public class CodBat {

	public static void main(String[] args) {
		//[1, 2, 3, 4, 100]) → 3
		//[0, 2, 3, 4, 100]) → 3
		int nums[]= {1, 2, 3, 4, 100};
		 Arrays.sort(nums);
		 int count=0;
		  int res=0;
		  for(int i = 1; i<nums.length-1; i++){
		    res= res+nums[i];
		    count++;
		  }
		  System.out.println(res);
		    int ans = res/count;
		    System.out.println(ans);
	}
}
