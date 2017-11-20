package leetcode_PalindromeNum;

public class isPalindrome {
	public static boolean isPalindrome1(int x) {
		
	    if (x < 0) return false;

	    int p = x; 
	    int q = 0; 
	    
	    while (p >= 10){
	        q *=10; 
	        q += p%10; 
	        p /=10; 
	    }
	    
	    return q == x / 10 && p == x % 10;
//		int wei = 0 ,a = 0 , b = 0 ;
//		long y = x;
//		
//        if (x < 0 )        	
//        {return false;}
//        
//        else {
//        	for (wei = 0 ;y >= 1 ;wei ++ ){y = y/ 10;} //count wei ,the digits of the x;
//        	System.out.println(wei);	
//        	
//        	while (wei > 0){	
//        	a = x / (int)Math.pow(10,(wei-1) );
//        	b = x % 10;
//        	if (a != b ){ return false;}
//        	x = x % (int)Math.pow(10,(wei-1) );// cut the head
//        	x = x / 10;                        // cut the tail
//        	wei = wei - 2;
//        	}
//        }
//        
//        return true;
        
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome1(12211));
	}

}
