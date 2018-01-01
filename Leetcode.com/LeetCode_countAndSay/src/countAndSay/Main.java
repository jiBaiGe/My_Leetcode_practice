package countAndSay;

public class Main {
	
	public static String count(String x) {
		String y ="";
		int count =0,times = 1;
		while (count < x.length()) {
			if(count +1<x.length()) {
		while (x.charAt(count) == x.charAt(count+1)) {
			
			count++;
			times++;
			if ( count+1 == x.length() ) {break;}
			}
		}
		y = y + times + x.charAt(count);
		times = 1;
		count++;
		}
		
		
		return y;
	}
	
	  public static String countAndSay(int n) {
		  if (n == 1) {return "1";}
		  String solution = count("1");
		  
		  for (int i = 2;i < n ;i++) {
			  solution = count(solution);
		  }
		   
	      return solution;  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( countAndSay(6));
	}

}
