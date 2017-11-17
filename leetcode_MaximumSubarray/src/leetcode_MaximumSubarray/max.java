package leetcode_MaximumSubarray;

public class max {
	
	 public static int maxSubArray(int[] nums) {
		 int current = 0,previous = 0, max = nums[0];
		 if (nums.length == 1) {max = nums[0];}
		 if (nums.length == 2) {
			 if (nums[0]>nums[1]) {max = nums[0] ;}else {max = nums[1];}
			 }
		 for (int i = 0;i < nums.length-1;i++) {
			 if (nums[i] > max) {max = nums[i];}
			 previous = nums[i] + nums[i+1];
			 if (previous > max) {max = previous;}
			 for(int j =i+2;j<nums.length;j++) {
				 
			 current = previous + nums[j];
			 previous = current;
			 if (current > max) {max = current;}
			 }
			 
		 }
		 if (nums[nums.length-1] > max) {max = nums[nums.length-1];}
         return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3,-2,-1,-5,1,-4,-1};
		System.out.println(maxSubArray(arr));

	}

}
