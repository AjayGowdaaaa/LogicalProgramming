package Array;

import java.util.Iterator;

public class RevAray {

	public int[] reverse3(int[] nums) {
		int[] rev= new int [3];
		int l=0;
		for (int i =nums.length-1 ; i>=0; i--) {
			rev[l]= nums[i]; 
			l++;
		}
		return rev;
	}

	static int nums[] = {1, 1, 1, 1};
	public static int sum2(int[] nums) {
		int res=0;
		if (nums.length>1) {
			res=nums[0]+nums[1];
		}
		else {
			res=nums[0];

		}

		return res;
	}

	//middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	//middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]


	public int[] middleWay(int[] a, int[] b) {
		int[] res= new int [2];
		res[0]=a[1];
		res[0]=b[1];
		return res;
	}
	//makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
	public int[] makeLast(int[] nums) {
		int[] res= new int [nums.length*2];
		res[res.length-1]= nums[nums.length-1];
		return res;
	}
	
	public boolean double23(int[] nums) {
		if (nums.length<2) {
			return false;
		}
	else if (nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3 ) {
			return true;
		}else {
			return false;
		}
	}
	
	

//fix23([1, 2, 3]) → [1, 2, 0]
//fix23([2, 3, 5]) → [2, 0, 5]
//fix23([1, 2, 1]) → [1, 2, 1]
	public int[] fix23(int[] nums) {
		int[] res= new int [3];
		if (nums[0]==2 && nums[1]==3) {
			res[0]=2 ; res[1]=0; res[2]=nums[3];
		}else if (nums[1]==2 && nums[2]==3) {
			res[0]=nums[0]; res[1]=2 ; res[2]=0;
		}else {
			res[0]=nums[0]; res[1]=nums[1]; res[2]=nums[2];
		}
		 return res; 
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//				int nums []= {1,2,3};
		//				int[] large= new int [3];
		//				int l=0;
		//				for (int i =nums.length-1 ; i>=0; i--) {
		//					if (nums[0]>nums[2]) {
		//						large[l]= nums[0]; 
		//					}else {
		//						large[l]= nums[2]; 
		//					}
		//					l++;
		//				}
		System.out.println(sum2(nums));

	}

}
