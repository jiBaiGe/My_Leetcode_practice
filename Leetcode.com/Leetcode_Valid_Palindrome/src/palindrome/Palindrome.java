package palindrome;

public class Palindrome {
	
	  public static boolean isPunctuation (char i ) {
		  String s = ",.?':!;";
		  for(int k = 0 ;k < s.length();k++) {
			  if(s.charAt(k) == i) {return true;}
		  }
		  return false;
	  }
	
	  //判断一个句子是否为回文，无视标点
	  public static boolean isPalindrome(String s) {
		  if(s .equals("")) {return true;}
	        StringBuilder mys = new StringBuilder();
	        mys.append(s);
	        for(int i = 0; i < mys.length(); i++) {
	        	if (isPunctuation(mys.charAt(i))) {// 题意为无视标点，所以删除句子中所有标点。
	        		mys.deleteCharAt(i--);   //因为删除标点后字符串下标发生变化，所以删除后i--。      		
	        	}
	          }
	        	String sss = mys.toString();
	        	String ss = mys.reverse().toString();
	        	
	        		if(ss.equals(sss)) {
	        			return true;
	        	}
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder mys = new StringBuilder("abc");
//        
//        for(int i = 0; i < mys.length(); i++) {
//        	if (isPunctuation(mys.charAt(i))) {// 题意为无视标点，所以删除句子中所有标点。
//        		mys.deleteCharAt(i--);   //因为删除标点后字符串下标发生变化，所以删除后i--。
//        		
//        	}
//          }
//        System.out.println(mys.reverse());
		
		System.out.println(isPalindrome("ab"));
	}

}
