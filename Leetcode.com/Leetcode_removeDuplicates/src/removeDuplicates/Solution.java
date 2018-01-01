package removeDuplicates;

import java.util.HashSet;

class Array {

    
}


public class Solution {
	
	public static int removeDuplicates(int[] nums) {
		int count = 0;
		HashSet<Integer> con = new HashSet<Integer>();
		
		for (int i = 0; i <nums.length ; i++) {
			con.add(nums[i]);
		}
		count = con.size();
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int [] {1,1,2};
		
		System.out.println(removeDuplicates(a));
		
	}

}
