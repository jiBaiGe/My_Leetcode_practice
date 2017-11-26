package leetcode_romanToInteger;

import java.util.HashMap;

public class roman_to_integer {
	
    public static int romanToInt(String s) {
    	int wei = s.length();
    	int num = 0, lasta = 0;
    	
    	while (wei > 0){
    		
    	char x = s.charAt(wei-1);
    	String ns = String.valueOf(x);
        wei = wei - 1;
    	
    	 HashMap<Integer, String> roman = new HashMap<Integer, String>();
		 roman.put(1, "I");
		 roman.put(5, "V");
		 roman.put(10, "X");
		 roman.put(50, "L");
		 roman.put(100, "C");
		 roman.put(500, "D");
		 roman.put(1000, "M");
    	 
    	     for ( int a  : roman.keySet()){
    		     	 
 			    if (ns.equals ( roman.get(a) ) ){
 				   System.out.println(a);
 				   
 				   if(a >= lasta)
 				   {num = num + a;} else {num = num - a;}
 				   lasta = a;
 				    break;
 			      }
 		    }
    	
    	 
    	}
    	System.out.println(num);
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		romanToInt( "IV");

	}

}
