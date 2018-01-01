package reverse_int;

//import java.util.Arrays;

public class reverse {
	public static int reverse1 (int x){
       int y = 0;
        int newy = 0;
        while(x != 0){     
         y = x % 10;
         int over = newy;
        newy = (newy * 10) + y;
        if ((newy - y) / 10 != over)
        {return 0;}
        x = x / 10;
        }
        return newy;
		
//		int wei = 1,test = 10;
//		long y = 0,num = 0, k = 0;
//		int flag = 0 ;
//		if (x < 0){
//			x = 0 - x;
//			flag = 1;
//		}
//		String s = String.valueOf(x);
//		
//		wei = s.length();
//		
//	    test = 10;
//	    while (wei >= 1){
//	         num = x % 10;
//	         k = num * (int)Math.pow(10,  (wei-1) );
//	         y = y + k;
//	    
//	         test = test * 10 ;
//	         wei = wei - 1;
//	         x = x / 10;
//	      
//	      }
//		if (flag == 1){
//			y = 0 - y;
//		}
//		
//	if (y<2147483647 && y > -2147483647){
//		return (int)y;
//	}
//		
//			return 0;

	}
	
	
	public static void main(String[] args) {
		
		System.out.println(reverse1(-2147447412) );
		
		
		
	}
}
