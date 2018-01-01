package leetcode_Sum;

import java.util.Arrays;

public class SUM {
	 static int[] twosum (int [] nums , int target){
		 int i = 0 ,j = 0;
		 for (i = 0;i < nums.length;i++){
			 for (j = i+1; j < nums.length ; j++){
				 if (nums[i]+nums[j] == target){
					 return new int[]{ i , j };
				 }
			 }
			 
		 }
		return null;
	 }
	
	
	static boolean check_check(int i ,int j){
		
		boolean ok = true;
		if(i>=5 || j>= 5){
			ok = false;
		}
		return ok;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num [] = {2,7,9,11,13};
		
			
		
		System.out.println(Arrays.toString(twosum(num,22)));
//	
//		int target = 50 ;
//		int j = 0;
//		int flag = 0;
//		int i = 0 ;
//		int count= 1 ;
//		for (j = 0; j < num.length; j++){
//		   for ( i = count ; i < num.length ; i++){
//			 if(num[j]+num[i] == target){
//				flag = 1;
//				break;
//			 }
//		}
//		   if (flag == 1){
//			   break;
//		   }
//		   count = count + 1;
//		   
////		System.out.println(num[i]+ "+"+ num[b]+ "="+ a);
//		}
//		if (check_check(i,j)  ){
//			System.out.println(num[i]+"+"+num[j]);
//		}else
//			System.out.println("not find");
//		
	}

}
