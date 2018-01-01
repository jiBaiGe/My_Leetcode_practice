package leetcode_strStr;

public class Main {
	
	  public static int  strStr(String haystack, String needle) {
		  int pos = 0;
		  if( haystack.contains(needle) ) {
			  pos = haystack.indexOf(needle);
			  return pos;
		  }
		   return -1;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "cde";
		System.out.println(strStr(s1, s2));

	}

}
